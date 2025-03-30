
package ru.power_umc.forestxreborn.block;

import ru.power_umc.forestxreborn.procedures.DenseWebWithSpiderKoghdaBlokRazrushienIghrokomProcedure;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

public class DenseWebWithSpiderBlock extends Block {
	public DenseWebWithSpiderBlock(BlockBehaviour.Properties properties) {
		super(properties.ignitedByLava().sound(SoundType.WOOL).strength(2f, 100f).speedFactor(0.1f).jumpFactor(0.1f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		DenseWebWithSpiderKoghdaBlokRazrushienIghrokomProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		return retval;
	}
}
