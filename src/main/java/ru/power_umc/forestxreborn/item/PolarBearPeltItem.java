
package ru.power_umc.forestxreborn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PolarBearPeltItem extends Item {
	public PolarBearPeltItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}
}
