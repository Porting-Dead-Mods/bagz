package com.portingdeadmods.bagz.registries;

import com.portingdeadmods.bagz.Bagz;
import com.portingdeadmods.bagz.content.items.BagItem;
import com.portingdeadmods.bagz.content.items.PersonalBagItem;
import com.portingdeadmods.bagz.content.items.SocketedEnderEyeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class BagzItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Bagz.MODID);
    public static final List<ItemLike> CREATIVE_TAB_ITEMS = new ArrayList<>();
    public static final List<Supplier<BlockItem>> BLOCK_ITEMS = new ArrayList<>();

    public static final DeferredItem<BagItem> BAG_RED = registerItem("bag_red", () -> new BagItem(DyeColor.RED));
    public static final DeferredItem<BagItem> BAG_GREEN = registerItem("bag_green", () -> new BagItem(DyeColor.GREEN));
    public static final DeferredItem<BagItem> BAG_BLUE = registerItem("bag_blue", () -> new BagItem(DyeColor.BLUE));
    public static final DeferredItem<BagItem> BAG_YELLOW = registerItem("bag_yellow", () -> new BagItem(DyeColor.YELLOW));
    public static final DeferredItem<BagItem> BAG_PURPLE = registerItem("bag_purple", () -> new BagItem(DyeColor.PURPLE));
    public static final DeferredItem<BagItem> BAG_ORANGE = registerItem("bag_orange", () -> new BagItem(DyeColor.ORANGE));
    public static final DeferredItem<BagItem> BAG_BLACK = registerItem("bag_black", () -> new BagItem(DyeColor.BLACK));
    public static final DeferredItem<BagItem> BAG_WHITE = registerItem("bag_white", () -> new BagItem(DyeColor.WHITE));
    public static final DeferredItem<BagItem> BAG_PINK = registerItem("bag_pink", () -> new BagItem(DyeColor.PINK));
    public static final DeferredItem<BagItem> BAG_BROWN = registerItem("bag_brown", () -> new BagItem(DyeColor.BROWN));
    public static final DeferredItem<BagItem> BAG_GRAY = registerItem("bag_gray", () -> new BagItem(DyeColor.GRAY));
    public static final DeferredItem<BagItem> BAG_LIGHT_GRAY = registerItem("bag_light_gray", () -> new BagItem(DyeColor.LIGHT_GRAY));
    public static final DeferredItem<BagItem> BAG_CYAN = registerItem("bag_cyan", () -> new BagItem(DyeColor.CYAN));
    public static final DeferredItem<BagItem> BAG_LIGHT_BLUE = registerItem("bag_light_blue", () -> new BagItem(DyeColor.LIGHT_BLUE));
    public static final DeferredItem<BagItem> BAG_MAGENTA = registerItem("bag_magenta", () -> new BagItem(DyeColor.MAGENTA));
    public static final DeferredItem<BagItem> BAG_LIME = registerItem("bag_lime", () -> new BagItem(DyeColor.LIME));

    public static final DeferredItem<PersonalBagItem> PERSONAL_BAG = registerItem("personal_bag", PersonalBagItem::new);

    public static final DeferredItem<SocketedEnderEyeItem> SOCKETED_ENDER_EYE = registerItem("socketed_ender_eye", SocketedEnderEyeItem::new, new Item.Properties());

    public static <T extends Item> DeferredItem<T> registerItem(String name, Function<Item.Properties, T> itemConstructor, Item.Properties properties) {
        return registerItem(name, itemConstructor, properties, true);
    }

    public static <T extends Item> DeferredItem<T> registerItem(String name, Supplier<T> item) {
        DeferredItem<T> toReturn = ITEMS.register(name, item);
        CREATIVE_TAB_ITEMS.add(toReturn);
        return toReturn;
    }

    public static <T extends Item> DeferredItem<T> registerItem(String name, Function<Item.Properties, T> itemConstructor, Item.Properties properties, boolean addToTab) {
        DeferredItem<T> toReturn = ITEMS.registerItem(name, itemConstructor, properties);
        if (addToTab) {
            CREATIVE_TAB_ITEMS.add(toReturn);
        }
        return toReturn;
    }

}
