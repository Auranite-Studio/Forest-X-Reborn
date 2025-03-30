
package ru.power_umc.forestxreborn.block;

import ru.power_umc.forestxreborn.init.ForestModBlocks;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class MoonshroomBlock extends FlowerBlock {
	public MoonshroomBlock(BlockBehaviour.Properties properties) {
		super(MobEffects.INVISIBILITY, 200, properties.mapColor(MapColor.PLANT).sound(SoundType.FUNGUS).instabreak().lightLevel(s -> 5).noCollission().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(Blocks.STONE) || groundState.is(Blocks.GRANITE) || groundState.is(Blocks.DIORITE) || groundState.is(Blocks.ANDESITE) || groundState.is(ForestModBlocks.RHYOLITE.get()) || groundState.is(Blocks.DEEPSLATE)
				|| groundState.is(Blocks.MYCELIUM);
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}
}
