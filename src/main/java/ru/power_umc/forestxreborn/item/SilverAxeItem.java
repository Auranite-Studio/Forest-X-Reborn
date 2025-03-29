
package ru.power_umc.forestxreborn.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SilverAxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 72, 12f, 0, 40, TagKey.create(Registries.ITEM, ResourceLocation.parse("forest:silver_axe_repair_items")));

	public SilverAxeItem(Item.Properties properties) {
		super(properties.axe(TOOL_MATERIAL, 8f, -3f));
	}
}
