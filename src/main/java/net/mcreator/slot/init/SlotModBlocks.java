
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slot.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.slot.block.ScarredearthBlock;
import net.mcreator.slot.block.ScarredWoodBlock;
import net.mcreator.slot.block.ScarredStairsBlock;
import net.mcreator.slot.block.ScarredSlabBlock;
import net.mcreator.slot.block.ScarredPressurePlateBlock;
import net.mcreator.slot.block.ScarredPlanksBlock;
import net.mcreator.slot.block.ScarredLogBlock;
import net.mcreator.slot.block.ScarredLeavesBlock;
import net.mcreator.slot.block.ScarredFenceGateBlock;
import net.mcreator.slot.block.ScarredFenceBlock;
import net.mcreator.slot.block.ScarredButtonBlock;
import net.mcreator.slot.block.RubyworldPortalBlock;
import net.mcreator.slot.block.RubyoreBlock;
import net.mcreator.slot.block.RubydirtBlock;
import net.mcreator.slot.block.RubyBlockBlock;
import net.mcreator.slot.block.RubinGemBlock;
import net.mcreator.slot.block.LeaveswolfforestBlock;
import net.mcreator.slot.SlotMod;

public class SlotModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SlotMod.MODID);
	public static final RegistryObject<Block> RUBY_BLOCK = REGISTRY.register("ruby_block", () -> new RubyBlockBlock());
	public static final RegistryObject<Block> RUBYWORLD_PORTAL = REGISTRY.register("rubyworld_portal", () -> new RubyworldPortalBlock());
	public static final RegistryObject<Block> RUBYDIRT = REGISTRY.register("rubydirt", () -> new RubydirtBlock());
	public static final RegistryObject<Block> SCARREDEARTH = REGISTRY.register("scarredearth", () -> new ScarredearthBlock());
	public static final RegistryObject<Block> RUBIN_GEM = REGISTRY.register("rubin_gem", () -> new RubinGemBlock());
	public static final RegistryObject<Block> RUBYORE = REGISTRY.register("rubyore", () -> new RubyoreBlock());
	public static final RegistryObject<Block> SCARRED_WOOD = REGISTRY.register("scarred_wood", () -> new ScarredWoodBlock());
	public static final RegistryObject<Block> SCARRED_LOG = REGISTRY.register("scarred_log", () -> new ScarredLogBlock());
	public static final RegistryObject<Block> SCARRED_PLANKS = REGISTRY.register("scarred_planks", () -> new ScarredPlanksBlock());
	public static final RegistryObject<Block> SCARRED_LEAVES = REGISTRY.register("scarred_leaves", () -> new ScarredLeavesBlock());
	public static final RegistryObject<Block> SCARRED_STAIRS = REGISTRY.register("scarred_stairs", () -> new ScarredStairsBlock());
	public static final RegistryObject<Block> SCARRED_SLAB = REGISTRY.register("scarred_slab", () -> new ScarredSlabBlock());
	public static final RegistryObject<Block> SCARRED_FENCE = REGISTRY.register("scarred_fence", () -> new ScarredFenceBlock());
	public static final RegistryObject<Block> SCARRED_FENCE_GATE = REGISTRY.register("scarred_fence_gate", () -> new ScarredFenceGateBlock());
	public static final RegistryObject<Block> SCARRED_PRESSURE_PLATE = REGISTRY.register("scarred_pressure_plate", () -> new ScarredPressurePlateBlock());
	public static final RegistryObject<Block> SCARRED_BUTTON = REGISTRY.register("scarred_button", () -> new ScarredButtonBlock());
	public static final RegistryObject<Block> LEAVESWOLFFOREST = REGISTRY.register("leaveswolfforest", () -> new LeaveswolfforestBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			RubydirtBlock.blockColorLoad(event);
			ScarredearthBlock.blockColorLoad(event);
		}
	}
}
