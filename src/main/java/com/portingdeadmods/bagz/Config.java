package com.portingdeadmods.bagz;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

@EventBusSubscriber(modid = Bagz.MODID, bus = EventBusSubscriber.Bus.MOD)
public class Config
{
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    private static final ModConfigSpec.BooleanValue CUSTOM_BAG_TEXTURES = BUILDER
            .comment("Give the bag textures a custom look")
            .define("customBagTextures", false);

    static final ModConfigSpec SPEC = BUILDER.build();

    public static boolean customBagTextures;

    @SubscribeEvent
    public static void onLoad(final ModConfigEvent event)
    {
        customBagTextures = CUSTOM_BAG_TEXTURES.get();
    }
}
