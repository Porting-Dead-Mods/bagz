package com.portingdeadmods.bagz.content.items;

import com.portingdeadmods.bagz.Bagz;
import com.portingdeadmods.bagz.content.menus.BagContainer;
import com.portingdeadmods.bagz.content.menus.BagMenuColored;
import com.portingdeadmods.bagz.data.DataComponents;
import com.portingdeadmods.bagz.content.menus.BagMenu;
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


public class BagItem extends Item implements  MenuProvider {
    public final String color;
    public final BagContainer bagContainer;

    public BagItem(String color) {
        super(new Properties()
                .stacksTo(1)
        );
        this.color = color;
        this.bagContainer = new BagContainer(color);
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
}
