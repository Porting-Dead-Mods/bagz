package com.portingdeadmods.bagz.content.items;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;
import java.util.Random;

import com.portingdeadmods.bagz.client.Tooltips;


public class SocketedEnderEyeItem extends Item {
    public SocketedEnderEyeItem(Properties properties) {
        super(properties);
    }
    /*
    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        Random random = new Random();
        Tooltips.Tooltip tooltip = Tooltips.getSocketedEnderEyeTooltips().get(random.nextInt(Tooltips.getSocketedEnderEyeTooltips().size()));
        tooltipComponents.add(Component.translatable(tooltip.getTooltip()).withStyle(Style.EMPTY.withItalic(true).withColor(tooltip.getColor())));

        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
    */
}
