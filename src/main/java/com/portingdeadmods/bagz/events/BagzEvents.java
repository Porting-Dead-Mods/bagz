package com.portingdeadmods.bagz.events;

import com.portingdeadmods.bagz.Bagz;
import com.portingdeadmods.bagz.client.BagScreen;
import com.portingdeadmods.bagz.registries.BagzMenus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;

public class BagzEvents {

    @EventBusSubscriber(modid = Bagz.MODID, bus = EventBusSubscriber.Bus.MOD)
    public static class ModEvents {

        @SubscribeEvent
        public static void onClientSetup(RegisterMenuScreensEvent event) {
            event.register(BagzMenus.BAG_MENU.get(), BagScreen::new);
        }

    }
}
