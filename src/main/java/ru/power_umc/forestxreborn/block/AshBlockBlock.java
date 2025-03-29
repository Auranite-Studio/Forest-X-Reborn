
package ru.power_umc.forestxreborn.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.util.TriState;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import com.mojang.serialization.MapCodec;

public class AshBlockBlock extends FallingBlock {
	public static final MapCodec<AshBlockBlock> CODEC = simpleCodec(AshBlockBlock::new);

	public MapCodec<AshBlockBlock> codec() {
		return CODEC;
	}

	@Override
	public int getDustColor(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
		return 0;
	}

	public AshBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.SAND).strength(0.2f, 5f).requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	@Override
	public TriState canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, BlockState plant) {
		return TriState.TRUE;
	}
}
