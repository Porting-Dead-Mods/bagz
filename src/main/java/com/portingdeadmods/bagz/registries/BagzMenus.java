package com.portingdeadmods.bagz.registries;

import com.portingdeadmods.bagz.Bagz;
import com.portingdeadmods.bagz.content.menus.BagMenu;
import com.portingdeadmods.bagz.content.menus.BagMenuColored;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.network.IContainerFactory;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BagzMenus {

    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(net.minecraft.core.registries.Registries.MENU, Bagz.MODID);

    /*public static final Supplier<MenuType<BagMenu>> BAG_MENU =
            registerMenuType("bag_menu", BagMenu::new); */

    public static final Supplier<MenuType<BagMenu>> BAG_MENU =
            registerMenuType("bag_menu", BagMenu::new);

    public static final Supplier<MenuType<BagMenuColored.BagMenuRed>> BAG_MENU_RED =
            registerMenuType("bag_menu_red", BagMenuColored.BagMenuRed::new);

    public static final Supplier<MenuType<BagMenuColored.BagMenuGreen>> BAG_MENU_GREEN =
            registerMenuType("bag_menu_green", BagMenuColored.BagMenuGreen::new);

    public static final Supplier<MenuType<BagMenuColored.BagMenuBlue>> BAG_MENU_BLUE =
            registerMenuType("bag_menu_blue", BagMenuColored.BagMenuBlue::new);

    public static final Supplier<MenuType<BagMenuColored.BagMenuYellow>> BAG_MENU_YELLOW =
            registerMenuType("bag_menu_yellow", BagMenuColored.BagMenuYellow::new);

    public static final Supplier<MenuType<BagMenuColored.BagMenuPurple>> BAG_MENU_PURPLE =
            registerMenuType("bag_menu_purple", BagMenuColored.BagMenuPurple::new);

    public static final Supplier<MenuType<BagMenuColored.BagMenuCyan>> BAG_MENU_CYAN =
            registerMenuType("bag_menu_cyan", BagMenuColored.BagMenuCyan::new);

    public static final Supplier<MenuType<BagMenuColored.BagMenuWhite>> BAG_MENU_WHITE =
            registerMenuType("bag_menu_white", BagMenuColored.BagMenuWhite::new);

    public static final Supplier<MenuType<BagMenuColored.BagMenuBlack>> BAG_MENU_BLACK =
            registerMenuType("bag_menu_black", BagMenuColored.BagMenuBlack::new);

    public static final Supplier<MenuType<BagMenuColored.BagMenuOrange>> BAG_MENU_ORANGE =
            registerMenuType("bag_menu_orange", BagMenuColored.BagMenuOrange::new);

    public static final Supplier<MenuType<BagMenuColored.BagMenuPink>> BAG_MENU_PINK =
            registerMenuType("bag_menu_pink", BagMenuColored.BagMenuPink::new);

    public static final Supplier<MenuType<BagMenuColored.BagMenuBrown>> BAG_MENU_BROWN =
            registerMenuType("bag_menu_brown", BagMenuColored.BagMenuBrown::new);

    public static final Supplier<MenuType<BagMenuColored.BagMenuGray>> BAG_MENU_GRAY =
            registerMenuType("bag_menu_gray", BagMenuColored.BagMenuGray::new);

    public static final Supplier<MenuType<BagMenuColored.BagMenuLightGray>> BAG_MENU_LIGHT_GRAY =
            registerMenuType("bag_menu_light_gray", BagMenuColored.BagMenuLightGray::new);

    public static final Supplier<MenuType<BagMenuColored.BagMenuMagenta>> BAG_MENU_MAGENTA =
            registerMenuType("bag_menu_magenta", BagMenuColored.BagMenuMagenta::new);

    public static final Supplier<MenuType<BagMenuColored.BagMenuLime>> BAG_MENU_LIME =
            registerMenuType("bag_menu_lime", BagMenuColored.BagMenuLime::new);

    public static final Supplier<MenuType<BagMenuColored.BagMenuLightBlue>> BAG_MENU_LIGHT_BLUE =
            registerMenuType("bag_menu_light_blue", BagMenuColored.BagMenuLightBlue::new);

    private static <T extends AbstractContainerMenu> Supplier<MenuType<T>> registerMenuType(String name, IContainerFactory<T> factory) {
        return MENUS.register(name, () -> IMenuTypeExtension.create(factory));
    }
}
