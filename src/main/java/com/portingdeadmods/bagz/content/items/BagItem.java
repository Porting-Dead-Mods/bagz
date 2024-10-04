package com.portingdeadmods.bagz.content.items;

import com.portingdeadmods.bagz.Bagz;
import com.portingdeadmods.bagz.data.DataComponents;
import com.portingdeadmods.bagz.content.menus.BagMenu;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;


public class BagItem extends Item implements ItemColor, MenuProvider {
    public BagItem() {
        super(new Properties()
                .stacksTo(1)
                .component(DataComponents.RED, (byte) 255)
                .component(DataComponents.GREEN, (byte) 255)
                .component(DataComponents.BLUE, (byte) 255)
        );

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
        return 0xFFFFFF; // Default to white
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        player.openMenu(this);
        return InteractionResultHolder.success(player.getItemInHand(usedHand));
    }


    @Override
    public Component getDisplayName() {
        return Component.translatable("items.bagz.bag");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int containerId, Inventory playerInventory, Player player) {
        return new BagMenu(containerId, playerInventory);
    }

    @Override
    public int getBarColor(ItemStack stack) {
        return getColor(stack, 1);
    }
}
