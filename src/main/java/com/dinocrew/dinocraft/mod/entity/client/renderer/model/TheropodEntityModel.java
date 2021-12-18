package com.dinocrew.dinocraft.mod.entity.client.renderer.model;// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.dinocrew.dinocraft.Dinocraft;
import com.dinocrew.dinocraft.mod.entity.common.entity.TheropodEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class TheropodEntityModel<Type extends TheropodEntity> extends EntityModel<Type> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Dinocraft.MOD_ID, "theropod_entity"), "main");
	private final ModelPart torso;
	private final ModelPart rightarm;
	private final ModelPart head;
	private final ModelPart leftarm;
	private final ModelPart leftleg;
	private final ModelPart rightleg;

	public TheropodEntityModel(ModelPart root) {
		this.torso = root.getChild("torso");
		this.rightarm = root.getChild("rightarm");
		this.head = root.getChild("head");
		this.leftarm = root.getChild("leftarm");
		this.leftleg = root.getChild("leftleg");
		this.rightleg = root.getChild("rightleg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition torso = partdefinition.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 0).addBox(-27.3333F, -18.0F, -10.8333F, 25.0F, 15.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(-2.3333F, -17.0F, -9.8333F, 18.0F, 13.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6667F, 8.0F, 0.3333F, 0.0F, 0.0F, 0.1745F));

		PartDefinition tail = torso.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(76, 20).addBox(-1.5F, -6.0F, -8.0F, 8.0F, 11.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.1667F, -11.0F, -0.3333F, 0.0F, 0.0F, -0.0873F));

		PartDefinition tailtwo = tail.addOrReplaceChild("tailtwo", CubeListBuilder.create().texOffs(54, 87).addBox(0.0F, -4.5F, -6.0F, 10.0F, 9.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -1.5F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition tailthree = tailtwo.addOrReplaceChild("tailthree", CubeListBuilder.create().texOffs(38, 108).addBox(-1.0F, -3.5F, -4.0F, 7.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition tailfour = tailthree.addOrReplaceChild("tailfour", CubeListBuilder.create().texOffs(0, 0).addBox(6.0F, -3.0F, -2.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition neck = torso.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(0, 72).addBox(-15.0F, -6.5F, -7.0F, 18.0F, 12.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-27.3333F, -11.5F, -0.8333F, 0.0F, 0.0F, 0.4363F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(0, 68).addBox(-1.5F, -1.469F, -0.5984F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-21.5F, -7.5F, -10.5F, -0.6109F, 0.0F, 0.0F));

		PartDefinition rightarmbend = rightarm.addOrReplaceChild("rightarmbend", CubeListBuilder.create().texOffs(0, 36).addBox(-3.5F, -0.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.031F, 0.9016F, 1.1345F, 0.0F, 1.1345F));

		PartDefinition leftfinger = rightarmbend.addOrReplaceChild("leftfinger", CubeListBuilder.create().texOffs(55, 36).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 11.5F, 1.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition rightfinger = rightarmbend.addOrReplaceChild("rightfinger", CubeListBuilder.create().texOffs(55, 36).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 11.5F, -1.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(57, 57).addBox(-10.6667F, -9.5F, -7.6667F, 16.0F, 13.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offset(-40.3333F, -13.5F, -0.8333F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(85, 95).addBox(-59.0F, -45.0F, -6.5F, 8.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(40.3333F, 37.5F, 0.8333F));

		PartDefinition bottomjaw = head.addOrReplaceChild("bottomjaw", CubeListBuilder.create().texOffs(106, 47).addBox(-58.0F, -39.0F, -5.5F, 7.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(40.3333F, 37.5F, 0.8333F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(0, 68).addBox(-1.5F, -1.469F, -2.4016F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-21.5F, -7.5F, 10.5F, 0.6109F, 0.0F, 0.0F));

		PartDefinition leftarmbend = leftarm.addOrReplaceChild("leftarmbend", CubeListBuilder.create().texOffs(0, 36).addBox(-3.5F, -0.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.031F, -0.9016F, -1.1345F, 0.0F, 1.1345F));

		PartDefinition leftarmfinger = leftarmbend.addOrReplaceChild("leftarmfinger", CubeListBuilder.create().texOffs(55, 36).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 11.5F, 1.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition leftarmfingertwo = leftarmbend.addOrReplaceChild("leftarmfingertwo", CubeListBuilder.create().texOffs(55, 36).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 11.5F, -1.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(0, 99).addBox(-6.0F, -4.0F, -4.5F, 10.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -1.0F, 11.5F, 0.0F, -1.5708F, 0.5236F));

		PartDefinition leftlegbend = leftleg.addOrReplaceChild("leftlegbend", CubeListBuilder.create().texOffs(71, 0).addBox(2.9619F, 0.8716F, -3.0F, 18.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 4.0F, 3.0F, 0.4363F, 1.5708F, 0.4363F));

		PartDefinition leftlegfoot = leftleg.addOrReplaceChild("leftlegfoot", CubeListBuilder.create().texOffs(68, 108).addBox(-5.2622F, -3.0077F, -3.8F, 4.0F, 11.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 10.9F, -15.2F, -1.5708F, -1.0472F, 1.5708F));

		PartDefinition leftoe = leftlegfoot.addOrReplaceChild("leftoe", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(6.5F, -1.0F, -4.5F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7622F, 6.9923F, 4.7F, 0.0F, 0.6981F, 0.0F));

		PartDefinition rightwo = leftlegfoot.addOrReplaceChild("rightwo", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(6.5F, -1.0F, 1.5F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7622F, 6.9923F, -4.3F, 0.0F, -0.6981F, 0.0F));

		PartDefinition middletoetwo = leftlegfoot.addOrReplaceChild("middletoetwo", CubeListBuilder.create().texOffs(55, 43).mirror().addBox(3.5F, -1.0F, -2.0F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-4.7622F, 6.9923F, 0.2F));

		PartDefinition toespiketwo = leftlegfoot.addOrReplaceChild("toespiketwo", CubeListBuilder.create().texOffs(0, 50).addBox(1.5F, -4.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2378F, -1.0077F, 0.2F, 0.0F, -3.0543F, -0.7854F));

		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(0, 99).addBox(-6.0F, -4.0F, -4.5F, 10.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -1.0F, -9.5F, 0.0F, -1.5708F, 0.5236F));

		PartDefinition rightlegbend = rightleg.addOrReplaceChild("rightlegbend", CubeListBuilder.create().texOffs(71, 0).addBox(2.9619F, 0.8716F, -3.0F, 18.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 4.0F, 3.0F, 0.4363F, 1.5708F, 0.4363F));

		PartDefinition rightlefoot = rightleg.addOrReplaceChild("rightlefoot", CubeListBuilder.create().texOffs(68, 108).addBox(-5.2622F, -3.0077F, -3.8F, 4.0F, 11.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 10.9F, -15.2F, -1.5708F, -1.0472F, 1.5708F));

		PartDefinition lefttoerightfoot = rightlefoot.addOrReplaceChild("lefttoerightfoot", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(6.5F, -1.0F, -4.5F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7622F, 6.9923F, 4.7F, 0.0F, 0.6981F, 0.0F));

		PartDefinition rightfootlefttoe = rightlefoot.addOrReplaceChild("rightfootlefttoe", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(6.5F, -1.0F, 1.5F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7622F, 6.9923F, -4.3F, 0.0F, -0.6981F, 0.0F));

		PartDefinition middletoerightfoot = rightlefoot.addOrReplaceChild("middletoerightfoot", CubeListBuilder.create().texOffs(55, 43).mirror().addBox(3.5F, -1.0F, -2.0F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-4.7622F, 6.9923F, 0.2F));

		PartDefinition toespike = rightlefoot.addOrReplaceChild("toespike", CubeListBuilder.create().texOffs(0, 50).addBox(1.5F, -4.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2378F, -1.0077F, 0.2F, 0.0F, -3.0543F, -0.7854F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}


	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		torso.render(poseStack, buffer, packedLight, packedOverlay);
		rightarm.render(poseStack, buffer, packedLight, packedOverlay);
		head.render(poseStack, buffer, packedLight, packedOverlay);
		leftarm.render(poseStack, buffer, packedLight, packedOverlay);
		leftleg.render(poseStack, buffer, packedLight, packedOverlay);
		rightleg.render(poseStack, buffer, packedLight, packedOverlay);
	}

	@Override
	public void setupAnim(Type p_102618_, float p_102619_, float p_102620_, float p_102621_, float p_102622_, float p_102623_) {

	}
}

