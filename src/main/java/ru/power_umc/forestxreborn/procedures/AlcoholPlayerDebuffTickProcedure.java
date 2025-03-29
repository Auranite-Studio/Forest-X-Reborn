package ru.power_umc.forestxreborn.procedures;

import ru.power_umc.forestxreborn.network.ForestModVariables;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import javax.annotation.Nullable;

@EventBusSubscriber
public class AlcoholPlayerDebuffTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(ForestModVariables.PLAYER_VARIABLES).alcohol >= 1) {
			if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MobEffects.WEAKNESS))) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 600, 1, false, false));
			}
		}
		if (entity.getData(ForestModVariables.PLAYER_VARIABLES).alcohol >= 1.5) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.NAUSEA, 100, 0, false, false));
		}
		if (entity.getData(ForestModVariables.PLAYER_VARIABLES).alcohol >= 1.8) {
			if (!(entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(MobEffects.HUNGER))) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 600, 0, false, false));
			}
		}
		if (entity.getData(ForestModVariables.PLAYER_VARIABLES).alcohol >= 2) {
			if (!(entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(MobEffects.MINING_FATIGUE))) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MINING_FATIGUE, 600, 2, false, false));
			}
		}
		if (entity.getData(ForestModVariables.PLAYER_VARIABLES).alcohol >= 3) {
			if (!(entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(MobEffects.POISON))) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 600, 1, false, false));
			}
		}
		if (entity.getData(ForestModVariables.PLAYER_VARIABLES).alcoholTimer > 0) {
			{
				ForestModVariables.PlayerVariables _vars = entity.getData(ForestModVariables.PLAYER_VARIABLES);
				_vars.alcoholTimer = entity.getData(ForestModVariables.PLAYER_VARIABLES).alcoholTimer - 1;
				_vars.syncPlayerVariables(entity);
			}
		} else {
			{
				ForestModVariables.PlayerVariables _vars = entity.getData(ForestModVariables.PLAYER_VARIABLES);
				_vars.alcoholTimer = 1800;
				_vars.syncPlayerVariables(entity);
			}
			if (entity.getData(ForestModVariables.PLAYER_VARIABLES).alcohol >= 0.05) {
				{
					ForestModVariables.PlayerVariables _vars = entity.getData(ForestModVariables.PLAYER_VARIABLES);
					_vars.alcohol = entity.getData(ForestModVariables.PLAYER_VARIABLES).alcohol - 0.05;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}
