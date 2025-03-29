
package ru.power_umc.forestxreborn.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class RhyoliteStairsBlock extends StairBlock {
	public RhyoliteStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(2f, 100f));
	}

	@Override
	public float getExplosionResistance() {
		return 100f;
	}
}
