package com.portingdeadmods.bagz.registries;

import com.portingdeadmods.bagz.Bagz;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BagzCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Bagz.MODID);

    public static final Supplier<CreativeModeTab> CREATIVE_TAB = CREATIVE_MODE_TABS.register("main", () -> CreativeModeTab.builder()
            .title(Component.translatable("bagz.creative_tab.main"))
            .icon(() -> Items.ENDER_CHEST.asItem().getDefaultInstance())
            .displayItems((params, output) -> {
                for (ItemLike item : BagzItems.CREATIVE_TAB_ITEMS) {
                    output.accept(item);
                }
            })
            .build());

}
