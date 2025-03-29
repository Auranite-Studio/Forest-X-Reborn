package ru.power_umc.forestxreborn.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class MulberrySaplingObnovlieniieTikaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 3, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 4, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 5, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 6, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 7, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 8, z))).getBlock() == Blocks.AIR) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("age", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "age") + 1));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "age") == 16 && Math.random() < 0.5 && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 3, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 4, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 5, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 6, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 7, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 8, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("forest", "mulberry_7"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y, z - 4), BlockPos.containing(x - 3, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 2) == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("forest", "mulberry_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z - 2), BlockPos.containing(x - 2, y, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "age") == 20 && Math.random() < 0.7 && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 3, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 4, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 5, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 6, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 7, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 8, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("forest", "mulberry_7"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y, z - 4), BlockPos.containing(x - 3, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 2) == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("forest", "mulberry_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z - 2), BlockPos.containing(x - 2, y, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "age") == 24 && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 3, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 4, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 5, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 6, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 7, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 8, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("forest", "mulberry_7"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y, z - 4), BlockPos.containing(x - 3, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 2) == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("forest", "mulberry_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z - 2), BlockPos.containing(x - 2, y, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "age") == 24
				&& !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.AIR
						&& (world.getBlockState(BlockPos.containing(x, y + 3, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 4, z))).getBlock() == Blocks.AIR
						&& (world.getBlockState(BlockPos.containing(x, y + 5, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 6, z))).getBlock() == Blocks.AIR
						&& (world.getBlockState(BlockPos.containing(x, y + 7, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 8, z))).getBlock() == Blocks.AIR)) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("age", 16);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
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
