package com.portingdeadmods.bagz.events;

import com.portingdeadmods.bagz.Bagz;
import com.portingdeadmods.bagz.client.BagScreen;
import com.portingdeadmods.bagz.client.BagScreenColored;
import com.portingdeadmods.bagz.client.PersonalBagConfigScreen;
import com.portingdeadmods.bagz.client.PersonalBagScreen;
import com.portingdeadmods.bagz.registries.BagzMenus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;

public class BagzEvents {

    @EventBusSubscriber(modid = Bagz.MODID, bus = EventBusSubscriber.Bus.MOD)
    public static class ModEvents {

        @SubscribeEvent
        public static void onClientSetup(RegisterMenuScreensEvent event) {
            event.register(BagzMenus.BAG_MENU_RED.get(), BagScreenColored.BagScreenRed::new);
            event.register(BagzMenus.BAG_MENU_GREEN.get(), BagScreenColored.BagScreenGreen::new);
            event.register(BagzMenus.BAG_MENU_BLUE.get(), BagScreenColored.BagScreenBlue::new);
            event.register(BagzMenus.BAG_MENU_YELLOW.get(), BagScreenColored.BagScreenYellow::new);
            event.register(BagzMenus.BAG_MENU_PURPLE.get(), BagScreenColored.BagScreenPurple::new);
            event.register(BagzMenus.BAG_MENU_CYAN.get(), BagScreenColored.BagScreenCyan::new);
            event.register(BagzMenus.BAG_MENU_WHITE.get(), BagScreenColored.BagScreenWhite::new);
            event.register(BagzMenus.BAG_MENU_BLACK.get(), BagScreenColored.BagScreenBlack::new);
            event.register(BagzMenus.BAG_MENU_ORANGE.get(), BagScreenColored.BagScreenOrange::new);
            event.register(BagzMenus.BAG_MENU_PINK.get(), BagScreenColored.BagScreenPink::new);
            event.register(BagzMenus.BAG_MENU_BROWN.get(), BagScreenColored.BagScreenBrown::new);
            event.register(BagzMenus.BAG_MENU_GRAY.get(), BagScreenColored.BagScreenGray::new);
            event.register(BagzMenus.BAG_MENU_LIGHT_GRAY.get(), BagScreenColored.BagScreenLightGray::new);
            event.register(BagzMenus.BAG_MENU_MAGENTA.get(), BagScreenColored.BagScreenMagenta::new);
            event.register(BagzMenus.BAG_MENU_LIGHT_BLUE.get(), BagScreenColored.BagScreenLightBlue::new);
            event.register(BagzMenus.BAG_MENU_LIME.get(), BagScreenColored.BagScreenLime::new);

            event.register(BagzMenus.PERSONAL_BAG_MENU.get(), PersonalBagScreen::new);
        }

    }
}
