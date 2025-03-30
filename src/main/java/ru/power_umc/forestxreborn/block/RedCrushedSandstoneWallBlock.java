
package ru.power_umc.forestxreborn.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class RedCrushedSandstoneWallBlock extends WallBlock {
	public RedCrushedSandstoneWallBlock(BlockBehaviour.Properties properties) {
		super(properties.instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(2.5f, 50f).requiresCorrectToolForDrops().forceSolidOn());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 3;
	}
}
