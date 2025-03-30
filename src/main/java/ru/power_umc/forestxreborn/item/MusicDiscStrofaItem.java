
package ru.power_umc.forestxreborn.item;

import ru.power_umc.forestxreborn.ForestMod;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class MusicDiscStrofaItem extends Item {
	public MusicDiscStrofaItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(1).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(ForestMod.MODID, "music_disc_strofa"))));
	}
}
