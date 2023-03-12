
package net.mcreator.slot.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.slot.init.SlotModTabs;
import net.mcreator.slot.init.SlotModItems;

public class Ruby_equipmentSwordItem extends SwordItem {
	public Ruby_equipmentSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 2031;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SlotModItems.RUBY.get()));
			}
		}, 3, -2.4f, new Item.Properties().tab(SlotModTabs.TAB_RUBYTAB).fireResistant());
	}

	@Override
	public boolean hasCraftingRemainingItem(ItemStack stack) {
		return true;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public boolean isRepairable(ItemStack itemstack) {
		return false;
	}
}
