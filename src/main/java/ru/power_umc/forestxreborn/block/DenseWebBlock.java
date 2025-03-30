
package ru.power_umc.forestxreborn.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class DenseWebBlock extends Block {
	public DenseWebBlock(BlockBehaviour.Properties properties) {
		super(properties.ignitedByLava().sound(SoundType.WOOL).strength(2f, 100f).speedFactor(0.1f).jumpFactor(0.1f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
