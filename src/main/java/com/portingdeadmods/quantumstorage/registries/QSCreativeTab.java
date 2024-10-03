package com.portingdeadmods.quantumstorage.registries;

import com.portingdeadmods.quantumstorage.QuantumStorage;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class QSCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, QuantumStorage.MODID);

    public static final Supplier<CreativeModeTab> CREATIVE_TAB = CREATIVE_MODE_TABS.register("main", () -> CreativeModeTab.builder()
            .title(Component.translatable("nautec.creative_tab.main"))
            //.icon(() -> QSBlocks.<TBI>.asItem().getDefaultInstance())
            .displayItems((params, output) -> {
                for (ItemLike item : QSItems.CREATIVE_TAB_ITEMS) {
                    output.accept(item);
                }
            })
            .build());

}
