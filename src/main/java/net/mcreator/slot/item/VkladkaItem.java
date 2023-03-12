
package net.mcreator.slot.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class VkladkaItem extends Item {
	public VkladkaItem() {
		super(new Item.Properties().tab(null).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public boolean isCorrectToolForDrops(BlockState state) {
		return true;
	}
}
