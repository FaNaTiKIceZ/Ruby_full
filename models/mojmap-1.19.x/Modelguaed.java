// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelguaed<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "guaed"), "main");
	private final ModelPart eye;
	private final ModelPart cage;
	private final ModelPart base;
	private final ModelPart wind;

	public Modelguaed(ModelPart root) {
		this.eye = root.getChild("eye");
		this.cage = root.getChild("cage");
		this.base = root.getChild("base");
		this.wind = root.getChild("wind");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition eye = partdefinition.addOrReplaceChild("eye", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition cage = partdefinition.addOrReplaceChild("cage", CubeListBuilder.create().texOffs(16, 0).addBox(
				-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition base = partdefinition.addOrReplaceChild("base", CubeListBuilder.create().texOffs(12, 0).addBox(
				-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition wind = partdefinition.addOrReplaceChild("wind", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		eye.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cage.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		base.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wind.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.eye.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.eye.xRot = headPitch / (180F / (float) Math.PI);
		this.cage.yRot = ageInTicks;
		this.base.zRot = ageInTicks;
		this.wind.yRot = ageInTicks;
	}
}