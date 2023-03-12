
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slot.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.slot.client.particle.PortalparticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SlotModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(SlotModParticleTypes.PORTALPARTICLE.get(), PortalparticleParticle::provider);
	}
}
