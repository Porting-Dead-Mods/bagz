package com.portingdeadmods.bagz.datagen;

import com.portingdeadmods.bagz.registries.BagzItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class RecipeProvider extends net.minecraft.data.recipes.RecipeProvider {

    public RecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput precipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BagzItems.SOCKETED_ENDER_EYE.asItem(), 1)
                .pattern("ODO")
                .pattern("DED")
                .pattern("ODO")
                .define('O', Items.OBSIDIAN)
                .define('D', Items.DIAMOND)
                .define('E', Items.ENDER_EYE)
                .unlockedBy("has_item", has(Items.ENDER_EYE))
                .save(precipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BagzItems.BAG_RED.asItem(), 1)
                .pattern("SDS")
                .pattern("OEO")
                .pattern("OOO")
                .define('S', Items.STRING)
                .define('E', Items.ENDER_CHEST)
                .define('D', Tags.Items.DYES_RED)
                .define('O', Items.OBSIDIAN)
                .unlockedBy("has_item", has(Items.ENDER_CHEST))
                .save(precipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BagzItems.BAG_GREEN.asItem(), 1)
                .pattern("SDS")
                .pattern("OEO")
                .pattern("OOO")
                .define('S', Items.STRING)
                .define('E', Items.ENDER_CHEST)
                .define('D', Tags.Items.DYES_GREEN)
                .define('O', Items.OBSIDIAN)
                .unlockedBy("has_item", has(Items.ENDER_CHEST))
                .save(precipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BagzItems.BAG_BLUE.asItem(), 1)
                .pattern("SDS")
                .pattern("OEO")
                .pattern("OOO")
                .define('S', Items.STRING)
                .define('E', Items.ENDER_CHEST)
                .define('D', Tags.Items.DYES_BLUE)
                .define('O', Items.OBSIDIAN)
                .unlockedBy("has_item", has(Items.ENDER_CHEST))
                .save(precipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BagzItems.BAG_YELLOW.asItem(), 1)
                .pattern("SDS")
                .pattern("OEO")
                .pattern("OOO")
                .define('S', Items.STRING)
                .define('E', Items.ENDER_CHEST)
                .define('D', Tags.Items.DYES_YELLOW)
                .define('O', Items.OBSIDIAN)
                .unlockedBy("has_item", has(Items.ENDER_CHEST))
                .save(precipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BagzItems.BAG_PURPLE.asItem(), 1)
                .pattern("SDS")
                .pattern("OEO")
                .pattern("OOO")
                .define('S', Items.STRING)
                .define('E', Items.ENDER_CHEST)
                .define('D', Tags.Items.DYES_PURPLE)
                .define('O', Items.OBSIDIAN)
                .unlockedBy("has_item", has(Items.ENDER_CHEST))
                .save(precipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BagzItems.BAG_ORANGE.asItem(), 1)
                .pattern("SDS")
                .pattern("OEO")
                .pattern("OOO")
                .define('S', Items.STRING)
                .define('E', Items.ENDER_CHEST)
                .define('D', Tags.Items.DYES_ORANGE)
                .define('O', Items.OBSIDIAN)
                .unlockedBy("has_item", has(Items.ENDER_CHEST))
                .save(precipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BagzItems.BAG_BLACK.asItem(), 1)
                .pattern("SDS")
                .pattern("OEO")
                .pattern("OOO")
                .define('S', Items.STRING)
                .define('E', Items.ENDER_CHEST)
                .define('D', Tags.Items.DYES_BLACK)
                .define('O', Items.OBSIDIAN)
                .unlockedBy("has_item", has(Items.ENDER_CHEST))
                .save(precipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BagzItems.BAG_WHITE.asItem(), 1)
                .pattern("SDS")
                .pattern("OEO")
                .pattern("OOO")
                .define('S', Items.STRING)
                .define('E', Items.ENDER_CHEST)
                .define('D', Tags.Items.DYES_WHITE)
                .define('O', Items.OBSIDIAN)
                .unlockedBy("has_item", has(Items.ENDER_CHEST))
                .save(precipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BagzItems.BAG_PINK.asItem(), 1)
                .pattern("SDS")
                .pattern("OEO")
                .pattern("OOO")
                .define('S', Items.STRING)
                .define('E', Items.ENDER_CHEST)
                .define('D', Tags.Items.DYES_PINK)
                .define('O', Items.OBSIDIAN)
                .unlockedBy("has_item", has(Items.ENDER_CHEST))
                .save(precipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BagzItems.BAG_BROWN.asItem(), 1)
                .pattern("SDS")
                .pattern("OEO")
                .pattern("OOO")
                .define('S', Items.STRING)
                .define('E', Items.ENDER_CHEST)
                .define('D', Tags.Items.DYES_BROWN)
                .define('O', Items.OBSIDIAN)
                .unlockedBy("has_item", has(Items.ENDER_CHEST))
                .save(precipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BagzItems.BAG_GRAY.asItem(), 1)
                .pattern("SDS")
                .pattern("OEO")
                .pattern("OOO")
                .define('S', Items.STRING)
                .define('E', Items.ENDER_CHEST)
                .define('D', Tags.Items.DYES_GRAY)
                .define('O', Items.OBSIDIAN)
                .unlockedBy("has_item", has(Items.ENDER_CHEST))
                .save(precipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BagzItems.BAG_LIGHT_GRAY.asItem(), 1)
                .pattern("SDS")
                .pattern("OEO")
                .pattern("OOO")
                .define('S', Items.STRING)
                .define('E', Items.ENDER_CHEST)
                .define('D', Tags.Items.DYES_LIGHT_GRAY)
                .define('O', Items.OBSIDIAN)
                .unlockedBy("has_item", has(Items.ENDER_CHEST))
                .save(precipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BagzItems.BAG_CYAN.asItem(), 1)
                .pattern("SDS")
                .pattern("OEO")
                .pattern("OOO")
                .define('S', Items.STRING)
                .define('E', Items.ENDER_CHEST)
                .define('D', Tags.Items.DYES_CYAN)
                .define('O', Items.OBSIDIAN)
                .unlockedBy("has_item", has(Items.ENDER_CHEST))
                .save(precipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BagzItems.BAG_LIGHT_BLUE.asItem(), 1)
                .pattern("SDS")
                .pattern("OEO")
                .pattern("OOO")
                .define('S', Items.STRING)
                .define('E', Items.ENDER_CHEST)
                .define('D', Tags.Items.DYES_LIGHT_BLUE)
                .define('O', Items.OBSIDIAN)
                .unlockedBy("has_item", has(Items.ENDER_CHEST))
                .save(precipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BagzItems.BAG_MAGENTA.asItem(), 1)
                .pattern("SDS")
                .pattern("OEO")
                .pattern("OOO")
                .define('S', Items.STRING)
                .define('E', Items.ENDER_CHEST)
                .define('D', Tags.Items.DYES_MAGENTA)
                .define('O', Items.OBSIDIAN)
                .unlockedBy("has_item", has(Items.ENDER_CHEST))
                .save(precipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BagzItems.BAG_LIME.asItem(), 1)
                .pattern("SDS")
                .pattern("OEO")
                .pattern("OOO")
                .define('S', Items.STRING)
                .define('E', Items.ENDER_CHEST)
                .define('D', Tags.Items.DYES_LIME)
                .define('O', Items.OBSIDIAN)
                .unlockedBy("has_item", has(Items.ENDER_CHEST))
                .save(precipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BagzItems.PERSONAL_BAG.asItem(), 1)
                .pattern("SDS")
                .pattern("OEO")
                .pattern("OOO")
                .define('S', Items.STRING)
                .define('E', Items.ENDER_CHEST)
                .define('D', BagzItems.SOCKETED_ENDER_EYE)
                .define('O', Items.OBSIDIAN)
                .unlockedBy("has_item", has(BagzItems.SOCKETED_ENDER_EYE))
                .save(precipeOutput);

    }
}

