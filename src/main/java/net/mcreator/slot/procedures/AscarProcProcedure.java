package net.mcreator.slot.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.slot.network.SlotModVariables;

public class AscarProcProcedure {
	public static void execute(LevelAccessor world) {
		SlotModVariables.MapVariables.get(world).SpellNumber = 2;
		SlotModVariables.MapVariables.get(world).syncData(world);
	}
}
