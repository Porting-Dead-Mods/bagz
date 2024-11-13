package com.portingdeadmods.bagz.api;

import com.portingdeadmods.bagz.Bagz;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.neoforged.neoforge.capabilities.CapabilityRegistry;
import net.neoforged.neoforge.capabilities.EntityCapability;

public class BagzCapabilities {
    public static final EntityCapability<IPersonalBagProvider, Void> PERS_BAG_CAPABILITY = EntityCapability.create(
            ResourceLocation.fromNamespaceAndPath(Bagz.MODID, "personal_bag_capability"),
            IPersonalBagProvider.class,
            Void.class
    );

    public static final EntityCapability<IBagProvider, Void> BAG_CAPABILITY = EntityCapability.create(
            ResourceLocation.fromNamespaceAndPath(Bagz.MODID, "bag_capability"),
            IBagProvider.class,
            Void.class
    );
}
