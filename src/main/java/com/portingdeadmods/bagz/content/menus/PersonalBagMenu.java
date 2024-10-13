package com.portingdeadmods.bagz.content.menus;


import com.portingdeadmods.bagz.registries.BagzMenus;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

public class PersonalBagMenu extends AbstractContainerMenu {
    private static final int CONTAINER_SIZE = 9 * 15;
    private final Container container;

    public PersonalBagMenu(int containerId, Inventory playerInventory) {
        this(containerId, playerInventory, new SimpleContainer(CONTAINER_SIZE));
    }

    public PersonalBagMenu(int containerId, Inventory playerInventory, Container container) {
        super(BagzMenus.BAG_MENU.get(), containerId);
        checkContainerSize(container, CONTAINER_SIZE);
        this.container = container;
        container.startOpen(playerInventory.player);
        int i = 3;
        int j = 9;

        // 9 rows of 15 slots
        for (int height = 0; height < 9; height++) {
            for (int width = 0; width < 15; width++) {
                this.addSlot(new Slot(container, width + height * 15, 18 + width * 18, 9 + height * 18));
            }
        }

        // Player inventory
        for (int i1 = 0; i1 < 3; i1++) {
            for (int k1 = 0; k1 < 9; k1++) {
                this.addSlot(new Slot(playerInventory, k1 + i1 * 9 + 9, 18*4 + k1 * 18, 189 + i1 * 18));
            }
        }

        // Hotbar
        for (int j1 = 0; j1 < 9; j1++) {
            this.addSlot(new Slot(playerInventory, j1, 18*4 + j1 * 18, 270-18));
        }
    }

    public PersonalBagMenu(int i, Inventory inventory, RegistryFriendlyByteBuf registryFriendlyByteBuf) {
        this(i,inventory);
    }

    /**
     * Determines whether supplied player can use this container
     */
    @Override
    public boolean stillValid(Player player) {
        return this.container.stillValid(player);
    }

    /**
     * Handle when the stack in slot {@code index} is shift-clicked. Normally this moves the stack between the player inventory and the other inventory(s).
     */
    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);
        if (slot != null && slot.hasItem()) {
            ItemStack itemstack1 = slot.getItem();
            itemstack = itemstack1.copy();
            if (index < this.container.getContainerSize()) {
                if (!this.moveItemStackTo(itemstack1, this.container.getContainerSize(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.moveItemStackTo(itemstack1, 0, this.container.getContainerSize(), false)) {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty()) {
                slot.setByPlayer(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
        }

        return itemstack;
    }

    /**
     * Called when the container is closed.
     */
    @Override
    public void removed(Player player) {
        super.removed(player);
        this.container.stopOpen(player);
    }
}