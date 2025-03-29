package ru.power_umc.forestxreborn.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class FermentationBarrelSpontannoNaStoronieKliientaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double fireHeight = 0;
		double particleRadius = 0;
		double particleAmount = 0;
		if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "craftingProgress") > 0) {
			if (Math.random() < 0.2) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.brewing_stand.brew")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.brewing_stand.brew")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			}
		}
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDoubleOr(tag, -1);
		return -1;
	}
}
