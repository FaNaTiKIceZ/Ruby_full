
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slot.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.slot.SlotMod;

public class SlotModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, SlotMod.MODID);
	public static final RegistryObject<SoundEvent> CHUNDRA_DEATH = REGISTRY.register("chundra_death", () -> new SoundEvent(new ResourceLocation("slot", "chundra_death")));
	public static final RegistryObject<SoundEvent> MUSIC_OF_THE_FOREST_OF_WOLVES_BIOME = REGISTRY.register("music_of_the_forest_of_wolves_biome", () -> new SoundEvent(new ResourceLocation("slot", "music_of_the_forest_of_wolves_biome")));
}
