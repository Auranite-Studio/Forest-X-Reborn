
package ru.power_umc.forestxreborn.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class ChiseledRhyoliteBlock extends Block {
	public ChiseledRhyoliteBlock(BlockBehaviour.Properties properties) {
		super(properties.instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(2f, 100f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
