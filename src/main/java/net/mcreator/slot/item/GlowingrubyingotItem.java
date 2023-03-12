
package net.mcreator.slot.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.slot.init.SlotModTabs;

public class GlowingrubyingotItem extends Item {
	public GlowingrubyingotItem() {
		super(new Item.Properties().tab(SlotModTabs.TAB_RUBYTAB).stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
