package com.portingdeadmods.bagz.client;

import com.portingdeadmods.bagz.Bagz;
import com.portingdeadmods.bagz.Config;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.AbstractOptionSliderButton;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class PersonalBagConfigScreen extends Screen {

    private final ResourceLocation BACKGROUND_TEXTURE = ResourceLocation.fromNamespaceAndPath(Bagz.MODID, "textures/gui/personal_bag_config.png");
    private final ResourceLocation VANILLA_BACKGROUND_TEXTURE = ResourceLocation.fromNamespaceAndPath(Bagz.MODID, "textures/gui/personal_bag_config_vanilla.png");

    private final ResourceLocation RED_SQUARE = ResourceLocation.fromNamespaceAndPath(Bagz.MODID, "textures/gui/red_square.png");
    private final ResourceLocation GREEN_SQUARE = ResourceLocation.fromNamespaceAndPath(Bagz.MODID, "textures/gui/green_square.png");
    private final ResourceLocation BLUE_SQUARE = ResourceLocation.fromNamespaceAndPath(Bagz.MODID, "textures/gui/blue_square.png");

    private final int imageWidth;
    private final int imageHeight;

    private final int squareSize = 18;

    public PersonalBagConfigScreen(Component title) {
        super(title);
        this.minecraft = Minecraft.getInstance();
        this.imageWidth = 500;
        this.imageHeight = 40;
    }

    @Override
    public void renderBackground(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick) {
        renderTransparentBackground(guiGraphics);
        renderBg(guiGraphics);
    }

    @Override
    protected void init() {
        super.init();
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        int padding = 10;
        int squareWidth = 18;

        int redSquareX = x + padding;
        int greenSquareX = redSquareX + squareWidth + padding;
        int blueSquareX = greenSquareX + squareWidth + padding;
        int squareY = y + padding;

        int inputFieldWidth = 50;
        int inputFieldHeight = 20;
        int redInputX = redSquareX - inputFieldWidth - 3;
        int greenInputX = greenSquareX - inputFieldWidth - 3;
        int blueInputX = blueSquareX - inputFieldWidth - 3;
        int inputY = squareY;

        EditBox red = new EditBox(Minecraft.getInstance().font.self(), redInputX, inputY, inputFieldWidth, inputFieldHeight, Component.translatable("bagz.screen.red_edit_box"));
        EditBox green = new EditBox(Minecraft.getInstance().font.self(), greenInputX, inputY, inputFieldWidth, inputFieldHeight, Component.translatable("bagz.screen.green_edit_box"));
        EditBox blue = new EditBox(Minecraft.getInstance().font.self(), blueInputX, inputY, inputFieldWidth, inputFieldHeight, Component.translatable("bagz.screen.blue_edit_box"));

        addRenderableWidget(red);
        addRenderableWidget(green);
        addRenderableWidget(blue);
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick) {
        super.render(guiGraphics, mouseX, mouseY, partialTick);
    }

    public void renderBg(GuiGraphics guiGraphics) {

    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }
}
