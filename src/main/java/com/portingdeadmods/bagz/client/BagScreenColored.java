package com.portingdeadmods.bagz.client;

import com.portingdeadmods.bagz.Bagz;
import com.portingdeadmods.bagz.content.menus.BagMenuColored;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;


//May God forgive what programming war crime I have committed here.
public class BagScreenColored {
    public static class BagScreenRed extends AbstractContainerScreen<BagMenuColored.BagMenuRed> {
        private final ResourceLocation CONTAINER_TEXTURE = ResourceLocation.fromNamespaceAndPath(Bagz.MODID, "textures/gui/bag_red.png");

        public BagScreenRed(BagMenuColored.BagMenuRed menu, Inventory playerInventory, Component title) {
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
            guiGraphics.blit(CONTAINER_TEXTURE, i, j, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
        }

        @Override
        protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
            //Don't render the labels
        }
    }


    public static class BagScreenGreen extends AbstractContainerScreen<BagMenuColored.BagMenuGreen> {
        private final ResourceLocation CONTAINER_TEXTURE = ResourceLocation.fromNamespaceAndPath(Bagz.MODID, "textures/gui/bag_green.png");

        public BagScreenGreen(BagMenuColored.BagMenuGreen menu, Inventory playerInventory, Component title) {
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
            guiGraphics.blit(CONTAINER_TEXTURE, i, j, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
        }

        @Override
        protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
            //Don't render the labels
        }
    }


    public static class BagScreenBlue extends AbstractContainerScreen<BagMenuColored.BagMenuBlue> {
        private final ResourceLocation CONTAINER_TEXTURE = ResourceLocation.fromNamespaceAndPath(Bagz.MODID, "textures/gui/bag_blue.png");

        public BagScreenBlue(BagMenuColored.BagMenuBlue menu, Inventory playerInventory, Component title) {
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
            guiGraphics.blit(CONTAINER_TEXTURE, i, j, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
        }

        @Override
        protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
            //Don't render the labels
        }
    }


    public static class BagScreenYellow extends AbstractContainerScreen<BagMenuColored.BagMenuYellow> {
        private final ResourceLocation CONTAINER_TEXTURE = ResourceLocation.fromNamespaceAndPath(Bagz.MODID, "textures/gui/bag_yellow.png");

        public BagScreenYellow(BagMenuColored.BagMenuYellow menu, Inventory playerInventory, Component title) {
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
            guiGraphics.blit(CONTAINER_TEXTURE, i, j, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
        }

        @Override
        protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
            //Don't render the labels
        }
    }


    public static class BagScreenPurple extends AbstractContainerScreen<BagMenuColored.BagMenuPurple> {
        private final ResourceLocation CONTAINER_TEXTURE = ResourceLocation.fromNamespaceAndPath(Bagz.MODID, "textures/gui/bag_purple.png");

        public BagScreenPurple(BagMenuColored.BagMenuPurple menu, Inventory playerInventory, Component title) {
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
            guiGraphics.blit(CONTAINER_TEXTURE, i, j, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
        }

        @Override
        protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
            //Don't render the labels
        }
    }


    public static class BagScreenCyan extends AbstractContainerScreen<BagMenuColored.BagMenuCyan> {
        private final ResourceLocation CONTAINER_TEXTURE = ResourceLocation.fromNamespaceAndPath(Bagz.MODID, "textures/gui/bag_cyan.png");

        public BagScreenCyan(BagMenuColored.BagMenuCyan menu, Inventory playerInventory, Component title) {
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
            guiGraphics.blit(CONTAINER_TEXTURE, i, j, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
        }

        @Override
        protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
            //Don't render the labels
        }
    }


    public static class BagScreenWhite extends AbstractContainerScreen<BagMenuColored.BagMenuWhite> {
        private final ResourceLocation CONTAINER_TEXTURE = ResourceLocation.fromNamespaceAndPath(Bagz.MODID, "textures/gui/bag_white.png");

        public BagScreenWhite(BagMenuColored.BagMenuWhite menu, Inventory playerInventory, Component title) {
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
            guiGraphics.blit(CONTAINER_TEXTURE, i, j, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
        }

        @Override
        protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
            //Don't render the labels
        }
    }


    public static class BagScreenBlack extends AbstractContainerScreen<BagMenuColored.BagMenuBlack> {
        private final ResourceLocation CONTAINER_TEXTURE = ResourceLocation.fromNamespaceAndPath(Bagz.MODID, "textures/gui/bag_black.png");

        public BagScreenBlack(BagMenuColored.BagMenuBlack menu, Inventory playerInventory, Component title) {
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
            guiGraphics.blit(CONTAINER_TEXTURE, i, j, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
        }

        @Override
        protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
            //Don't render the labels
        }
    }


    public static class BagScreenOrange extends AbstractContainerScreen<BagMenuColored.BagMenuOrange> {
        private final ResourceLocation CONTAINER_TEXTURE = ResourceLocation.fromNamespaceAndPath(Bagz.MODID, "textures/gui/bag_orange.png");

        public BagScreenOrange(BagMenuColored.BagMenuOrange menu, Inventory playerInventory, Component title) {
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
            guiGraphics.blit(CONTAINER_TEXTURE, i, j, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
        }

        @Override
        protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
            //Don't render the labels
        }
    }


    public static class BagScreenPink extends AbstractContainerScreen<BagMenuColored.BagMenuPink> {
        private final ResourceLocation CONTAINER_TEXTURE = ResourceLocation.fromNamespaceAndPath(Bagz.MODID, "textures/gui/bag_pink.png");

        public BagScreenPink(BagMenuColored.BagMenuPink menu, Inventory playerInventory, Component title) {
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
            guiGraphics.blit(CONTAINER_TEXTURE, i, j, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
        }

        @Override
        protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
            //Don't render the labels
        }
    }


    public static class BagScreenBrown extends AbstractContainerScreen<BagMenuColored.BagMenuBrown> {
        private final ResourceLocation CONTAINER_TEXTURE = ResourceLocation.fromNamespaceAndPath(Bagz.MODID, "textures/gui/bag_brown.png");

        public BagScreenBrown(BagMenuColored.BagMenuBrown menu, Inventory playerInventory, Component title) {
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
            guiGraphics.blit(CONTAINER_TEXTURE, i, j, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
        }

        @Override
        protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
            //Don't render the labels
        }
    }


    public static class BagScreenGray extends AbstractContainerScreen<BagMenuColored.BagMenuGray> {
        private final ResourceLocation CONTAINER_TEXTURE = ResourceLocation.fromNamespaceAndPath(Bagz.MODID, "textures/gui/bag_gray.png");

        public BagScreenGray(BagMenuColored.BagMenuGray menu, Inventory playerInventory, Component title) {
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
            guiGraphics.blit(CONTAINER_TEXTURE, i, j, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
        }

        @Override
        protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
            //Don't render the labels
        }
    }


    public static class BagScreenLightGray extends AbstractContainerScreen<BagMenuColored.BagMenuLightGray> {
        private final ResourceLocation CONTAINER_TEXTURE = ResourceLocation.fromNamespaceAndPath(Bagz.MODID, "textures/gui/bag_light_gray.png");

        public BagScreenLightGray(BagMenuColored.BagMenuLightGray menu, Inventory playerInventory, Component title) {
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
            guiGraphics.blit(CONTAINER_TEXTURE, i, j, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
        }

        @Override
        protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
            //Don't render the labels
        }
    }


    public static class BagScreenMagenta extends AbstractContainerScreen<BagMenuColored.BagMenuMagenta> {
        private final ResourceLocation CONTAINER_TEXTURE = ResourceLocation.fromNamespaceAndPath(Bagz.MODID, "textures/gui/bag_magenta.png");

        public BagScreenMagenta(BagMenuColored.BagMenuMagenta menu, Inventory playerInventory, Component title) {
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
            guiGraphics.blit(CONTAINER_TEXTURE, i, j, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
        }

        @Override
        protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
            //Don't render the labels
        }
    }


    public static class BagScreenLime extends AbstractContainerScreen<BagMenuColored.BagMenuLime> {
        private final ResourceLocation CONTAINER_TEXTURE = ResourceLocation.fromNamespaceAndPath(Bagz.MODID, "textures/gui/bag_lime.png");

        public BagScreenLime(BagMenuColored.BagMenuLime menu, Inventory playerInventory, Component title) {
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
            guiGraphics.blit(CONTAINER_TEXTURE, i, j, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
        }

        @Override
        protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
            //Don't render the labels
        }
    }


    public static class BagScreenLightBlue extends AbstractContainerScreen<BagMenuColored.BagMenuLightBlue> {
        private final ResourceLocation CONTAINER_TEXTURE = ResourceLocation.fromNamespaceAndPath(Bagz.MODID, "textures/gui/bag_light_blue.png");

        public BagScreenLightBlue(BagMenuColored.BagMenuLightBlue menu, Inventory playerInventory, Component title) {
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
            guiGraphics.blit(CONTAINER_TEXTURE, i, j, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
        }

        @Override
        protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
            //Don't render the labels
        }
    }
}
