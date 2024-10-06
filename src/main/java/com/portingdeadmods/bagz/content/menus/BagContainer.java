package com.portingdeadmods.bagz.content.menus;

import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;

public class BagContainer extends SimpleContainer {

    public final String color;

    public BagContainer(String color) {
        super(9*15);
        this.color = color;
    }

    @Override
    public void fromTag(ListTag tag, HolderLookup.Provider levelRegistry) {
        for (int i = 0; i < this.getContainerSize(); i++) {
            this.setItem(i, ItemStack.EMPTY);
        }

        for (int k = 0; k < tag.size(); k++) {
            CompoundTag compoundtag = tag.getCompound(k);
            int j = compoundtag.getByte("bagSlot_{}".format(color)) & 255;
            if (j >= 0 && j < this.getContainerSize()) {
                this.setItem(j, ItemStack.parse(levelRegistry, compoundtag).orElse(ItemStack.EMPTY));
            }
        }
    }

    @Override
    public ListTag createTag(HolderLookup.Provider levelRegistry) {
        ListTag listtag = new ListTag();

        for (int i = 0; i < this.getContainerSize(); i++) {
            ItemStack itemstack = this.getItem(i);
            if (!itemstack.isEmpty()) {
                CompoundTag compoundtag = new CompoundTag();
                compoundtag.putByte("bagSlot_{}".format(color), (byte)i);
                listtag.add(itemstack.save(levelRegistry, compoundtag));
            }
        }

        return listtag;
    }
}
