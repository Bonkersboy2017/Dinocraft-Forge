package com.dinocrew.dinocraft.mod.entity.client.renderer.model;// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.dinocrew.dinocraft.mod.entity.common.entity.MicroraptorEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class MicroraptorEntityModel<Type extends MicroraptorEntity> extends EntityModel<Type> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "microraptorentitymodel"), "main");
	private final ModelPart body;

	public MicroraptorEntityModel(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 20).addBox(-6.0F, -6.0F, -8.0F, 12.0F, 12.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(52, 0).addBox(-3.0F, -3.0F, -12.0F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -6.0F, -0.6981F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(40, 50).addBox(-4.0F, -5.0F, -10.0F, 8.0F, 8.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(62, 72).addBox(-2.0F, -2.0F, -16.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -10.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition right_leg = body.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(64, 20).addBox(-3.0F, -3.0F, -5.0F, 6.0F, 12.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(76, -8).addBox(-0.25F, -3.0F, 5.0F, 0.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 3.0F, 5.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition right_knee = right_leg.addOrReplaceChild("right_knee", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 10).addBox(0.0F, -1.0F, 2.0F, 0.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0F, 2.0F, 0.6981F, 0.0F, 0.0F));

		PartDefinition right_foot = right_knee.addOrReplaceChild("right_foot", CubeListBuilder.create().texOffs(22, 68).addBox(-3.0F, 0.0F, -6.0F, 6.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0F, -2.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition left_leg = body.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(64, 20).mirror().addBox(-3.0F, -3.0F, -5.0F, 6.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(76, -8).mirror().addBox(0.25F, -3.0F, 5.0F, 0.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0F, 3.0F, 5.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition left_knee = left_leg.addOrReplaceChild("left_knee", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 10).mirror().addBox(0.0F, -1.0F, 2.0F, 0.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.0F, 2.0F, 0.6981F, 0.0F, 0.0F));

		PartDefinition left_foot = left_knee.addOrReplaceChild("left_foot", CubeListBuilder.create().texOffs(22, 68).mirror().addBox(-3.0F, 0.0F, -6.0F, 6.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.0F, -2.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition right_wing1 = body.addOrReplaceChild("right_wing1", CubeListBuilder.create().texOffs(66, 50).addBox(-10.0F, -1.0F, -1.5F, 10.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(42, 72).addBox(-10.0F, -0.5F, 1.5F, 10.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 66).addBox(-10.0F, 0.0F, 4.5F, 10.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, -4.0F, -4.5F));

		PartDefinition right_wing2 = right_wing1.addOrReplaceChild("right_wing2", CubeListBuilder.create().texOffs(64, 42).addBox(-16.0F, -0.5F, -1.5F, 16.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(30, 20).addBox(-16.0F, 0.0F, 1.5F, 16.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-10.0F, 0.0F, 0.0F));

		PartDefinition right_wing3 = right_wing2.addOrReplaceChild("right_wing3", CubeListBuilder.create().texOffs(18, 50).addBox(-10.0F, 0.0F, -1.5F, 10.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-16.0F, 0.0F, 0.0F));

		PartDefinition left_wing1 = body.addOrReplaceChild("left_wing1", CubeListBuilder.create().texOffs(66, 50).mirror().addBox(0.0F, -1.0F, -1.5F, 10.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(42, 72).mirror().addBox(0.0F, -0.5F, 1.5F, 10.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 66).mirror().addBox(0.0F, 0.0F, 4.5F, 10.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(6.0F, -4.0F, -4.5F));

		PartDefinition left_wing2 = left_wing1.addOrReplaceChild("left_wing2", CubeListBuilder.create().texOffs(64, 42).mirror().addBox(0.0F, -0.5F, -1.5F, 16.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(30, 20).mirror().addBox(0.0F, 0.0F, 1.5F, 16.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(10.0F, 0.0F, 0.0F));

		PartDefinition left_wing3 = left_wing2.addOrReplaceChild("left_wing3", CubeListBuilder.create().texOffs(18, 50).mirror().addBox(0.0F, 0.0F, -1.5F, 10.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(16.0F, 0.0F, 0.0F));

		PartDefinition tail1 = body.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 48).addBox(-4.0F, -3.0F, 0.0F, 8.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, 8.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(64, 56).addBox(-3.0F, -2.0F, 0.0F, 6.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 12.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(40, 32).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.0F, 0.0F, 14.0F, 16.0F, 0.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 12.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, buffer, packedLight, packedOverlay);
	}

	@Override
	public void setupAnim(Type p_102618_, float p_102619_, float p_102620_, float p_102621_, float p_102622_, float p_102623_) {



	}
}