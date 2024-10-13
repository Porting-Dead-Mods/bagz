package com.portingdeadmods.bagz.datagen;

import com.portingdeadmods.bagz.Bagz;
import com.portingdeadmods.bagz.registries.BagzBlocks;
import com.portingdeadmods.bagz.registries.BagzItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.Objects;
import java.util.function.Supplier;

public class ItemModelProvider extends net.neoforged.neoforge.client.model.generators.ItemModelProvider {
    public ItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Bagz.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(BagzItems.BAG_RED.get());
        basicItem(BagzItems.BAG_GREEN.get());
        basicItem(BagzItems.BAG_BLUE.get());
        basicItem(BagzItems.BAG_YELLOW.get());
        basicItem(BagzItems.BAG_PURPLE.get());
        basicItem(BagzItems.BAG_ORANGE.get());
        basicItem(BagzItems.BAG_BLACK.get());
        basicItem(BagzItems.BAG_WHITE.get());
        basicItem(BagzItems.BAG_PINK.get());
        basicItem(BagzItems.BAG_BROWN.get());
        basicItem(BagzItems.BAG_GRAY.get());
        basicItem(BagzItems.BAG_LIGHT_GRAY.get());
        basicItem(BagzItems.BAG_CYAN.get());
        basicItem(BagzItems.BAG_LIGHT_BLUE.get());
        basicItem(BagzItems.BAG_MAGENTA.get());
        basicItem(BagzItems.BAG_LIME.get());
        basicItem(BagzItems.SOCKETED_ENDER_EYE.get());
        basicItem(BagzItems.PERSONAL_BAG.get());
    }
}
