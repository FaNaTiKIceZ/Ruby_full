
package net.mcreator.slot.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.slot.init.SlotModTabs;
import net.mcreator.slot.init.SlotModItems;

public class Ruby_equipmentHoeItem extends HoeItem {
	public Ruby_equipmentHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 2031;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 0f;
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
		}, 0, 0.5f, new Item.Properties().tab(SlotModTabs.TAB_RUBYTAB).fireResistant());
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
