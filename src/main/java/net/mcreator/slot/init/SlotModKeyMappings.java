
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slot.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.slot.network.KeyTreeOpenMessage;
import net.mcreator.slot.SlotMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SlotModKeyMappings {
	public static final KeyMapping KEY_TREE_OPEN = new KeyMapping("key.slot.key_tree_open", GLFW.GLFW_KEY_R, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				SlotMod.PACKET_HANDLER.sendToServer(new KeyTreeOpenMessage(0, 0));
				KeyTreeOpenMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(KEY_TREE_OPEN);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				KEY_TREE_OPEN.consumeClick();
			}
		}
	}
}
