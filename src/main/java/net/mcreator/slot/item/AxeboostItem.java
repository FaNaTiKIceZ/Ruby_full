
package net.mcreator.slot.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.slot.procedures.AxeboostPriNazhatiiPravoiKnopkoiMyshiProcedure;
import net.mcreator.slot.init.SlotModTabs;
import net.mcreator.slot.init.SlotModItems;

public class AxeboostItem extends AxeItem {
	public AxeboostItem() {
		super(new Tier() {
			public int getUses() {
				return 50;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 10f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SlotModItems.RUBY.get()));
			}
		}, 1, -3.6f, new Item.Properties().tab(SlotModTabs.TAB_RUBYTAB));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		AxeboostPriNazhatiiPravoiKnopkoiMyshiProcedure.execute(entity);
		return ar;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
