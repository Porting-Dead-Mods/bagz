package com.portingdeadmods.bagz.client;

import com.portingdeadmods.bagz.Bagz;
import com.portingdeadmods.bagz.registries.BagzItems;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;

import java.sql.Array;
import java.util.*;


@EventBusSubscriber(modid = Bagz.MODID, bus=EventBusSubscriber.Bus.GAME, value = Dist.CLIENT)
public class Tooltips {

    private static ItemStack cachedStack = ItemStack.EMPTY;

    private static final List<Tooltip> SOCKETED_ENDER_EYE_TOOLTIPS = new ArrayList<>();

    public static final List<Tooltip> getSocketedEnderEyeTooltips() {
        return SOCKETED_ENDER_EYE_TOOLTIPS;
    }

    static {
        SOCKETED_ENDER_EYE_TOOLTIPS.add(Tooltip.SOCKETED_ENDER_EYE_1);
        SOCKETED_ENDER_EYE_TOOLTIPS.add(Tooltip.SOCKETED_ENDER_EYE_2);
        SOCKETED_ENDER_EYE_TOOLTIPS.add(Tooltip.SOCKETED_ENDER_EYE_3);
        SOCKETED_ENDER_EYE_TOOLTIPS.add(Tooltip.SOCKETED_ENDER_EYE_4);
        SOCKETED_ENDER_EYE_TOOLTIPS.add(Tooltip.SOCKETED_ENDER_EYE_5);
        SOCKETED_ENDER_EYE_TOOLTIPS.add(Tooltip.SOCKETED_ENDER_EYE_6);
        SOCKETED_ENDER_EYE_TOOLTIPS.add(Tooltip.SOCKETED_ENDER_EYE_7);
    }

    private static Tooltip cachedSocketedEyeTooltip = SOCKETED_ENDER_EYE_TOOLTIPS.get(0);
    private static Tooltip socketedEyeTooltip = SOCKETED_ENDER_EYE_TOOLTIPS.get(0);

    @SubscribeEvent
    public static void onTooltip(ItemTooltipEvent event) {
        ItemStack stack = event.getItemStack();

        if (stack.getItem() == BagzItems.SOCKETED_ENDER_EYE.get()) {
            if (cachedStack.getItem() != stack.getItem()) {
                Random random = new Random();
                socketedEyeTooltip = SOCKETED_ENDER_EYE_TOOLTIPS.get(random.nextInt(SOCKETED_ENDER_EYE_TOOLTIPS.size()));
                cachedSocketedEyeTooltip = socketedEyeTooltip;
            }
            event.getToolTip().add(Component.translatable(socketedEyeTooltip.tooltip).withStyle(Style.EMPTY.withItalic(true).withColor(socketedEyeTooltip.color)));
        }
        cachedStack = event.getItemStack();
    }

    public static void addRandomTooltip(ItemTooltipEvent event, List<Tooltip> tooltips) {
        Random random = new Random();
        Tooltip tooltip = tooltips.get(random.nextInt(tooltips.size()));
        event.getToolTip().add(Component.translatable(tooltip.tooltip).withStyle(Style.EMPTY.withItalic(true).withColor(tooltip.color)));
    }

    public enum Tooltip {

        SOCKETED_ENDER_EYE_1(TextColor.fromRgb(0x808080), "tooltip.bagz.socketed_ender_eye_1"),
        SOCKETED_ENDER_EYE_2(TextColor.fromRgb(0x808080), "tooltip.bagz.socketed_ender_eye_2"),
        SOCKETED_ENDER_EYE_3(TextColor.fromRgb(0x808080), "tooltip.bagz.socketed_ender_eye_3"),
        SOCKETED_ENDER_EYE_4(TextColor.fromRgb(0x808080), "tooltip.bagz.socketed_ender_eye_4"),
        SOCKETED_ENDER_EYE_5(TextColor.fromRgb(0x808080), "tooltip.bagz.socketed_ender_eye_5"),
        SOCKETED_ENDER_EYE_6(TextColor.fromRgb(0x808080), "tooltip.bagz.socketed_ender_eye_6"),
        SOCKETED_ENDER_EYE_7(TextColor.fromRgb(0x808080), "tooltip.bagz.socketed_ender_eye_7");


        private final TextColor color;
        private final String tooltip;

        public TextColor getColor() {
            return this.color;
        }

        public String getTooltip() {
            return this.tooltip;
        }

        Tooltip(TextColor color, String tooltip) {
            this.color = color;
            this.tooltip = tooltip;
        }
    }
}