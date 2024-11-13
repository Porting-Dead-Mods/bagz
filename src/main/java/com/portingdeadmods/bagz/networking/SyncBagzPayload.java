package com.portingdeadmods.bagz.networking;

import com.portingdeadmods.bagz.Bagz;
import com.portingdeadmods.bagz.api.BagzCapabilities;
import net.minecraft.core.RegistryAccess;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.network.handling.IPayloadContext;

public record SyncBagzPayload (CompoundTag nbt) implements CustomPacketPayload {
    public static final Type<SyncBagzPayload> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(Bagz.MODID, "sync_bagz_payload"));

    public static final StreamCodec<RegistryFriendlyByteBuf, SyncBagzPayload> STREAM_CODEC = StreamCodec.composite(
            ByteBufCodecs.COMPOUND_TAG,
            SyncBagzPayload::nbt,
            SyncBagzPayload::new
    );

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }

    public static void syncBagzAction(SyncBagzPayload payload, IPayloadContext context) {
        context.enqueueWork(() -> {
            Player player = context.player();
            Level level = player.level();
            RegistryAccess registryAccess = level.registryAccess();

            if (player.getCapability(BagzCapabilities.BAG_CAPABILITY) != null) {
                player.getCapability(BagzCapabilities.BAG_CAPABILITY).deserializeNBT(registryAccess, payload.nbt);
            }
        });
    }
}
