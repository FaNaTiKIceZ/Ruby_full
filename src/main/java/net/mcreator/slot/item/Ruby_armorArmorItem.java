
package net.mcreator.slot.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.slot.init.SlotModTabs;
import net.mcreator.slot.init.SlotModItems;

public abstract class Ruby_armorArmorItem extends ArmorItem {
	public Ruby_armorArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 39;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{4, 7, 9, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 25;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SlotModItems.RUBY.get()));
			}

			@Override
			public String getName() {
				return "ruby_armor_armor";
			}

			@Override
			public float getToughness() {
				return 4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.30000000000000004f;
			}
		}, slot, properties);
	}

	public static class Helmet extends Ruby_armorArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(SlotModTabs.TAB_RUBYTAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "slot:textures/models/armor/ruby_armor_layer_1.png";
		}
	}

	public static class Chestplate extends Ruby_armorArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(SlotModTabs.TAB_RUBYTAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "slot:textures/models/armor/ruby_armor_layer_1.png";
		}
	}

	public static class Leggings extends Ruby_armorArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(SlotModTabs.TAB_RUBYTAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "slot:textures/models/armor/ruby_armor_layer_2.png";
		}
	}

	public static class Boots extends Ruby_armorArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(SlotModTabs.TAB_RUBYTAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "slot:textures/models/armor/ruby_armor_layer_1.png";
		}
	}
}
