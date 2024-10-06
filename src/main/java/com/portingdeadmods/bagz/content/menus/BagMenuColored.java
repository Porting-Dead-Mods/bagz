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


//May God forgive what programming war crime I have committed here.
public class BagMenuColored {
    public static class BagMenuGreen extends AbstractContainerMenu {
        private static final int CONTAINER_SIZE = 9 * 15;
        private final Container container;
    
        public BagMenuGreen( int containerId, Inventory playerInventory){
            this(containerId, playerInventory, new SimpleContainer(CONTAINER_SIZE));
        }
    
        public BagMenuGreen( int containerId, Inventory playerInventory, Container container){
            super(BagzMenus.BAG_MENU_GREEN.get(), containerId);
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
                    this.addSlot(new Slot(playerInventory, k1 + i1 * 9 + 9, 18 * 4 + k1 * 18, 189 + i1 * 18));
                }
            }

            // Hotbar
            for (int j1 = 0; j1 < 9; j1++) {
                this.addSlot(new Slot(playerInventory, j1, 18 * 4 + j1 * 18, 270 - 18));
            }
        }
    
        public BagMenuGreen( int i, Inventory inventory, RegistryFriendlyByteBuf registryFriendlyByteBuf){
            this(i, inventory);
        }

        /**
         * Determines whether supplied player can use this container
         */
        @Override
        public boolean stillValid (Player player){
            return this.container.stillValid(player);
        }

        /**
         * Handle when the stack in slot {@code index} is shift-clicked. Normally this moves the stack between the player inventory and the other inventory(s).
         */
        @Override
        public ItemStack quickMoveStack (Player player,int index){
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
        public void removed (Player player){
            super.removed(player);
            this.container.stopOpen(player);
        }
    }
    public static class BagMenuLime extends AbstractContainerMenu {
        private static final int CONTAINER_SIZE = 9 * 15;
        private final Container container;

        public BagMenuLime( int containerId, Inventory playerInventory){
            this(containerId, playerInventory, new SimpleContainer(CONTAINER_SIZE));
        }

        public BagMenuLime( int containerId, Inventory playerInventory, Container container){
            super(BagzMenus.BAG_MENU_LIME.get(), containerId);
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
                    this.addSlot(new Slot(playerInventory, k1 + i1 * 9 + 9, 18 * 4 + k1 * 18, 189 + i1 * 18));
                }
            }

            // Hotbar
            for (int j1 = 0; j1 < 9; j1++) {
                this.addSlot(new Slot(playerInventory, j1, 18 * 4 + j1 * 18, 270 - 18));
            }
        }

        public BagMenuLime( int i, Inventory inventory, RegistryFriendlyByteBuf registryFriendlyByteBuf){
            this(i, inventory);
        }

        /**
         * Determines whether supplied player can use this container
         */
        @Override
        public boolean stillValid (Player player){
            return this.container.stillValid(player);
        }

        /**
         * Handle when the stack in slot {@code index} is shift-clicked. Normally this moves the stack between the player inventory and the other inventory(s).
         */
        @Override
        public ItemStack quickMoveStack (Player player,int index){
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
        public void removed (Player player){
            super.removed(player);
            this.container.stopOpen(player);
        }
    }
    public static class BagMenuWhite extends AbstractContainerMenu {
        private static final int CONTAINER_SIZE = 9 * 15;
        private final Container container;

        public BagMenuWhite( int containerId, Inventory playerInventory){
            this(containerId, playerInventory, new SimpleContainer(CONTAINER_SIZE));
        }

        public BagMenuWhite( int containerId, Inventory playerInventory, Container container){
            super(BagzMenus.BAG_MENU_WHITE.get(), containerId);
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
                    this.addSlot(new Slot(playerInventory, k1 + i1 * 9 + 9, 18 * 4 + k1 * 18, 189 + i1 * 18));
                }
            }

            // Hotbar
            for (int j1 = 0; j1 < 9; j1++) {
                this.addSlot(new Slot(playerInventory, j1, 18 * 4 + j1 * 18, 270 - 18));
            }
        }

        public BagMenuWhite( int i, Inventory inventory, RegistryFriendlyByteBuf registryFriendlyByteBuf){
            this(i, inventory);
        }

        /**
         * Determines whether supplied player can use this container
         */
        @Override
        public boolean stillValid (Player player){
            return this.container.stillValid(player);
        }

        /**
         * Handle when the stack in slot {@code index} is shift-clicked. Normally this moves the stack between the player inventory and the other inventory(s).
         */
        @Override
        public ItemStack quickMoveStack (Player player,int index){
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
        public void removed (Player player){
            super.removed(player);
            this.container.stopOpen(player);
        }
    }
    public static class BagMenuBlack extends AbstractContainerMenu {
        private static final int CONTAINER_SIZE = 9 * 15;
        private final Container container;

        public BagMenuBlack( int containerId, Inventory playerInventory){
            this(containerId, playerInventory, new SimpleContainer(CONTAINER_SIZE));
        }

        public BagMenuBlack( int containerId, Inventory playerInventory, Container container){
            super(BagzMenus.BAG_MENU_BLACK.get(), containerId);
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
                    this.addSlot(new Slot(playerInventory, k1 + i1 * 9 + 9, 18 * 4 + k1 * 18, 189 + i1 * 18));
                }
            }

            // Hotbar
            for (int j1 = 0; j1 < 9; j1++) {
                this.addSlot(new Slot(playerInventory, j1, 18 * 4 + j1 * 18, 270 - 18));
            }
        }

        public BagMenuBlack( int i, Inventory inventory, RegistryFriendlyByteBuf registryFriendlyByteBuf){
            this(i, inventory);
        }

        /**
         * Determines whether supplied player can use this container
         */
        @Override
        public boolean stillValid (Player player){
            return this.container.stillValid(player);
        }

        /**
         * Handle when the stack in slot {@code index} is shift-clicked. Normally this moves the stack between the player inventory and the other inventory(s).
         */
        @Override
        public ItemStack quickMoveStack (Player player,int index){
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
        public void removed (Player player){
            super.removed(player);
            this.container.stopOpen(player);
        }
    }
    public static class BagMenuLightGray extends AbstractContainerMenu {
        private static final int CONTAINER_SIZE = 9 * 15;
        private final Container container;

        public BagMenuLightGray( int containerId, Inventory playerInventory){
            this(containerId, playerInventory, new SimpleContainer(CONTAINER_SIZE));
        }

        public BagMenuLightGray( int containerId, Inventory playerInventory, Container container){
            super(BagzMenus.BAG_MENU_LIGHT_GRAY.get(), containerId);
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
                    this.addSlot(new Slot(playerInventory, k1 + i1 * 9 + 9, 18 * 4 + k1 * 18, 189 + i1 * 18));
                }
            }

            // Hotbar
            for (int j1 = 0; j1 < 9; j1++) {
                this.addSlot(new Slot(playerInventory, j1, 18 * 4 + j1 * 18, 270 - 18));
            }
        }

        public BagMenuLightGray( int i, Inventory inventory, RegistryFriendlyByteBuf registryFriendlyByteBuf){
            this(i, inventory);
        }

        /**
         * Determines whether supplied player can use this container
         */
        @Override
        public boolean stillValid (Player player){
            return this.container.stillValid(player);
        }

        /**
         * Handle when the stack in slot {@code index} is shift-clicked. Normally this moves the stack between the player inventory and the other inventory(s).
         */
        @Override
        public ItemStack quickMoveStack (Player player,int index){
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
        public void removed (Player player){
            super.removed(player);
            this.container.stopOpen(player);
        }
    }
    public static class BagMenuGray extends AbstractContainerMenu {
        private static final int CONTAINER_SIZE = 9 * 15;
        private final Container container;

        public BagMenuGray( int containerId, Inventory playerInventory){
            this(containerId, playerInventory, new SimpleContainer(CONTAINER_SIZE));
        }

        public BagMenuGray( int containerId, Inventory playerInventory, Container container){
            super(BagzMenus.BAG_MENU_GRAY.get(), containerId);
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
                    this.addSlot(new Slot(playerInventory, k1 + i1 * 9 + 9, 18 * 4 + k1 * 18, 189 + i1 * 18));
                }
            }

            // Hotbar
            for (int j1 = 0; j1 < 9; j1++) {
                this.addSlot(new Slot(playerInventory, j1, 18 * 4 + j1 * 18, 270 - 18));
            }
        }

        public BagMenuGray( int i, Inventory inventory, RegistryFriendlyByteBuf registryFriendlyByteBuf){
            this(i, inventory);
        }

        /**
         * Determines whether supplied player can use this container
         */
        @Override
        public boolean stillValid (Player player){
            return this.container.stillValid(player);
        }

        /**
         * Handle when the stack in slot {@code index} is shift-clicked. Normally this moves the stack between the player inventory and the other inventory(s).
         */
        @Override
        public ItemStack quickMoveStack (Player player,int index){
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
        public void removed (Player player){
            super.removed(player);
            this.container.stopOpen(player);
        }
    }
    public static class BagMenuBrown extends AbstractContainerMenu {
        private static final int CONTAINER_SIZE = 9 * 15;
        private final Container container;

        public BagMenuBrown( int containerId, Inventory playerInventory){
            this(containerId, playerInventory, new SimpleContainer(CONTAINER_SIZE));
        }

        public BagMenuBrown( int containerId, Inventory playerInventory, Container container){
            super(BagzMenus.BAG_MENU_BROWN.get(), containerId);
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
                    this.addSlot(new Slot(playerInventory, k1 + i1 * 9 + 9, 18 * 4 + k1 * 18, 189 + i1 * 18));
                }
            }

            // Hotbar
            for (int j1 = 0; j1 < 9; j1++) {
                this.addSlot(new Slot(playerInventory, j1, 18 * 4 + j1 * 18, 270 - 18));
            }
        }

        public BagMenuBrown( int i, Inventory inventory, RegistryFriendlyByteBuf registryFriendlyByteBuf){
            this(i, inventory);
        }

        /**
         * Determines whether supplied player can use this container
         */
        @Override
        public boolean stillValid (Player player){
            return this.container.stillValid(player);
        }

        /**
         * Handle when the stack in slot {@code index} is shift-clicked. Normally this moves the stack between the player inventory and the other inventory(s).
         */
        @Override
        public ItemStack quickMoveStack (Player player,int index){
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
        public void removed (Player player){
            super.removed(player);
            this.container.stopOpen(player);
        }
    }
    public static class BagMenuYellow extends AbstractContainerMenu {
        private static final int CONTAINER_SIZE = 9 * 15;
        private final Container container;

        public BagMenuYellow( int containerId, Inventory playerInventory){
            this(containerId, playerInventory, new SimpleContainer(CONTAINER_SIZE));
        }

        public BagMenuYellow( int containerId, Inventory playerInventory, Container container){
            super(BagzMenus.BAG_MENU_YELLOW.get(), containerId);
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
                    this.addSlot(new Slot(playerInventory, k1 + i1 * 9 + 9, 18 * 4 + k1 * 18, 189 + i1 * 18));
                }
            }

            // Hotbar
            for (int j1 = 0; j1 < 9; j1++) {
                this.addSlot(new Slot(playerInventory, j1, 18 * 4 + j1 * 18, 270 - 18));
            }
        }

        public BagMenuYellow( int i, Inventory inventory, RegistryFriendlyByteBuf registryFriendlyByteBuf){
            this(i, inventory);
        }

        /**
         * Determines whether supplied player can use this container
         */
        @Override
        public boolean stillValid (Player player){
            return this.container.stillValid(player);
        }

        /**
         * Handle when the stack in slot {@code index} is shift-clicked. Normally this moves the stack between the player inventory and the other inventory(s).
         */
        @Override
        public ItemStack quickMoveStack (Player player,int index){
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
        public void removed (Player player){
            super.removed(player);
            this.container.stopOpen(player);
        }
    }
    public static class BagMenuBlue extends AbstractContainerMenu {
        private static final int CONTAINER_SIZE = 9 * 15;
        private final Container container;

        public BagMenuBlue( int containerId, Inventory playerInventory){
            this(containerId, playerInventory, new SimpleContainer(CONTAINER_SIZE));
        }

        public BagMenuBlue( int containerId, Inventory playerInventory, Container container){
            super(BagzMenus.BAG_MENU_BLUE.get(), containerId);
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
                    this.addSlot(new Slot(playerInventory, k1 + i1 * 9 + 9, 18 * 4 + k1 * 18, 189 + i1 * 18));
                }
            }

            // Hotbar
            for (int j1 = 0; j1 < 9; j1++) {
                this.addSlot(new Slot(playerInventory, j1, 18 * 4 + j1 * 18, 270 - 18));
            }
        }

        public BagMenuBlue( int i, Inventory inventory, RegistryFriendlyByteBuf registryFriendlyByteBuf){
            this(i, inventory);
        }

        /**
         * Determines whether supplied player can use this container
         */
        @Override
        public boolean stillValid (Player player){
            return this.container.stillValid(player);
        }

        /**
         * Handle when the stack in slot {@code index} is shift-clicked. Normally this moves the stack between the player inventory and the other inventory(s).
         */
        @Override
        public ItemStack quickMoveStack (Player player,int index){
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
        public void removed (Player player){
            super.removed(player);
            this.container.stopOpen(player);
        }
    }
    public static class BagMenuPurple extends AbstractContainerMenu {
        private static final int CONTAINER_SIZE = 9 * 15;
        private final Container container;

        public BagMenuPurple( int containerId, Inventory playerInventory){
            this(containerId, playerInventory, new SimpleContainer(CONTAINER_SIZE));
        }

        public BagMenuPurple( int containerId, Inventory playerInventory, Container container){
            super(BagzMenus.BAG_MENU_PURPLE.get(), containerId);
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
                    this.addSlot(new Slot(playerInventory, k1 + i1 * 9 + 9, 18 * 4 + k1 * 18, 189 + i1 * 18));
                }
            }

            // Hotbar
            for (int j1 = 0; j1 < 9; j1++) {
                this.addSlot(new Slot(playerInventory, j1, 18 * 4 + j1 * 18, 270 - 18));
            }
        }

        public BagMenuPurple( int i, Inventory inventory, RegistryFriendlyByteBuf registryFriendlyByteBuf){
            this(i, inventory);
        }

        /**
         * Determines whether supplied player can use this container
         */
        @Override
        public boolean stillValid (Player player){
            return this.container.stillValid(player);
        }

        /**
         * Handle when the stack in slot {@code index} is shift-clicked. Normally this moves the stack between the player inventory and the other inventory(s).
         */
        @Override
        public ItemStack quickMoveStack (Player player,int index){
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
        public void removed (Player player){
            super.removed(player);
            this.container.stopOpen(player);
        }
    }
    public static class BagMenuCyan extends AbstractContainerMenu {
        private static final int CONTAINER_SIZE = 9 * 15;
        private final Container container;

        public BagMenuCyan( int containerId, Inventory playerInventory){
            this(containerId, playerInventory, new SimpleContainer(CONTAINER_SIZE));
        }

        public BagMenuCyan( int containerId, Inventory playerInventory, Container container){
            super(BagzMenus.BAG_MENU_CYAN.get(), containerId);
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
                    this.addSlot(new Slot(playerInventory, k1 + i1 * 9 + 9, 18 * 4 + k1 * 18, 189 + i1 * 18));
                }
            }

            // Hotbar
            for (int j1 = 0; j1 < 9; j1++) {
                this.addSlot(new Slot(playerInventory, j1, 18 * 4 + j1 * 18, 270 - 18));
            }
        }

        public BagMenuCyan( int i, Inventory inventory, RegistryFriendlyByteBuf registryFriendlyByteBuf){
            this(i, inventory);
        }

        /**
         * Determines whether supplied player can use this container
         */
        @Override
        public boolean stillValid (Player player){
            return this.container.stillValid(player);
        }

        /**
         * Handle when the stack in slot {@code index} is shift-clicked. Normally this moves the stack between the player inventory and the other inventory(s).
         */
        @Override
        public ItemStack quickMoveStack (Player player,int index){
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
        public void removed (Player player){
            super.removed(player);
            this.container.stopOpen(player);
        }
    }
    public static class BagMenuMagenta extends AbstractContainerMenu {
        private static final int CONTAINER_SIZE = 9 * 15;
        private final Container container;

        public BagMenuMagenta( int containerId, Inventory playerInventory){
            this(containerId, playerInventory, new SimpleContainer(CONTAINER_SIZE));
        }

        public BagMenuMagenta( int containerId, Inventory playerInventory, Container container){
            super(BagzMenus.BAG_MENU_MAGENTA.get(), containerId);
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
                    this.addSlot(new Slot(playerInventory, k1 + i1 * 9 + 9, 18 * 4 + k1 * 18, 189 + i1 * 18));
                }
            }

            // Hotbar
            for (int j1 = 0; j1 < 9; j1++) {
                this.addSlot(new Slot(playerInventory, j1, 18 * 4 + j1 * 18, 270 - 18));
            }
        }

        public BagMenuMagenta( int i, Inventory inventory, RegistryFriendlyByteBuf registryFriendlyByteBuf){
            this(i, inventory);
        }

        /**
         * Determines whether supplied player can use this container
         */
        @Override
        public boolean stillValid (Player player){
            return this.container.stillValid(player);
        }

        /**
         * Handle when the stack in slot {@code index} is shift-clicked. Normally this moves the stack between the player inventory and the other inventory(s).
         */
        @Override
        public ItemStack quickMoveStack (Player player,int index){
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
        public void removed (Player player){
            super.removed(player);
            this.container.stopOpen(player);
        }
    }
    public static class BagMenuOrange extends AbstractContainerMenu {
        private static final int CONTAINER_SIZE = 9 * 15;
        private final Container container;

        public BagMenuOrange( int containerId, Inventory playerInventory){
            this(containerId, playerInventory, new SimpleContainer(CONTAINER_SIZE));
        }

        public BagMenuOrange( int containerId, Inventory playerInventory, Container container){
            super(BagzMenus.BAG_MENU_ORANGE.get(), containerId);
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
                    this.addSlot(new Slot(playerInventory, k1 + i1 * 9 + 9, 18 * 4 + k1 * 18, 189 + i1 * 18));
                }
            }

            // Hotbar
            for (int j1 = 0; j1 < 9; j1++) {
                this.addSlot(new Slot(playerInventory, j1, 18 * 4 + j1 * 18, 270 - 18));
            }
        }

        public BagMenuOrange( int i, Inventory inventory, RegistryFriendlyByteBuf registryFriendlyByteBuf){
            this(i, inventory);
        }

        /**
         * Determines whether supplied player can use this container
         */
        @Override
        public boolean stillValid (Player player){
            return this.container.stillValid(player);
        }

        /**
         * Handle when the stack in slot {@code index} is shift-clicked. Normally this moves the stack between the player inventory and the other inventory(s).
         */
        @Override
        public ItemStack quickMoveStack (Player player,int index){
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
        public void removed (Player player){
            super.removed(player);
            this.container.stopOpen(player);
        }
    }
    public static class BagMenuPink extends AbstractContainerMenu {
        private static final int CONTAINER_SIZE = 9 * 15;
        private final Container container;

        public BagMenuPink( int containerId, Inventory playerInventory){
            this(containerId, playerInventory, new SimpleContainer(CONTAINER_SIZE));
        }

        public BagMenuPink( int containerId, Inventory playerInventory, Container container){
            super(BagzMenus.BAG_MENU_PINK.get(), containerId);
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
                    this.addSlot(new Slot(playerInventory, k1 + i1 * 9 + 9, 18 * 4 + k1 * 18, 189 + i1 * 18));
                }
            }

            // Hotbar
            for (int j1 = 0; j1 < 9; j1++) {
                this.addSlot(new Slot(playerInventory, j1, 18 * 4 + j1 * 18, 270 - 18));
            }
        }

        public BagMenuPink( int i, Inventory inventory, RegistryFriendlyByteBuf registryFriendlyByteBuf){
            this(i, inventory);
        }

        /**
         * Determines whether supplied player can use this container
         */
        @Override
        public boolean stillValid (Player player){
            return this.container.stillValid(player);
        }

        /**
         * Handle when the stack in slot {@code index} is shift-clicked. Normally this moves the stack between the player inventory and the other inventory(s).
         */
        @Override
        public ItemStack quickMoveStack (Player player,int index){
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
        public void removed (Player player){
            super.removed(player);
            this.container.stopOpen(player);
        }
    }
    public static class BagMenuRed extends AbstractContainerMenu {
        private static final int CONTAINER_SIZE = 9 * 15;
        private final Container container;

        public BagMenuRed( int containerId, Inventory playerInventory){
            this(containerId, playerInventory, new SimpleContainer(CONTAINER_SIZE));
        }

        public BagMenuRed( int containerId, Inventory playerInventory, Container container){
            super(BagzMenus.BAG_MENU_RED.get(), containerId);
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
                    this.addSlot(new Slot(playerInventory, k1 + i1 * 9 + 9, 18 * 4 + k1 * 18, 189 + i1 * 18));
                }
            }

            // Hotbar
            for (int j1 = 0; j1 < 9; j1++) {
                this.addSlot(new Slot(playerInventory, j1, 18 * 4 + j1 * 18, 270 - 18));
            }
        }

        public BagMenuRed( int i, Inventory inventory, RegistryFriendlyByteBuf registryFriendlyByteBuf){
            this(i, inventory);
        }

        /**
         * Determines whether supplied player can use this container
         */
        @Override
        public boolean stillValid (Player player){
            return this.container.stillValid(player);
        }

        /**
         * Handle when the stack in slot {@code index} is shift-clicked. Normally this moves the stack between the player inventory and the other inventory(s).
         */
        @Override
        public ItemStack quickMoveStack (Player player,int index){
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
        public void removed (Player player){
            super.removed(player);
            this.container.stopOpen(player);
        }
    }
    public static class BagMenuLightBlue extends AbstractContainerMenu {
        private static final int CONTAINER_SIZE = 9 * 15;
        private final Container container;

        public BagMenuLightBlue( int containerId, Inventory playerInventory){
            this(containerId, playerInventory, new SimpleContainer(CONTAINER_SIZE));
        }

        public BagMenuLightBlue( int containerId, Inventory playerInventory, Container container){
            super(BagzMenus.BAG_MENU_LIGHT_BLUE.get(), containerId);
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
                    this.addSlot(new Slot(playerInventory, k1 + i1 * 9 + 9, 18 * 4 + k1 * 18, 189 + i1 * 18));
                }
            }

            // Hotbar
            for (int j1 = 0; j1 < 9; j1++) {
                this.addSlot(new Slot(playerInventory, j1, 18 * 4 + j1 * 18, 270 - 18));
            }
        }

        public BagMenuLightBlue( int i, Inventory inventory, RegistryFriendlyByteBuf registryFriendlyByteBuf){
            this(i, inventory);
        }

        /**
         * Determines whether supplied player can use this container
         */
        @Override
        public boolean stillValid (Player player){
            return this.container.stillValid(player);
        }

        /**
         * Handle when the stack in slot {@code index} is shift-clicked. Normally this moves the stack between the player inventory and the other inventory(s).
         */
        @Override
        public ItemStack quickMoveStack (Player player,int index){
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
        public void removed (Player player){
            super.removed(player);
            this.container.stopOpen(player);
        }
    }
}