
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slot.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.slot.client.renderer.RidikRenderer;
import net.mcreator.slot.client.renderer.ChundraRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SlotModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SlotModEntities.RIDIK.get(), RidikRenderer::new);
		event.registerEntityRenderer(SlotModEntities.CHUNDRA.get(), ChundraRenderer::new);
		event.registerEntityRenderer(SlotModEntities.ANTISCARBOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SlotModEntities.A_BOTTLEWITHASCAR.get(), ThrownItemRenderer::new);
	}
}
