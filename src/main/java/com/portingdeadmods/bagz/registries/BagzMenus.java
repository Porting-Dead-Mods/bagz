package com.portingdeadmods.bagz.registries;

import com.portingdeadmods.bagz.Bagz;
import com.portingdeadmods.bagz.content.menus.BagMenu;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.network.IContainerFactory;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BagzMenus {

    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(net.minecraft.core.registries.Registries.MENU, Bagz.MODID);

    public static final Supplier<MenuType<BagMenu>> BAG_MENU =
            registerMenuType("bag_menu", BagMenu::new);

    private static <T extends AbstractContainerMenu> Supplier<MenuType<T>> registerMenuType(String name, IContainerFactory<T> factory) {
        return MENUS.register(name, () -> IMenuTypeExtension.create(factory));
    }
}
