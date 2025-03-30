
package ru.power_umc.forestxreborn.item;

import ru.power_umc.forestxreborn.procedures.RyeSeedsPriShchielchkiePKMPoBlokuProcedure;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

public class RyeSeedsItem extends Item {
	public RyeSeedsItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		RyeSeedsPriShchielchkiePKMPoBlokuProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
