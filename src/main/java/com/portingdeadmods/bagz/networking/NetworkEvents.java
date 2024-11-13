package com.portingdeadmods.bagz.networking;

import com.portingdeadmods.bagz.Bagz;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;


@EventBusSubscriber(modid = Bagz.MODID, bus = EventBusSubscriber.Bus.MOD)
public class NetworkEvents {
    @SubscribeEvent
    public static void registerPayloads(final RegisterPayloadHandlersEvent event) {
        final PayloadRegistrar registrar = event.registrar(Bagz.MODID);
        registrar.playToClient(
                SyncBagzPayload.TYPE,
                SyncBagzPayload.STREAM_CODEC,
                SyncBagzPayload::syncBagzAction
        );
    }
}
