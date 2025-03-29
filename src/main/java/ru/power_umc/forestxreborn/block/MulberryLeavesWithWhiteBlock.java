
package ru.power_umc.forestxreborn.block;

import ru.power_umc.forestxreborn.procedures.MulberryLeavesWithWhitePriShchielchkiePKMPoBlokuProcedure;

import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.util.RandomSource;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import com.mojang.serialization.MapCodec;

public class MulberryLeavesWithWhiteBlock extends LeavesBlock {
	@Override
	public MapCodec<? extends LeavesBlock> codec() {
		return null;
	}

	@Override
	protected void spawnFallingLeavesParticle(Level level, BlockPos blockPos, RandomSource randomSource) {
	}

	public MulberryLeavesWithWhiteBlock(BlockBehaviour.Properties properties) {
		super(1f, properties.ignitedByLava().sound(SoundType.GRASS).strength(0.2f).noOcclusion());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 1;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 30;
	}

	@Override
	public InteractionResult useWithoutItem(BlockState blockstate, Level world, BlockPos pos, Player entity, BlockHitResult hit) {
		super.useWithoutItem(blockstate, world, pos, entity, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		MulberryLeavesWithWhitePriShchielchkiePKMPoBlokuProcedure.execute(world, x, y, z);
		return InteractionResult.SUCCESS;
	}
}
