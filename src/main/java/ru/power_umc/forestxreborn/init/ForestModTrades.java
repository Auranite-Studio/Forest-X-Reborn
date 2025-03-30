
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package ru.power_umc.forestxreborn.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@EventBusSubscriber
public class ForestModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(ForestModItems.LETTUCE_SEEDS.get(), 16), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(ForestModBlocks.GRAPE_VINE_0.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(ForestModItems.GRAPE.get(), 12), new ItemStack(Items.EMERALD), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(ForestModItems.RYE_SEEDS.get(), 8), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8), new ItemStack(ForestModItems.SILVER_ARMOR_HELMET.get()), 10, 5, 0.15f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 14), new ItemStack(ForestModItems.SILVER_ARMOR_CHESTPLATE.get()), 10, 5, 0.15f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 11), new ItemStack(ForestModItems.SILVER_ARMOR_LEGGINGS.get()), 10, 5, 0.15f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8), new ItemStack(ForestModItems.SILVER_ARMOR_BOOTS.get()), 10, 5, 0.15f));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(ForestModItems.SILVER_SWORD.get()), 10, 5, 0.15f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(ForestModItems.SILVER_INGOT.get(), 8), new ItemStack(Items.EMERALD), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FLETCHER) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 7), new ItemStack(Items.LEATHER, 2), new ItemStack(ForestModItems.QUIVER.get()), 10, 5, 0.05f));
		}
	}
}
