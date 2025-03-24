
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.forestxreborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import com.esmods.forestxreborn.ForestMod;

public class ForestModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ForestMod.MODID);
	public static final RegistryObject<SoundEvent> LIZARD_AMBIENT = REGISTRY.register("lizard.ambient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("forest", "lizard.ambient")));
	public static final RegistryObject<SoundEvent> LIZARD_HURT = REGISTRY.register("lizard.hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("forest", "lizard.hurt")));
	public static final RegistryObject<SoundEvent> RECORD_STROFA = REGISTRY.register("record.strofa", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("forest", "record.strofa")));
	public static final RegistryObject<SoundEvent> CALIBRI_HURT = REGISTRY.register("calibri.hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("forest", "calibri.hurt")));
	public static final RegistryObject<SoundEvent> CALIBRI_AMBIENT = REGISTRY.register("calibri.ambient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("forest", "calibri.ambient")));
	public static final RegistryObject<SoundEvent> RAT_AMBIENT = REGISTRY.register("rat.ambient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("forest", "rat.ambient")));
	public static final RegistryObject<SoundEvent> RAT_HURT = REGISTRY.register("rat.hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("forest", "rat.hurt")));
	public static final RegistryObject<SoundEvent> CROCODILE_DEAD = REGISTRY.register("crocodile.dead", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("forest", "crocodile.dead")));
	public static final RegistryObject<SoundEvent> CROCODILE_HURT = REGISTRY.register("crocodile.hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("forest", "crocodile.hurt")));
	public static final RegistryObject<SoundEvent> SCORPION_AMBIENT = REGISTRY.register("scorpion.ambient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("forest", "scorpion.ambient")));
	public static final RegistryObject<SoundEvent> SCORPION_HURT = REGISTRY.register("scorpion.hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("forest", "scorpion.hurt")));
}
