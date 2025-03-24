
package ru.power_umc.forestxreborn.world.features;

import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.SimpleBlockFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

public class BlueberriesBushFeatureFeature extends SimpleBlockFeature {
	public BlueberriesBushFeatureFeature() {
		super(SimpleBlockConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<SimpleBlockConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!BlueberriesBushFeatureAdditionalGenerationConditionProcedure.execute())
			return false;
		return super.place(context);
	}
}
