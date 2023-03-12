
package net.mcreator.slot.world.biome;

import net.minecraft.world.level.levelgen.placement.SurfaceWaterDepthFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.RuleBasedBlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.DiskConfiguration;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.AmbientParticleSettings;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.slot.init.SlotModBlocks;

import java.util.List;

public class BloodySnowValleyBiome {
	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-10066330).waterColor(-13108).waterFogColor(-26215).skyColor(-10066330).foliageColorOverride(-3355444).grassColorOverride(-26215)
				.ambientParticle(new AmbientParticleSettings(ParticleTypes.ITEM_SNOWBALL, 0.009f)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("slot:tree_bloody_snow_valley",
						FeatureUtils.register("slot:tree_bloody_snow_valley", Feature.TREE,
								new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(SlotModBlocks.SCARRED_LOG.get().defaultBlockState()), new StraightTrunkPlacer(3, 2, 0),
										BlockStateProvider.simple(SlotModBlocks.SCARRED_LEAVES.get().defaultBlockState()), new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build()),
						List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("slot:disk_sand_bloody_snow_valley",
						FeatureUtils.register("slot:disk_sand_bloody_snow_valley", Feature.DISK,
								new DiskConfiguration(RuleBasedBlockStateProvider.simple(Blocks.SAND), BlockPredicate.matchesBlocks(List.of(Blocks.SNOW, SlotModBlocks.SCARREDEARTH.get())), UniformInt.of(2, 6), 2)),
						List.of(CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("slot:disk_gravel_bloody_snow_valley",
						FeatureUtils.register("slot:disk_gravel_bloody_snow_valley", Feature.DISK,
								new DiskConfiguration(RuleBasedBlockStateProvider.simple(Blocks.GRAVEL), BlockPredicate.matchesBlocks(List.of(Blocks.SNOW, SlotModBlocks.SCARREDEARTH.get())), UniformInt.of(2, 5), 2)),
						List.of(CountPlacement.of(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome())));
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.SNOW).temperature(0f).downfall(1f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}
}
