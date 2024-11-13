package com.portingdeadmods.bagz.content.menus;

import net.minecraft.world.Container;
import net.minecraft.world.inventory.Slot;

public class BagSlot extends Slot {
    public BagSlot(Container container, int index, int x, int y) {
        super(container, index, x, y);
    }

    @Override
    public boolean setChanged(ItemStack stack) {
        return false;
    }
}
