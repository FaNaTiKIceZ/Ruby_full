
package net.mcreator.slot.world.biome;

import net.minecraft.world.level.levelgen.placement.SurfaceWaterDepthFilter;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.AmbientMoodSettings;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;

import net.mcreator.slot.world.features.treedecorators.WolfforestTrunkDecorator;
import net.mcreator.slot.world.features.treedecorators.WolfforestLeaveDecorator;
import net.mcreator.slot.world.features.treedecorators.WolfforestFruitDecorator;
import net.mcreator.slot.init.SlotModBlocks;

import java.util.List;

import com.google.common.collect.ImmutableList;

public class WolfforestBiome {
	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-10543424).waterColor(-10066177).waterFogColor(-6710785).skyColor(-10543424).foliageColorOverride(-6710785).grassColorOverride(-6684775)
				.ambientLoopSound(new SoundEvent(new ResourceLocation("slot:music_of_the_forest_of_wolves_biome"))).ambientMoodSound(new AmbientMoodSettings(new SoundEvent(new ResourceLocation("ambient.cave")), 2000, 8, 2)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("slot:tree_wolfforest",
						FeatureUtils.register("slot:tree_wolfforest", Feature.TREE,
								new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.SPRUCE_LOG.defaultBlockState()), new StraightTrunkPlacer(8, 2, 0),
										BlockStateProvider.simple(SlotModBlocks.LEAVESWOLFFOREST.get().defaultBlockState()), new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1))
										.decorators(ImmutableList.of(WolfforestLeaveDecorator.INSTANCE, WolfforestTrunkDecorator.INSTANCE, WolfforestFruitDecorator.INSTANCE)).build()),
						List.of(CountPlacement.of(7), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, PlacementUtils.register("slot:brown_mushroom_wolfforest", VegetationFeatures.PATCH_BROWN_MUSHROOM,
				List.of(CountPlacement.of(6), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, PlacementUtils.register("slot:red_mushroom_wolfforest", VegetationFeatures.PATCH_RED_MUSHROOM,
				List.of(CountPlacement.of(6), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("slot:mushrooms_huge_wolfforest", VegetationFeatures.MUSHROOM_ISLAND_VEGETATION, List.of(CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).temperature(0.4f).downfall(0.6f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}
}
