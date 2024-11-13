package com.portingdeadmods.bagz.api;

import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.DyeColor;
import net.neoforged.neoforge.common.util.INBTSerializable;
import net.neoforged.neoforge.items.IItemHandler;
import org.jetbrains.annotations.NotNull;

public interface IBagProvider extends INBTSerializable<CompoundTag> {
    /**
     * Note: modifying this clientside is not advised
     *
     * @param color The bag color to acquire
     *
     * @return The inventory representing this bag
     */
    @NotNull
    IItemHandler getBag(@NotNull DyeColor color);

    /**
     * Syncs the bag inventory associated with this color to the player provided (usually the owner of this capability instance)
     *
     * @param color  The bag color to sync. If null, syncs every color.
     * @param player The player to sync the bags to.
     */
    void sync(DyeColor color, @NotNull ServerPlayer player);
}
