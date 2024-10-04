package com.portingdeadmods.bagz;

import com.portingdeadmods.bagz.data.DataComponents;
import com.portingdeadmods.bagz.events.BagzClientEvents;
import com.portingdeadmods.bagz.registries.BagzBlocks;
import com.portingdeadmods.bagz.registries.BagzCreativeTab;
import com.portingdeadmods.bagz.registries.BagzItems;
import com.portingdeadmods.bagz.registries.BagzMenus;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;

@Mod(Bagz.MODID)
public class Bagz
{
    public static final String MODID = "bagz";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Bagz(IEventBus modEventBus, ModContainer modContainer)
    {
        BagzBlocks.BLOCKS.register(modEventBus);
        BagzItems.ITEMS.register(modEventBus);
        BagzCreativeTab.CREATIVE_MODE_TABS.register(modEventBus);
        BagzMenus.MENUS.register(modEventBus);
        DataComponents.DATA_COMPONENT_TYPES.register(modEventBus);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}
