
package ru.power_umc.forestxreborn.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class RawGingerbreadBlockBlock extends Block {
	public RawGingerbreadBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.SLIME_BLOCK).strength(2f, 5f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
