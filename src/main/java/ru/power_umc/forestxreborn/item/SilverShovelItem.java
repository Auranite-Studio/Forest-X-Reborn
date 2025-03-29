
package ru.power_umc.forestxreborn.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SilverShovelItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 72, 12f, 0, 40, TagKey.create(Registries.ITEM, ResourceLocation.parse("forest:silver_shovel_repair_items")));

	public SilverShovelItem(Item.Properties properties) {
		super(properties.shovel(TOOL_MATERIAL, 1.25f, -3f));
	}
}
