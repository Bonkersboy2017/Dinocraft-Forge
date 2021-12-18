package com.dinocrew.dinocraft.mod.entity.client.renderer.model;// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.dinocrew.dinocraft.Dinocraft;
import com.dinocrew.dinocraft.mod.entity.common.entity.StegoraptorEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class StegoraptorEntityModel<Type extends StegoraptorEntity> extends EntityModel<Type> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Dinocraft.MOD_ID, "stegoraptor_entity"), "main");
	private final ModelPart body;

	public StegoraptorEntityModel(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -6.0F, -9.0F, 12.0F, 12.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(0, 51).addBox(0.0F, -12.0F, -7.0F, 0.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition neck1 = body.addOrReplaceChild("neck1", CubeListBuilder.create().texOffs(58, 48).addBox(-4.0F, -4.5F, -8.0F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -5.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(78, 0).addBox(-3.0F, -3.0F, -7.25F, 6.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.25F, -0.48F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create().texOffs(24, 34).addBox(-4.5F, -5.0F, -12.0F, 9.0F, 10.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 12).addBox(0.0F, -11.0F, -12.0F, 0.0F, 16.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(70, 79).addBox(-3.5F, 0.0F, -20.0F, 7.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -7.25F, 1.3963F, 0.0F, 0.0F));

		PartDefinition nose = head.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(0, 71).addBox(-2.0F, 0.0F, 0.0F, 5.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -20.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(62, 65).addBox(-2.5F, 0.0F, 0.0F, 6.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.0F, -20.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition right_hip = body.addOrReplaceChild("right_hip", CubeListBuilder.create().texOffs(30, 56).mirror().addBox(-3.0F, -3.0F, -5.0F, 6.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 1.5F, 6.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition right_leg = right_hip.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(82, 14).mirror().addBox(-2.5F, -1.5F, -3.0F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.5F, 1.0F, 1.2217F, 0.0F, 0.0F));

		PartDefinition right_knee = right_leg.addOrReplaceChild("right_knee", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-2.0F, -1.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.5F, -1.5F, -1.3963F, 0.0F, 0.0F));

		PartDefinition right_foot = right_knee.addOrReplaceChild("right_foot", CubeListBuilder.create().texOffs(70, 38).mirror().addBox(-3.0F, 0.0F, -6.5F, 6.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.5F, -0.5F, 0.5236F, 0.0F, 0.0F));

		PartDefinition left_hip = body.addOrReplaceChild("left_hip", CubeListBuilder.create().texOffs(30, 56).addBox(-3.0F, -3.0F, -5.0F, 6.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 1.5F, 6.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition left_leg = left_hip.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(82, 14).addBox(-2.5F, -1.5F, -3.0F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5F, 1.0F, 1.2217F, 0.0F, 0.0F));

		PartDefinition left_knee = left_leg.addOrReplaceChild("left_knee", CubeListBuilder.create().texOffs(0, 46).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5F, -1.5F, -1.3963F, 0.0F, 0.0F));

		PartDefinition left_foot = left_knee.addOrReplaceChild("left_foot", CubeListBuilder.create().texOffs(70, 38).addBox(-3.0F, 0.0F, -6.5F, 6.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.5F, -0.5F, 0.5236F, 0.0F, 0.0F));

		PartDefinition right_arm = body.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -1.0F, -2.5F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -2.0F, -6.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition right_wrist = right_arm.addOrReplaceChild("right_wrist", CubeListBuilder.create().texOffs(26, 84).addBox(-1.5F, -0.75F, -2.0F, 3.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 8.25F, 0.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition right_hand = right_wrist.addOrReplaceChild("right_hand", CubeListBuilder.create().texOffs(66, 0).addBox(-2.5F, -0.75F, -1.0F, 5.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.5F, 0.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition left_arm = body.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.5F, -1.0F, -2.5F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.5F, -2.0F, -6.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition left_wrist = left_arm.addOrReplaceChild("left_wrist", CubeListBuilder.create().texOffs(26, 84).mirror().addBox(-1.5F, -0.75F, -2.0F, 3.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 8.25F, 0.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition left_hand = left_wrist.addOrReplaceChild("left_hand", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(-2.5F, -0.75F, -1.0F, 5.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.5F, 0.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition tail1 = body.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(54, 18).addBox(-4.0F, -3.0F, 0.0F, 8.0F, 8.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(54, 67).addBox(0.0F, -9.0F, 0.0F, 0.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 7.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(42, 0).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(30, 66).addBox(0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 12.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 46).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(54, 26).addBox(0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 12.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void renderToBuffer(PoseStack p_103111_, VertexConsumer p_103112_, int p_103113_, int p_103114_, float p_103115_, float p_103116_, float p_103117_, float p_103118_) {

	}

	@Override
	public void setupAnim(Type p_102618_, float p_102619_, float p_102620_, float p_102621_, float p_102622_, float p_102623_) {

	}
}