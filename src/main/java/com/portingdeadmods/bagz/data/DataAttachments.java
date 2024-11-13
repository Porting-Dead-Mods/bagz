package com.portingdeadmods.bagz.data;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.portingdeadmods.bagz.Bagz;
import net.minecraft.client.Minecraft;
import net.minecraft.core.RegistryAccess;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtOps;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.items.ItemStackHandler;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.*;
import java.util.function.Supplier;

public class DataAttachments {

    public static final DeferredRegister<AttachmentType<?>> ATTACHMENTS = DeferredRegister.create(NeoForgeRegistries.ATTACHMENT_TYPES, Bagz.MODID);

    // TODO: Codecs
    public static final Codec<DyeColor> DYE_COLOR_CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.INT.fieldOf("color").forGetter(DyeColor::getId)
    ).apply(instance, DyeColor::byId));
    public static final Codec<ItemStackHandler> ITEM_STACK_HANDLER_CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.INT.fieldOf("size").forGetter(ItemStackHandler::getSlots),
            Codec.list(CompoundTag.CODEC).fieldOf("items").forGetter(handler -> {
                List<CompoundTag> tags = new ArrayList<>();
                for (int i = 0; i < handler.getSlots(); i++) {
                    ItemStack stack = handler.getStackInSlot(i);
                    if (!stack.isEmpty()) {
                        CompoundTag tag = new CompoundTag();
                        tag.putInt("Slot", i);
                        stack.save(Minecraft.getInstance().level.registryAccess(), tag);
                        tags.add(tag);
                    }
                }
                return tags;
            })
    ).apply(instance, (size, items) -> {
        ItemStackHandler handler = new ItemStackHandler(size);
        for (CompoundTag tag : items) {
            int slot = tag.getInt("Slot");
            if (slot >= 0 && slot < size) {
                ItemStack stack = ItemStack.parseOptional(Minecraft.getInstance().level.registryAccess(), tag);
                handler.setStackInSlot(slot, stack);
            }
        }
        return handler;
    }));

    public static final Codec<Map<DyeColor, ItemStackHandler>> BAG_INVENTORY_MAP_CODEC =
            Codec.unboundedMap(DYE_COLOR_CODEC, ITEM_STACK_HANDLER_CODEC);

    public static final Codec<Map<Integer, ItemStackHandler>> PERSONAL_BAG_INVENTORY_MAP_CODEC =
            Codec.unboundedMap(Codec.INT, ITEM_STACK_HANDLER_CODEC);


    public static final Supplier<AttachmentType<Map<DyeColor, ItemStackHandler>>> BAG_ATTACHMENT = ATTACHMENTS.register(
            "bag_attachment", () -> AttachmentType.<Map<DyeColor, ItemStackHandler>> builder(Collections::emptyMap)
                    .serialize(BAG_INVENTORY_MAP_CODEC).copyOnDeath().build()
    );

    public static final Supplier<AttachmentType<Map<Integer, ItemStackHandler>>> PERSONAL_BAG_ATTACHMENT = ATTACHMENTS.register(
            "personal_bag_attachment", () -> AttachmentType.<Map<Integer, ItemStackHandler>> builder(Collections::emptyMap)
                    .serialize(PERSONAL_BAG_INVENTORY_MAP_CODEC).copyOnDeath().build()
    );
}
