package com.portingdeadmods.bagz.registries;

import com.portingdeadmods.bagz.Bagz;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BagzBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Bagz.MODID);

    // NOTE: This also attempts to generate the item model for the block, when running datagen
    private static <T extends Block> DeferredBlock<T> registerBlockAndItem(String name, Function<BlockBehaviour.Properties, T> blockConstructor, BlockBehaviour.Properties properties, boolean addToTab, boolean genItemModel) {
        DeferredBlock<T> block = BLOCKS.registerBlock(name, blockConstructor, properties);
        DeferredItem<BlockItem> blockItem = BagzItems.registerItem(name, props -> new BlockItem(block.get(), props), new Item.Properties(), addToTab);
        if (genItemModel) {
            BagzItems.BLOCK_ITEMS.add(blockItem);
        }
        return block;
    }

    private static <T extends Block> DeferredBlock<T> registerBlockAndItem(String name, Function<BlockBehaviour.Properties, T> blockConstructor, BlockBehaviour.Properties properties, BiFunction<T, Item.Properties, BlockItem> blockItemConstructor) {
        DeferredBlock<T> block = BLOCKS.registerBlock(name, blockConstructor, properties);
        DeferredItem<BlockItem> blockItem = BagzItems.registerItem(name, props -> blockItemConstructor.apply(block.get(), props), new Item.Properties());
        BagzItems.BLOCK_ITEMS.add(blockItem);
        return block;
    }
}
