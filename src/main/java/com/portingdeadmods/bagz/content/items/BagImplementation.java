package com.portingdeadmods.bagz.content.items;

import com.portingdeadmods.bagz.api.BagzCapabilities;
import com.portingdeadmods.bagz.api.IBagProvider;
import com.portingdeadmods.bagz.networking.SyncBagzPayload;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.neoforged.neoforge.capabilities.EntityCapability;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.ItemStackHandler;
import net.neoforged.neoforge.network.PacketDistributor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.UnknownNullability;

import java.util.EnumMap;
import java.util.Map;

public final class BagImplementation {

    public static IBagProvider getDefault() {
        return new DefaultImpl();
    }

    public static class DefaultImpl implements IBagProvider {

        private final Map<DyeColor, ItemStackHandler> inventories = new EnumMap<>(DyeColor.class);

        @Override
        public @NotNull IItemHandler getBag(@NotNull DyeColor color) {
            if (!inventories.containsKey(color)) {
                inventories.put(color, new ItemStackHandler(9 * 15));
            }
            return inventories.get(color);
        }

        @Override
        public void sync(DyeColor color, @NotNull ServerPlayer player) {
            PacketDistributor.sendToPlayer(player, new SyncBagzPayload(writeNBT(player.level().registryAccess(), color)));
        }

        public CompoundTag writeNBT(HolderLookup.Provider provider, DyeColor color) {
            CompoundTag ret = new CompoundTag();
            DyeColor[] colors = color == null ? DyeColor.values() : new DyeColor[]{color};
            for (DyeColor c : colors) {
                if (inventories.containsKey(c)) {
                    ret.put(c.getSerializedName(), inventories.get(c).serializeNBT(provider));
                }
            }
            return ret;
        }


        @Override
        public @UnknownNullability CompoundTag serializeNBT(HolderLookup.Provider provider) {
            return writeNBT(provider, null);
        }

        @Override
        public void deserializeNBT(HolderLookup.Provider provider, CompoundTag nbt) {
            for (DyeColor e : DyeColor.values()) {
                if (nbt.contains(e.getSerializedName())) {
                    ItemStackHandler inv = new ItemStackHandler(104);
                    inv.deserializeNBT(provider, nbt.getCompound(e.getSerializedName()));
                    inventories.put(e, inv);
                }
            }
        }
    }
}
