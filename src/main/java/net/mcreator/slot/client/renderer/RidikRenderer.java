
package net.mcreator.slot.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.slot.entity.RidikEntity;
import net.mcreator.slot.client.model.Modelguaed;

public class RidikRenderer extends MobRenderer<RidikEntity, Modelguaed<RidikEntity>> {
	public RidikRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelguaed(context.bakeLayer(Modelguaed.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RidikEntity entity) {
		return new ResourceLocation("slot:textures/entities/cage.png");
	}
}
