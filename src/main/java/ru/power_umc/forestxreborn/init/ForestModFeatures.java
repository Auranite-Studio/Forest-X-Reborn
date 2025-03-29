
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.forestxreborn.init;

import ru.power_umc.forestxreborn.world.features.SwampOakTreeFeature;
import ru.power_umc.forestxreborn.world.features.RaspberriesBushFeatureFeature;
import ru.power_umc.forestxreborn.world.features.OldOakTreeFeature;
import ru.power_umc.forestxreborn.world.features.BlueberriesBushFeatureFeature;
import ru.power_umc.forestxreborn.ForestMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.core.registries.Registries;

public class ForestModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(Registries.FEATURE, ForestMod.MODID);
	public static final DeferredHolder<Feature<?>, Feature<?>> BLUEBERRIES_BUSH_FEATURE = REGISTRY.register("blueberries_bush_feature", BlueberriesBushFeatureFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> RASPBERRIES_BUSH_FEATURE = REGISTRY.register("raspberries_bush_feature", RaspberriesBushFeatureFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> OLD_OAK_TREE = REGISTRY.register("old_oak_tree", OldOakTreeFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> SWAMP_OAK_TREE = REGISTRY.register("swamp_oak_tree", SwampOakTreeFeature::new);
}
