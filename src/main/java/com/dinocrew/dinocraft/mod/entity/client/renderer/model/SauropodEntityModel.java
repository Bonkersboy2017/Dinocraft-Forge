package com.dinocrew.dinocraft.mod.entity.client.renderer.model;// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.dinocrew.dinocraft.Dinocraft;
import com.dinocrew.dinocraft.mod.entity.common.entity.SauropodEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;


public class SauropodEntityModel<Type extends SauropodEntity> extends EntityModel<Type> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Dinocraft.MOD_ID, "sauropod_entity"), "main");
	private final ModelPart torso;
	private final ModelPart frontleftleg;
	private final ModelPart frontrightleg;
	private final ModelPart Head;
	private final ModelPart backrightleg;
	private final ModelPart backleftleg;

	public SauropodEntityModel(ModelPart root) {
		this.torso = root.getChild("torso");
		this.frontleftleg = root.getChild("frontleftleg");
		this.frontrightleg = root.getChild("frontrightleg");
		this.Head = root.getChild("Head");
		this.backrightleg = root.getChild("backrightleg");
		this.backleftleg = root.getChild("backleftleg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition torso = partdefinition.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 35).addBox(-10.0F, -10.0F, 0.0F, 20.0F, 15.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-11.0F, -10.0F, -18.0F, 22.0F, 16.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail = torso.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 69).addBox(-9.0F, -5.0F, -6.5F, 18.0F, 13.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 23.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tailparttwo = tail.addOrReplaceChild("tailparttwo", CubeListBuilder.create().texOffs(0, 106).addBox(-7.0F, -6.5F, -6.5F, 14.0F, 10.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, 10.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition tailpartthree = tail.addOrReplaceChild("tailpartthree", CubeListBuilder.create().texOffs(113, 35).addBox(-5.0F, -7.5F, -6.5F, 10.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 21.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition neck = torso.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(66, 66).addBox(-9.0F, -6.1883F, -9.7615F, 18.0F, 14.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -15.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition necktwo = neck.addOrReplaceChild("necktwo", CubeListBuilder.create().texOffs(67, 20).addBox(-7.0F, -3.2149F, -10.8944F, 14.0F, 12.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -7.0F, -0.6981F, 0.0F, 0.0F));

		PartDefinition neckthree = necktwo.addOrReplaceChild("neckthree", CubeListBuilder.create().texOffs(42, 92).addBox(-6.0F, -3.5696F, -16.8649F, 12.0F, 10.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5F, -7.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition neckfour = neckthree.addOrReplaceChild("neckfour", CubeListBuilder.create().texOffs(114, 55).addBox(-5.0F, -4.0F, -10.0F, 10.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -16.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition frontleftleg = partdefinition.addOrReplaceChild("frontleftleg", CubeListBuilder.create().texOffs(110, 0).addBox(-5.0F, -7.0F, -5.0F, 10.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.0F, 0.0F, -10.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition frontleftbedn = frontleftleg.addOrReplaceChild("frontleftbedn", CubeListBuilder.create().texOffs(138, 74).addBox(-4.0F, -3.0F, -6.5F, 8.0F, 17.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, 2.5F, -0.4363F, 0.0F, 0.0F));

		PartDefinition frontleftfoog = frontleftbedn.addOrReplaceChild("frontleftfoog", CubeListBuilder.create().texOffs(63, 0).addBox(-4.5F, -6.5F, -5.5F, 11.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 18.5F, -2.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition frontrightleg = partdefinition.addOrReplaceChild("frontrightleg", CubeListBuilder.create().texOffs(110, 0).addBox(-5.0F, -7.0F, -5.0F, 10.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0F, 0.0F, -10.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition frontrightbedn = frontrightleg.addOrReplaceChild("frontrightbedn", CubeListBuilder.create().texOffs(138, 74).addBox(-4.0F, -3.0F, -6.5F, 8.0F, 17.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, 2.5F, -0.4363F, 0.0F, 0.0F));

		PartDefinition frontrightfoog = frontrightbedn.addOrReplaceChild("frontrightfoog", CubeListBuilder.create().texOffs(63, 0).addBox(-6.5F, -6.5F, -5.5F, 11.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 18.5F, -2.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(98, 98).addBox(-6.0F, -5.0F, -9.0F, 12.0F, 9.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -41.0F, -33.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition topmouth = Head.addOrReplaceChild("topmouth", CubeListBuilder.create().texOffs(0, 93).addBox(-4.0F, -2.5F, -6.5F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.5F, -9.5F));

		PartDefinition bottommouth = Head.addOrReplaceChild("bottommouth", CubeListBuilder.create().texOffs(47, 69).addBox(-3.0F, -0.5F, -5.5F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.5F, -9.5F));

		PartDefinition backrightleg = partdefinition.addOrReplaceChild("backrightleg", CubeListBuilder.create().texOffs(120, 123).addBox(-5.0F, -5.0F, -4.5F, 10.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0F, 1.0F, 11.5F, 0.3491F, 0.0F, 0.0F));

		PartDefinition backrightlegbend = backrightleg.addOrReplaceChild("backrightlegbend", CubeListBuilder.create().texOffs(54, 142).addBox(-2.5F, -4.7412F, -1.6319F, 5.0F, 20.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 4.5F, -2.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition backrightlegfoot = backrightlegbend.addOrReplaceChild("backrightlegfoot", CubeListBuilder.create().texOffs(138, 99).addBox(-1.5F, -9.5F, -5.5F, 7.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 24.0F, 2.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition backleftleg = partdefinition.addOrReplaceChild("backleftleg", CubeListBuilder.create().texOffs(120, 123).addBox(-5.0F, -5.0F, -4.5F, 10.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.0F, 1.0F, 11.5F, 0.3491F, 0.0F, 0.0F));

		PartDefinition backleftlegbend = backleftleg.addOrReplaceChild("backleftlegbend", CubeListBuilder.create().texOffs(54, 142).addBox(-2.5F, -4.7412F, -1.6319F, 5.0F, 20.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 4.5F, -2.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition backleftlegfoot = backleftlegbend.addOrReplaceChild("backleftlegfoot", CubeListBuilder.create().texOffs(138, 99).addBox(-5.5F, -9.5F, -5.5F, 7.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 24.0F, 2.5F, 0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}



	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		torso.render(poseStack, buffer, packedLight, packedOverlay);
		frontleftleg.render(poseStack, buffer, packedLight, packedOverlay);
		frontrightleg.render(poseStack, buffer, packedLight, packedOverlay);
		Head.render(poseStack, buffer, packedLight, packedOverlay);
		backrightleg.render(poseStack, buffer, packedLight, packedOverlay);
		backleftleg.render(poseStack, buffer, packedLight, packedOverlay);
	}

	@Override
	public void setupAnim(Type p_102618_, float p_102619_, float p_102620_, float p_102621_, float p_102622_, float p_102623_) {

	}
}