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
        add("items.bagz.bag", "Bag");
        add("bagz.creative_tab.main", "Bagz");
    }
}
