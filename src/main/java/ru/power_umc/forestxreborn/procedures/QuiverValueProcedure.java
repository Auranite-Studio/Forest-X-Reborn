package ru.power_umc.forestxreborn.procedures;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.core.component.DataComponents;

public class QuiverValueProcedure {
	public static String execute(ItemStack itemstack) {
		double count = 0;
		double quiverSlot = 0;
		double previousRecipe = 0;
		return "\u00A78" + Component.translatable("special_info.quiver.arrows_count").getString() + (Math.round(itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("arrowCount", 0)) + " / 576");
	}
}
