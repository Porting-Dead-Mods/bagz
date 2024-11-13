package com.portingdeadmods.bagz.content.items;

import com.portingdeadmods.bagz.api.IPersonalBagProvider;
import com.portingdeadmods.bagz.networking.SyncBagzPayload;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.DyeColor;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.ItemStackHandler;
import net.neoforged.neoforge.network.PacketDistributor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.UnknownNullability;

import java.util.HashMap;
import java.util.Map;

public final class PersonalBagImplementation {

    public static IPersonalBagProvider getDefault() {
        return new DefaultImpl();
    }

    public static class DefaultImpl implements IPersonalBagProvider {

        private final Map<Integer, ItemStackHandler> inventories = new HashMap<Integer, ItemStackHandler>();

        @Override
        public @NotNull IItemHandler getBag(@NotNull int color) {
            if (!inventories.containsKey(color)) {
                inventories.put(color, new ItemStackHandler(9 * 15));
            }
            return inventories.get(color);
        }

        @Override
        public void sync(int color, @NotNull ServerPlayer player) {
            PacketDistributor.sendToPlayer(player, new SyncBagzPayload(writeNBT(player.level().registryAccess(), color)));
        }

        public CompoundTag writeNBT(HolderLookup.Provider provider, Integer color) {
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
