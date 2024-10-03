package com.portingdeadmods.quantumstorage;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredRegister;

public class QSRegistries {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(QuantumStorage.MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(QuantumStorage.MODID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, QuantumStorage.MODID);


}
