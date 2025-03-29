
package ru.power_umc.forestxreborn.item;

import ru.power_umc.forestxreborn.procedures.LettuceSeedPriNazhatiiPravoiKnopkoiMyshiProcedure;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

public class LettuceSeedsItem extends Item {
	public LettuceSeedsItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}

	@Override
	public float getDestroySpeed(ItemStack itemstack, BlockState state) {
		return 0f;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		LettuceSeedPriNazhatiiPravoiKnopkoiMyshiProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
