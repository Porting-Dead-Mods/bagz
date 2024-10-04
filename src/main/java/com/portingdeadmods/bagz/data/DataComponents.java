package com.portingdeadmods.bagz.data;


import com.mojang.serialization.Codec;
import com.portingdeadmods.bagz.Bagz;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.network.codec.ByteBufCodecs;
import net.neoforged.neoforge.fluids.SimpleFluidContent;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;


public final class DataComponents {

    public static final DeferredRegister.DataComponents DATA_COMPONENT_TYPES = DeferredRegister.createDataComponents(Bagz.MODID);

    public static final Supplier<DataComponentType<Byte>> RED = registerDataComponentType("red",
            () -> builder -> builder.persistent(Codec.BYTE).networkSynchronized(ByteBufCodecs.BYTE));

    public static final Supplier<DataComponentType<Byte>> GREEN = registerDataComponentType("green",
            () -> builder -> builder.persistent(Codec.BYTE).networkSynchronized(ByteBufCodecs.BYTE));

    public static final Supplier<DataComponentType<Byte>> BLUE = registerDataComponentType("blue",
            () -> builder -> builder.persistent(Codec.BYTE).networkSynchronized(ByteBufCodecs.BYTE));

    public static <T> Supplier<DataComponentType<T>> registerDataComponentType(
            String name, Supplier<UnaryOperator<DataComponentType.Builder<T>>> builderOperator) {
        return DATA_COMPONENT_TYPES.register(name, () -> builderOperator.get().apply(DataComponentType.builder()).build());
    }
}
