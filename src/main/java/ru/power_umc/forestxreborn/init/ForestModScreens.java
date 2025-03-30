
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.forestxreborn.init;

import ru.power_umc.forestxreborn.client.gui.QuiverInventoryScreen;
import ru.power_umc.forestxreborn.client.gui.FermentationBarrelScreenScreen;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ForestModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(ForestModMenus.QUIVER_INVENTORY.get(), QuiverInventoryScreen::new);
		event.register(ForestModMenus.FERMENTATION_BARREL_SCREEN.get(), FermentationBarrelScreenScreen::new);
	}
}
