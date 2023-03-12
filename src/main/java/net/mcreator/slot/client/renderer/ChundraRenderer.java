
package net.mcreator.slot.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.slot.entity.ChundraEntity;
import net.mcreator.slot.client.model.ModelPigman;

public class ChundraRenderer extends MobRenderer<ChundraEntity, ModelPigman<ChundraEntity>> {
	public ChundraRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPigman(context.bakeLayer(ModelPigman.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChundraEntity entity) {
		return new ResourceLocation("slot:textures/entities/chundra.png");
	}
}
