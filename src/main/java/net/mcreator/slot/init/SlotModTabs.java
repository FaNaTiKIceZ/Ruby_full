
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slot.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SlotModTabs {
	public static CreativeModeTab TAB_RUBYTAB;

	public static void load() {
		TAB_RUBYTAB = new CreativeModeTab("tabrubytab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SlotModItems.VKLADKA.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
