
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.forestxreborn.init;

import ru.power_umc.forestxreborn.world.inventory.QuiverInventoryMenu;
import ru.power_umc.forestxreborn.world.inventory.FermentationBarrelScreenMenu;
import ru.power_umc.forestxreborn.ForestMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

public class ForestModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, ForestMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<QuiverInventoryMenu>> QUIVER_INVENTORY = REGISTRY.register("quiver_inventory", () -> IMenuTypeExtension.create(QuiverInventoryMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<FermentationBarrelScreenMenu>> FERMENTATION_BARREL_SCREEN = REGISTRY.register("fermentation_barrel_screen", () -> IMenuTypeExtension.create(FermentationBarrelScreenMenu::new));
}
