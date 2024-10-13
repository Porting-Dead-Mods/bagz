package com.portingdeadmods.bagz.datagen;

import com.portingdeadmods.bagz.Bagz;
import com.portingdeadmods.bagz.registries.BagzBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

import static com.portingdeadmods.bagz.registries.BagzItems.*;

public class EnUsProvider extends LanguageProvider {
    public EnUsProvider(PackOutput output) {
        super(output, Bagz.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("item.bagz.bag_red", "Red Bag");
        add("item.bagz.bag_green", "Green Bag");
        add("item.bagz.bag_blue", "Blue Bag");
        add("item.bagz.bag_yellow", "Yellow Bag");
        add("item.bagz.bag_purple", "Purple Bag");
        add("item.bagz.bag_orange", "Orange Bag");
        add("item.bagz.bag_black", "Black Bag");
        add("item.bagz.bag_white", "White Bag");
        add("item.bagz.bag_pink", "Pink Bag");
        add("item.bagz.bag_brown", "Brown Bag");
        add("item.bagz.bag_gray", "Gray Bag");
        add("item.bagz.bag_light_gray", "Light Gray Bag");
        add("item.bagz.bag_cyan", "Cyan Bag");
        add("item.bagz.bag_light_blue", "Light Blue Bag");
        add("item.bagz.bag_magenta", "Magenta Bag");
        add("item.bagz.bag_lime", "Lime Bag");
        add("item.bagz.personal_bag", "Personal Bag");

        add("tooltip.bagz.socketed_ender_eye_1", "You feel like it can see through you... neat!");
        add("tooltip.bagz.socketed_ender_eye_2", "It can see... it can see everything...");
        add("tooltip.bagz.socketed_ender_eye_3", "Boo! Hehe did I scare you?");
        add("tooltip.bagz.socketed_ender_eye_4", "It cannot blink and it's getting dry... some eye drops maybe?");
        add("tooltip.bagz.socketed_ender_eye_5", "It's watching you... always watching...");
        add("tooltip.bagz.socketed_ender_eye_6", "The constant gaze of the eye is unsettling...");
        add("tooltip.bagz.socketed_ender_eye_7", "A small drip of slime is gathering at the bottom of the socket...");

        add("item.bagz.socketed_ender_eye", "Socketed Ender Eye");
        add("bagz.creative_tab.main", "Bagz");
    }
}
