
package ru.power_umc.forestxreborn.world.features;

import ru.power_umc.forestxreborn.procedures.SwampOakTreeDopolnitielnoieUsloviieGienieratsiiProcedure;

import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

public class SwampOakTreeFeature extends TreeFeature {
	public SwampOakTreeFeature() {
		super(TreeConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<TreeConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!SwampOakTreeDopolnitielnoieUsloviieGienieratsiiProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
