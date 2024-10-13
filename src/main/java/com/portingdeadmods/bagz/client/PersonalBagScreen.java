package com.portingdeadmods.bagz.client;

import com.portingdeadmods.bagz.Bagz;
import com.portingdeadmods.bagz.Config;
import com.portingdeadmods.bagz.content.menus.PersonalBagMenu;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PersonalBagScreen extends AbstractContainerScreen<PersonalBagMenu> {

    private final boolean isCustomTexture = Config.customBagTextures;
    private final ResourceLocation CONTAINER_TEXTURE = ResourceLocation.fromNamespaceAndPath(Bagz.MODID, "textures/gui/bag");
    private final ResourceLocation VANILLA_CONTAINER_TEXTURE = ResourceLocation.fromNamespaceAndPath(Bagz.MODID, "textures/gui/bag_vanilla");

    public PersonalBagScreen(PersonalBagMenu menu, Inventory playerInventory, Component title) {
        super(menu, playerInventory, title);
        this.imageHeight = 279;
        this.imageWidth = 306;
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick) {
        super.render(guiGraphics, mouseX, mouseY, partialTick);
        this.renderTooltip(guiGraphics, mouseX, mouseY);
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float partialTick, int mouseX, int mouseY) {
        int i = (this.width - this.imageWidth) / 2;
        int j = (this.height - this.imageHeight) / 2;

        if (Config.customBagTextures) {
            guiGraphics.blit(CONTAINER_TEXTURE, i, j, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
        } else {
            guiGraphics.blit(VANILLA_CONTAINER_TEXTURE, i, j, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
        }
    }

    @Override
    protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
        if (Config.customBagTextures) {
            return;
        } else {
            super.renderLabels(guiGraphics, mouseX, mouseY);
        }
    }
}
