
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.forestxreborn.init;

import ru.power_umc.forestxreborn.ForestMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class ForestModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, ForestMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> LIZARD_AMBIENT = REGISTRY.register("lizard.ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("forest", "lizard.ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> LIZARD_HURT = REGISTRY.register("lizard.hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("forest", "lizard.hurt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> RECORD_STROFA = REGISTRY.register("record.strofa", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("forest", "record.strofa")));
	public static final DeferredHolder<SoundEvent, SoundEvent> CALIBRI_HURT = REGISTRY.register("calibri.hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("forest", "calibri.hurt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> CALIBRI_AMBIENT = REGISTRY.register("calibri.ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("forest", "calibri.ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> RAT_AMBIENT = REGISTRY.register("rat.ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("forest", "rat.ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> RAT_HURT = REGISTRY.register("rat.hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("forest", "rat.hurt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> CROCODILE_DEAD = REGISTRY.register("crocodile.dead", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("forest", "crocodile.dead")));
	public static final DeferredHolder<SoundEvent, SoundEvent> CROCODILE_HURT = REGISTRY.register("crocodile.hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("forest", "crocodile.hurt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SCORPION_AMBIENT = REGISTRY.register("scorpion.ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("forest", "scorpion.ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SCORPION_HURT = REGISTRY.register("scorpion.hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("forest", "scorpion.hurt")));
}
