
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slot.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.slot.world.biome.WolfforestBiome;
import net.mcreator.slot.world.biome.ScarredwastelandBiome;
import net.mcreator.slot.world.biome.ScarlandsBiome;
import net.mcreator.slot.world.biome.BloodySnowValleyBiome;
import net.mcreator.slot.SlotMod;

public class SlotModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, SlotMod.MODID);
	public static final RegistryObject<Biome> SCARLANDS = REGISTRY.register("scarlands", ScarlandsBiome::createBiome);
	public static final RegistryObject<Biome> SCARREDWASTELAND = REGISTRY.register("scarredwasteland", ScarredwastelandBiome::createBiome);
	public static final RegistryObject<Biome> WOLFFOREST = REGISTRY.register("wolfforest", WolfforestBiome::createBiome);
	public static final RegistryObject<Biome> BLOODY_SNOW_VALLEY = REGISTRY.register("bloody_snow_valley", BloodySnowValleyBiome::createBiome);
}
