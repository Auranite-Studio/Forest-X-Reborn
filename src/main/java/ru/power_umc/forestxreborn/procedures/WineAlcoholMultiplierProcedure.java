package ru.power_umc.forestxreborn.procedures;

import ru.power_umc.forestxreborn.network.ForestModVariables;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class WineAlcoholMultiplierProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 400, 1, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.HASTE, 3000, 3, false, false));
		{
			ForestModVariables.PlayerVariables _vars = entity.getData(ForestModVariables.PLAYER_VARIABLES);
			_vars.alcohol = entity.getData(ForestModVariables.PLAYER_VARIABLES).alcohol + 0.3;
			_vars.syncPlayerVariables(entity);
		}
	}
}
