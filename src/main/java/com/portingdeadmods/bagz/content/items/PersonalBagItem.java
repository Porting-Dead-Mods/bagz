package com.portingdeadmods.bagz.content.items;

import com.portingdeadmods.bagz.Bagz;
import com.portingdeadmods.bagz.client.PersonalBagConfigScreen;
import com.portingdeadmods.bagz.content.menus.BagContainer;
import com.portingdeadmods.bagz.content.menus.PersonalBagMenu;
import com.portingdeadmods.bagz.data.DataComponents;
import net.minecraft.client.Minecraft;
import net.minecraft.core.component.DataComponentMap;
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

public class PersonalBagItem extends Item implements MenuProvider {
    private int color;
    private BagContainer bagContainer;

    public PersonalBagItem() {
        super(new Properties()
                .component(DataComponents.RED, (byte) 255)
                .component(DataComponents.GREEN, (byte) 255)
                .component(DataComponents.BLUE, (byte) 255)
                .stacksTo(1)
        );
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        ItemStack itemstack = player.getItemInHand(usedHand);
        DataComponentMap dataComponents = itemstack.getComponents();

        Byte red = dataComponents.get(DataComponents.RED.get());
        Byte green = dataComponents.get(DataComponents.GREEN.get());
        Byte blue = dataComponents.get(DataComponents.BLUE.get());

        if (red != null && green != null && blue != null) {
            color = (red << 16) | (green << 8) | blue;
        } else {
            Bagz.LOGGER.error("Color data not found in personal bag, defaulting to white frequency");
            color = 0xFFFFFF;
        }

        bagContainer = new BagContainer(Integer.toHexString(color));

        if (player.isShiftKeyDown()) {
            if (player.level().isClientSide) {
                Minecraft.getInstance().setScreen(new PersonalBagConfigScreen(Component.translatable("bagz.screens.personal_bag_config")));
            }
            return InteractionResultHolder.success(itemstack);
        } else {
            player.openMenu(this);
            return InteractionResultHolder.success(itemstack);
        }
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("item.bagz.personal_bag");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int containerId, Inventory playerInventory, Player player) {
        return new SimpleMenuProvider((id, inv, player1) -> new PersonalBagMenu(id, inv, bagContainer), getDisplayName()).createMenu(containerId, playerInventory, player);
    }
}
