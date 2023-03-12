
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slot.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.slot.item.VkladkaItem;
import net.mcreator.slot.item.RubyworldItem;
import net.mcreator.slot.item.Ruby_equipmentSwordItem;
import net.mcreator.slot.item.Ruby_equipmentShovelItem;
import net.mcreator.slot.item.Ruby_equipmentPickaxeItem;
import net.mcreator.slot.item.Ruby_equipmentHoeItem;
import net.mcreator.slot.item.Ruby_equipmentAxeItem;
import net.mcreator.slot.item.Ruby_armorArmorItem;
import net.mcreator.slot.item.RubyItem;
import net.mcreator.slot.item.HeartarrowItem;
import net.mcreator.slot.item.GlowingrubyingotItem;
import net.mcreator.slot.item.AxeboostItem;
import net.mcreator.slot.item.AntiscarbowItem;
import net.mcreator.slot.item.ABottlewithascarItem;
import net.mcreator.slot.SlotMod;

public class SlotModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SlotMod.MODID);
	public static final RegistryObject<Item> RIDIK_SPAWN_EGG = REGISTRY.register("ridik_spawn_egg", () -> new ForgeSpawnEggItem(SlotModEntities.RIDIK, -13434880, -16751002, new Item.Properties().tab(SlotModTabs.TAB_RUBYTAB)));
	public static final RegistryObject<Item> RUBY_BLOCK = block(SlotModBlocks.RUBY_BLOCK, SlotModTabs.TAB_RUBYTAB);
	public static final RegistryObject<Item> RUBYWORLD = REGISTRY.register("rubyworld", () -> new RubyworldItem());
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> RUBY_EQUIPMENT_PICKAXE = REGISTRY.register("ruby_equipment_pickaxe", () -> new Ruby_equipmentPickaxeItem());
	public static final RegistryObject<Item> RUBY_EQUIPMENT_AXE = REGISTRY.register("ruby_equipment_axe", () -> new Ruby_equipmentAxeItem());
	public static final RegistryObject<Item> RUBY_EQUIPMENT_SWORD = REGISTRY.register("ruby_equipment_sword", () -> new Ruby_equipmentSwordItem());
	public static final RegistryObject<Item> RUBY_EQUIPMENT_SHOVEL = REGISTRY.register("ruby_equipment_shovel", () -> new Ruby_equipmentShovelItem());
	public static final RegistryObject<Item> RUBY_EQUIPMENT_HOE = REGISTRY.register("ruby_equipment_hoe", () -> new Ruby_equipmentHoeItem());
	public static final RegistryObject<Item> CHUNDRA_SPAWN_EGG = REGISTRY.register("chundra_spawn_egg", () -> new ForgeSpawnEggItem(SlotModEntities.CHUNDRA, -26215, -1, new Item.Properties().tab(SlotModTabs.TAB_RUBYTAB)));
	public static final RegistryObject<Item> RUBYDIRT = block(SlotModBlocks.RUBYDIRT, SlotModTabs.TAB_RUBYTAB);
	public static final RegistryObject<Item> SCARREDEARTH = block(SlotModBlocks.SCARREDEARTH, SlotModTabs.TAB_RUBYTAB);
	public static final RegistryObject<Item> AXEBOOST = REGISTRY.register("axeboost", () -> new AxeboostItem());
	public static final RegistryObject<Item> ANTISCARBOW = REGISTRY.register("antiscarbow", () -> new AntiscarbowItem());
	public static final RegistryObject<Item> A_BOTTLEWITHASCAR = REGISTRY.register("a_bottlewithascar", () -> new ABottlewithascarItem());
	public static final RegistryObject<Item> RUBY_ARMOR_ARMOR_HELMET = REGISTRY.register("ruby_armor_armor_helmet", () -> new Ruby_armorArmorItem.Helmet());
	public static final RegistryObject<Item> RUBY_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("ruby_armor_armor_chestplate", () -> new Ruby_armorArmorItem.Chestplate());
	public static final RegistryObject<Item> RUBY_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("ruby_armor_armor_leggings", () -> new Ruby_armorArmorItem.Leggings());
	public static final RegistryObject<Item> RUBY_ARMOR_ARMOR_BOOTS = REGISTRY.register("ruby_armor_armor_boots", () -> new Ruby_armorArmorItem.Boots());
	public static final RegistryObject<Item> HEARTARROW = REGISTRY.register("heartarrow", () -> new HeartarrowItem());
	public static final RegistryObject<Item> RUBIN_GEM = block(SlotModBlocks.RUBIN_GEM, SlotModTabs.TAB_RUBYTAB);
	public static final RegistryObject<Item> GLOWINGRUBYINGOT = REGISTRY.register("glowingrubyingot", () -> new GlowingrubyingotItem());
	public static final RegistryObject<Item> RUBYORE = block(SlotModBlocks.RUBYORE, SlotModTabs.TAB_RUBYTAB);
	public static final RegistryObject<Item> SCARRED_WOOD = block(SlotModBlocks.SCARRED_WOOD, SlotModTabs.TAB_RUBYTAB);
	public static final RegistryObject<Item> SCARRED_LOG = block(SlotModBlocks.SCARRED_LOG, SlotModTabs.TAB_RUBYTAB);
	public static final RegistryObject<Item> SCARRED_PLANKS = block(SlotModBlocks.SCARRED_PLANKS, SlotModTabs.TAB_RUBYTAB);
	public static final RegistryObject<Item> SCARRED_LEAVES = block(SlotModBlocks.SCARRED_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SCARRED_STAIRS = block(SlotModBlocks.SCARRED_STAIRS, SlotModTabs.TAB_RUBYTAB);
	public static final RegistryObject<Item> SCARRED_SLAB = block(SlotModBlocks.SCARRED_SLAB, SlotModTabs.TAB_RUBYTAB);
	public static final RegistryObject<Item> SCARRED_FENCE = block(SlotModBlocks.SCARRED_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SCARRED_FENCE_GATE = block(SlotModBlocks.SCARRED_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> SCARRED_PRESSURE_PLATE = block(SlotModBlocks.SCARRED_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> SCARRED_BUTTON = block(SlotModBlocks.SCARRED_BUTTON, SlotModTabs.TAB_RUBYTAB);
	public static final RegistryObject<Item> LEAVESWOLFFOREST = block(SlotModBlocks.LEAVESWOLFFOREST, SlotModTabs.TAB_RUBYTAB);
	public static final RegistryObject<Item> VKLADKA = REGISTRY.register("vkladka", () -> new VkladkaItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
