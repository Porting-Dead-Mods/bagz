package com.portingdeadmods.bagz.content.items;

import com.portingdeadmods.bagz.Bagz;
import com.portingdeadmods.bagz.content.menus.BagContainer;
import com.portingdeadmods.bagz.content.menus.BagMenuColored;
import com.portingdeadmods.bagz.data.DataComponents;
import com.portingdeadmods.bagz.content.menus.BagMenu;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;


public class BagItem extends Item implements ItemColor, MenuProvider {
    public final String color;
    public final BagContainer bagContainer;

    public BagItem(String color) {
        super(new Properties()
                .stacksTo(1)
                .component(DataComponents.RED, (byte) 255)
                .component(DataComponents.GREEN, (byte) 255)
                .component(DataComponents.BLUE, (byte) 255)
        );
        this.color = color;
        this.bagContainer = new BagContainer(color);
    }

    @Override
    public int getColor(ItemStack stack, int tintIndex) {
        if (tintIndex == 1) { // Assuming tintIndex 1 is for the bag color
            try {
                byte red = stack.get(DataComponents.RED);
                byte green = stack.get(DataComponents.GREEN);
                byte blue = stack.get(DataComponents.BLUE);
                return ((red & 0xFF) << 16) | ((green & 0xFF) << 8) | (blue & 0xFF);
            } catch (NullPointerException e) {
                Bagz.LOGGER.info("Searchable Catch: Bag getColor error\n" + e.getMessage());
                return 0xFFFFFF; // Default to white
            }
        };
        return switch (color) {
            case "red" -> 0xFF0000;
            case "green" -> 0x00FF00;
            case "blue" -> 0x0000FF;
            case "yellow" -> 0xFFFF00;
            case "purple" -> 0xFF00FF;
            case "cyan" -> 0x00FFFF;
            case "white" -> 0xFFFFFF;
            case "black" -> 0x000000;
            case "orange" -> 0xFFA500;
            case "pink" -> 0xFFC0CB;
            case "brown" -> 0xA52A2A;
            case "gray" -> 0x808080;
            case "light_gray" -> 0xD3D3D3;
            case "lime" -> 0x00FF00;
            case "magenta" -> 0xFF00FF;
            case "light_blue" -> 0xADD8E6;
            default -> 0xFFFFFF; // Default white
        };
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {


        player.openMenu(this);
        return InteractionResultHolder.success(player.getItemInHand(usedHand));
    }


    @Override
    public Component getDisplayName() {
        return Component.translatable(String.format("item.bagz.bag_%S", color));
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int containerId, Inventory playerInventory, Player player) {
        switch(color) {
            case "red":
                return new SimpleMenuProvider((id, inv, player1) -> new BagMenuColored.BagMenuRed(id, inv, bagContainer), getDisplayName()).createMenu(containerId, playerInventory, player);
            case "green":
                return new SimpleMenuProvider((id, inv, player1) -> new BagMenuColored.BagMenuGreen(id, inv, bagContainer), getDisplayName()).createMenu(containerId, playerInventory, player);
            case "blue":
                return new SimpleMenuProvider((id, inv, player1) -> new BagMenuColored.BagMenuBlue(id, inv, bagContainer), getDisplayName()).createMenu(containerId, playerInventory, player);
            case "yellow":
                return new SimpleMenuProvider((id, inv, player1) -> new BagMenuColored.BagMenuYellow(id, inv, bagContainer), getDisplayName()).createMenu(containerId, playerInventory, player);
            case "purple":
                return new SimpleMenuProvider((id, inv, player1) -> new BagMenuColored.BagMenuPurple(id, inv, bagContainer), getDisplayName()).createMenu(containerId, playerInventory, player);
            case "cyan":
                return new SimpleMenuProvider((id, inv, player1) -> new BagMenuColored.BagMenuCyan(id, inv, bagContainer), getDisplayName()).createMenu(containerId, playerInventory, player);
            case "white":
                return new SimpleMenuProvider((id, inv, player1) -> new BagMenuColored.BagMenuWhite(id, inv, bagContainer), getDisplayName()).createMenu(containerId, playerInventory, player);
            case "black":
                return new SimpleMenuProvider((id, inv, player1) -> new BagMenuColored.BagMenuBlack(id, inv, bagContainer), getDisplayName()).createMenu(containerId, playerInventory, player);
            case "orange":
                return new SimpleMenuProvider((id, inv, player1) -> new BagMenuColored.BagMenuOrange(id, inv, bagContainer), getDisplayName()).createMenu(containerId, playerInventory, player);
            case "pink":
                return new SimpleMenuProvider((id, inv, player1) -> new BagMenuColored.BagMenuPink(id, inv, bagContainer), getDisplayName()).createMenu(containerId, playerInventory, player);
            case "brown":
                return new SimpleMenuProvider((id, inv, player1) -> new BagMenuColored.BagMenuBrown(id, inv, bagContainer), getDisplayName()).createMenu(containerId, playerInventory, player);
            case "gray":
                return new SimpleMenuProvider((id, inv, player1) -> new BagMenuColored.BagMenuGray(id, inv, bagContainer), getDisplayName()).createMenu(containerId, playerInventory, player);
            case "light_gray":
                return new SimpleMenuProvider((id, inv, player1) -> new BagMenuColored.BagMenuLightGray(id, inv, bagContainer), getDisplayName()).createMenu(containerId, playerInventory, player);
            case "lime":
                return new SimpleMenuProvider((id, inv, player1) -> new BagMenuColored.BagMenuLime(id, inv, bagContainer), getDisplayName()).createMenu(containerId, playerInventory, player);
            case "magenta":
                return new SimpleMenuProvider((id, inv, player1) -> new BagMenuColored.BagMenuMagenta(id, inv, bagContainer), getDisplayName()).createMenu(containerId, playerInventory, player);
            case "light_blue":
                return new SimpleMenuProvider((id, inv, player1) -> new BagMenuColored.BagMenuLightBlue(id, inv, bagContainer), getDisplayName()).createMenu(containerId, playerInventory, player);
            default: return new SimpleMenuProvider((id, inv, player1) -> new BagMenu(id, inv, bagContainer), getDisplayName()).createMenu(containerId, playerInventory, player);
        }
    }

    @Override
    public int getBarColor(ItemStack stack) {
        return getColor(stack, 1);
    }
}
