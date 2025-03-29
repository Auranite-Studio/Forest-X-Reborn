package ru.power_umc.forestxreborn.procedures;

import ru.power_umc.forestxreborn.init.ForestModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SwampOakTreeDopolnitielnoieUsloviieGienieratsiiProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ForestModBlocks.PEAT.get();
	}
}
