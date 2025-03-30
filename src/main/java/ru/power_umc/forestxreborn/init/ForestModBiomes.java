
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.forestxreborn.init;

import net.neoforged.neoforge.event.server.ServerAboutToStartEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.biome.FeatureSorter;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import java.util.List;
import java.util.ArrayList;

import com.mojang.datafixers.util.Pair;

import com.google.common.base.Suppliers;

@EventBusSubscriber
public class ForestModBiomes {
	@SubscribeEvent
	public static void onServerAboutToStart(ServerAboutToStartEvent event) {
		MinecraftServer server = event.getServer();
		Registry<DimensionType> dimensionTypeRegistry = server.registryAccess().lookupOrThrow(Registries.DIMENSION_TYPE);
		Registry<LevelStem> levelStemTypeRegistry = server.registryAccess().lookupOrThrow(Registries.LEVEL_STEM);
		Registry<Biome> biomeRegistry = server.registryAccess().lookupOrThrow(Registries.BIOME);
		for (LevelStem levelStem : levelStemTypeRegistry.stream().toList()) {
			DimensionType dimensionType = levelStem.type().value();
			if (dimensionType == dimensionTypeRegistry.getOrThrow(BuiltinDimensionTypes.OVERWORLD).getDelegate().value()) {
				ChunkGenerator chunkGenerator = levelStem.generator();
				// Inject biomes to biome source
				if (chunkGenerator.getBiomeSource() instanceof MultiNoiseBiomeSource noiseSource) {
					List<Pair<Climate.ParameterPoint, Holder<Biome>>> parameters = new ArrayList<>(noiseSource.parameters().values());
					addParameterPoint(parameters, new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.45f, 0.2f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.11f, 1f), Climate.Parameter.span(0.55f, 1f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.05f, 0.2666f), 0), biomeRegistry.getOrThrow(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "peatbog")))));
					addParameterPoint(parameters, new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.45f, 0.2f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.11f, 1f), Climate.Parameter.span(0.55f, 1f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.05f, 0.2666f), 0), biomeRegistry.getOrThrow(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "peatbog")))));
					addParameterPoint(parameters, new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.5f, 1f), Climate.Parameter.span(-1f, -0.35f), Climate.Parameter.span(-0.11f, 1f), Climate.Parameter.span(0.05f, 0.55f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(0.05f, 0.2666f), 0), biomeRegistry.getOrThrow(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "semidesert")))));
					addParameterPoint(parameters, new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.5f, 1f), Climate.Parameter.span(-1f, -0.35f), Climate.Parameter.span(-0.11f, 1f), Climate.Parameter.span(0.05f, 0.55f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(0.05f, 0.2666f), 0), biomeRegistry.getOrThrow(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "semidesert")))));
					addParameterPoint(parameters, new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.2f, 0.55f), Climate.Parameter.span(-0.35f, -0.01f), Climate.Parameter.span(0.03f, 1f), Climate.Parameter.span(-0.375f, 0.05f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(0.05f, 0.2666f), 0), biomeRegistry.getOrThrow(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "dry_thorn_forest")))));
					addParameterPoint(parameters, new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.2f, 0.55f), Climate.Parameter.span(-0.35f, -0.01f), Climate.Parameter.span(0.03f, 1f), Climate.Parameter.span(-0.375f, 0.05f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(0.05f, 0.2666f), 0), biomeRegistry.getOrThrow(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "dry_thorn_forest")))));
					addParameterPoint(parameters, new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.2f, 0.55f), Climate.Parameter.span(0.1f, 0.3f), Climate.Parameter.span(-0.11f, 1f), Climate.Parameter.span(-1f, 1f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(0.2666f, 0.4f), 0), biomeRegistry.getOrThrow(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "eucalyptus_forest")))));
					addParameterPoint(parameters, new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.2f, 0.55f), Climate.Parameter.span(0.1f, 0.3f), Climate.Parameter.span(-0.11f, 1f), Climate.Parameter.span(-1f, 1f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(0.2666f, 0.4f), 0), biomeRegistry.getOrThrow(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "eucalyptus_forest")))));
					addParameterPoint(parameters, new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-1f, -0.45f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.11f, 1f), Climate.Parameter.span(0.5499f, 1f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.05f, 0.2666f), 0), biomeRegistry.getOrThrow(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "frozen_swamp")))));
					addParameterPoint(parameters, new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-1f, -0.45f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.11f, 1f), Climate.Parameter.span(0.5499f, 1f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.05f, 0.2666f), 0), biomeRegistry.getOrThrow(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "frozen_swamp")))));
					addParameterPoint(parameters, new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-1f, -0.45f), Climate.Parameter.span(-1f, -0.35f), Climate.Parameter.span(0.03f, 1f), Climate.Parameter.span(-0.2225f, 0.55f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(0.05f, 0.2666f), 0), biomeRegistry.getOrThrow(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "ice_desert")))));
					addParameterPoint(parameters, new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-1f, -0.45f), Climate.Parameter.span(-1f, -0.35f), Climate.Parameter.span(0.03f, 1f), Climate.Parameter.span(-0.2225f, 0.55f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(0.05f, 0.2666f), 0), biomeRegistry.getOrThrow(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "ice_desert")))));
					addParameterPoint(parameters, new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.15f, 0.2f), Climate.Parameter.span(-0.1f, 0.3f), Climate.Parameter.span(0.03f, 1f), Climate.Parameter.span(-0.375f, 0.55f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(0.05f, 0.2666f), 0), biomeRegistry.getOrThrow(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "old_growth_oak_forest")))));
					addParameterPoint(parameters, new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.15f, 0.2f), Climate.Parameter.span(-0.1f, 0.3f), Climate.Parameter.span(0.03f, 1f), Climate.Parameter.span(-0.375f, 0.55f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(0.05f, 0.2666f), 0), biomeRegistry.getOrThrow(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "old_growth_oak_forest")))));
					addParameterPoint(parameters, new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.19f, 1f), Climate.Parameter.span(-1f, -0.7799f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.7666f, -0.5666f), 0), biomeRegistry.getOrThrow(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "volcanic_peaks")))));
					addParameterPoint(parameters, new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.19f, 1f), Climate.Parameter.span(-1f, -0.7799f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.7666f, -0.5666f), 0), biomeRegistry.getOrThrow(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "volcanic_peaks")))));
					addParameterPoint(parameters, new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.33f, 0.5f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(0.45f, 1f),
							Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(-0.1f, 0.1f), 0), biomeRegistry.getOrThrow(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "marble_caves")))));
					addParameterPoint(parameters, new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.5f, 1f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(0.45f, 1f),
							Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(-0.1f, 0.1f), 0), biomeRegistry.getOrThrow(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "mushrooms_caves")))));
					chunkGenerator.biomeSource = MultiNoiseBiomeSource.createFromList(new Climate.ParameterList<>(parameters));
					chunkGenerator.featuresPerStep = Suppliers
							.memoize(() -> FeatureSorter.buildFeaturesPerStep(List.copyOf(chunkGenerator.biomeSource.possibleBiomes()), biome -> chunkGenerator.generationSettingsGetter.apply(biome).features(), true));
				}
				// Inject surface rules
				if (chunkGenerator instanceof NoiseBasedChunkGenerator noiseGenerator) {
					NoiseGeneratorSettings noiseGeneratorSettings = noiseGenerator.settings.value();
					SurfaceRules.RuleSource currentRuleSource = noiseGeneratorSettings.surfaceRule();
					if (currentRuleSource instanceof SurfaceRules.SequenceRuleSource sequenceRuleSource) {
						List<SurfaceRules.RuleSource> surfaceRules = new ArrayList<>(sequenceRuleSource.sequence());
						addSurfaceRule(surfaceRules, 1, anySurfaceRule(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "marble_caves")), ForestModBlocks.MARBLE.get().defaultBlockState(),
								ForestModBlocks.MARBLE.get().defaultBlockState(), ForestModBlocks.MARBLE.get().defaultBlockState()));
						addSurfaceRule(surfaceRules, 1, anySurfaceRule(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "mushrooms_caves")), Blocks.MYCELIUM.defaultBlockState(), Blocks.DIRT.defaultBlockState(),
								Blocks.DIRT.defaultBlockState()));
						addSurfaceRule(surfaceRules, 1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "peatbog")), ForestModBlocks.PEAT.get().defaultBlockState(),
								Blocks.COARSE_DIRT.defaultBlockState(), ForestModBlocks.PEAT.get().defaultBlockState()));
						addSurfaceRule(surfaceRules, 1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "semidesert")), Blocks.SAND.defaultBlockState(), Blocks.SAND.defaultBlockState(),
								Blocks.SAND.defaultBlockState()));
						addSurfaceRule(surfaceRules, 1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "dry_thorn_forest")), Blocks.GRASS_BLOCK.defaultBlockState(),
								Blocks.DIRT.defaultBlockState(), Blocks.DIRT.defaultBlockState()));
						addSurfaceRule(surfaceRules, 1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "eucalyptus_forest")), Blocks.GRASS_BLOCK.defaultBlockState(),
								Blocks.DIRT.defaultBlockState(), Blocks.DIRT.defaultBlockState()));
						addSurfaceRule(surfaceRules, 1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "frozen_swamp")), Blocks.GRASS_BLOCK.defaultBlockState(),
								Blocks.DIRT.defaultBlockState(), Blocks.CLAY.defaultBlockState()));
						addSurfaceRule(surfaceRules, 1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "ice_desert")), Blocks.SAND.defaultBlockState(), Blocks.SANDSTONE.defaultBlockState(),
								Blocks.SAND.defaultBlockState()));
						addSurfaceRule(surfaceRules, 1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "old_growth_oak_forest")), Blocks.GRASS_BLOCK.defaultBlockState(),
								Blocks.DIRT.defaultBlockState(), Blocks.DIRT.defaultBlockState()));
						addSurfaceRule(surfaceRules, 1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("forest", "volcanic_peaks")), ForestModBlocks.ASH_BLOCK.get().defaultBlockState(),
								ForestModBlocks.ASH_BLOCK.get().defaultBlockState(), Blocks.BASALT.defaultBlockState()));
						NoiseGeneratorSettings moddedNoiseGeneratorSettings = new NoiseGeneratorSettings(noiseGeneratorSettings.noiseSettings(), noiseGeneratorSettings.defaultBlock(), noiseGeneratorSettings.defaultFluid(),
								noiseGeneratorSettings.noiseRouter(), SurfaceRules.sequence(surfaceRules.toArray(SurfaceRules.RuleSource[]::new)), noiseGeneratorSettings.spawnTarget(), noiseGeneratorSettings.seaLevel(),
								noiseGeneratorSettings.disableMobGeneration(), noiseGeneratorSettings.aquifersEnabled(), noiseGeneratorSettings.oreVeinsEnabled(), noiseGeneratorSettings.useLegacyRandomSource());
						noiseGenerator.settings = new Holder.Direct<>(moddedNoiseGeneratorSettings);
					}
				}
			}
		}
	}

	private static SurfaceRules.RuleSource preliminarySurfaceRule(ResourceKey<Biome> biomeKey, BlockState groundBlock, BlockState undergroundBlock, BlockState underwaterBlock) {
		return SurfaceRules.ifTrue(SurfaceRules.isBiome(biomeKey),
				SurfaceRules.ifTrue(SurfaceRules.abovePreliminarySurface(),
						SurfaceRules.sequence(
								SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR),
										SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), SurfaceRules.state(groundBlock)), SurfaceRules.state(underwaterBlock))),
								SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR), SurfaceRules.state(undergroundBlock)))));
	}

	private static SurfaceRules.RuleSource anySurfaceRule(ResourceKey<Biome> biomeKey, BlockState groundBlock, BlockState undergroundBlock, BlockState underwaterBlock) {
		return SurfaceRules.ifTrue(SurfaceRules.isBiome(biomeKey),
				SurfaceRules.sequence(
						SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR),
								SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), SurfaceRules.state(groundBlock)), SurfaceRules.state(underwaterBlock))),
						SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR), SurfaceRules.state(undergroundBlock))));
	}

	private static void addParameterPoint(List<Pair<Climate.ParameterPoint, Holder<Biome>>> parameters, Pair<Climate.ParameterPoint, Holder<Biome>> point) {
		if (!parameters.contains(point))
			parameters.add(point);
	}

	private static void addSurfaceRule(List<SurfaceRules.RuleSource> surfaceRules, int index, SurfaceRules.RuleSource rule) {
		if (!surfaceRules.contains(rule)) {
			if (index >= surfaceRules.size()) {
				surfaceRules.add(rule);
			} else {
				surfaceRules.add(index, rule);
			}
		}
	}
}
