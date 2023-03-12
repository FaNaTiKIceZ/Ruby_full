
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slot.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.slot.world.inventory.SPELLTREEGUIMenu;
import net.mcreator.slot.SlotMod;

public class SlotModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, SlotMod.MODID);
	public static final RegistryObject<MenuType<SPELLTREEGUIMenu>> SPELLTREEGUI = REGISTRY.register("spelltreegui", () -> IForgeMenuType.create(SPELLTREEGUIMenu::new));
}
