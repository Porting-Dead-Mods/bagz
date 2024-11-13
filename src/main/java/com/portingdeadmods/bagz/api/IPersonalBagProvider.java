package com.portingdeadmods.bagz.api;

import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.DyeColor;
import net.neoforged.neoforge.common.util.INBTSerializable;
import net.neoforged.neoforge.items.IItemHandler;
import org.jetbrains.annotations.NotNull;

public interface IPersonalBagProvider extends INBTSerializable<CompoundTag> {
    @NotNull IItemHandler getBag(@NotNull int color);

    /**
     * Note: modifying this clientside is not advised
     *
     * @param color The bag color (hex code) to acquire
     *
     * @return The inventory representing this alchemical bag
     */
    @NotNull
    IItemHandler getBag(@NotNull Integer color);

    /**
     * Syncs the bag inventory associated with this color to the player provided (usually the owner of this capability instance)
     *
     * @param color  The bag color to sync. If null, syncs every color.
     * @param player The player to sync the bags to.
     */
    void sync(int color, @NotNull ServerPlayer player);
}
