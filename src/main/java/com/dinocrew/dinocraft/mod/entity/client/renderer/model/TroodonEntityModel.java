package com.dinocrew.dinocraft.mod.entity.client.renderer.model;// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.dinocrew.dinocraft.Dinocraft;
import com.dinocrew.dinocraft.mod.entity.common.entity.TroodonEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class TroodonEntityModel<Type extends TroodonEntity> extends EntityModel<Type> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Dinocraft.MOD_ID, "troodon_entity"), "main");
	private final ModelPart torso;
	private final ModelPart leftleg;
	private final ModelPart rightleg;
	private final ModelPart leftarm;
	private final ModelPart leftarm1;
	private final ModelPart head;

	public TroodonEntityModel(ModelPart root) {
		this.torso = root.getChild("torso");
		this.leftleg = root.getChild("leftleg");
		this.rightleg = root.getChild("rightleg");
		this.leftarm = root.getChild("leftarm");
		this.leftarm1= root.getChild("leftarm");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition torso = partdefinition.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -5.0F, -23.0F, 12.0F, 8.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 10.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition neck = torso.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(0, 51).addBox(-4.0F, -5.0F, -5.5F, 8.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -22.5F, -0.8727F, 0.0F, 0.0F));

		PartDefinition tail = torso.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(40, 40).addBox(-5.0F, -3.0F, -2.5F, 10.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 3.5F, 0.4363F, 0.0F, 0.0F));

		PartDefinition tailtwo = tail.addOrReplaceChild("tailtwo", CubeListBuilder.create().texOffs(50, 0).addBox(-3.0F, -3.0F, 0.0359F, 6.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tailthree = tailtwo.addOrReplaceChild("tailthree", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 2.0F, 6.0359F, 3.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(48, 54).addBox(-2.0F, -2.351F, -2.4183F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, 5.0F, 8.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition leftlegbend = leftleg.addOrReplaceChild("leftlegbend", CubeListBuilder.create().texOffs(68, 34).addBox(-2.0F, -4.5F, -2.0F, 4.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.149F, 1.5817F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftlegbend.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(0, 72).addBox(-1.5F, -1.0F, -2.5F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(23, 51).addBox(-1.0F, 5.0F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.5F, 0.5F, -0.3491F, 0.0F, 0.0F));

		PartDefinition toe = leftfoot.addOrReplaceChild("toe", CubeListBuilder.create().texOffs(0, 34).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 5.0F, -2.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition othertoe = leftfoot.addOrReplaceChild("othertoe", CubeListBuilder.create().texOffs(15, 4).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 5.0F, -2.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(48, 54).mirror().addBox(-2.0F, -2.351F, -2.4183F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.0F, 5.0F, 8.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightlegbend = rightleg.addOrReplaceChild("rightlegbend", CubeListBuilder.create().texOffs(68, 33).addBox(-2.0F, -4.5F, -2.0F, 4.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.149F, 1.5817F, 0.5236F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightlegbend.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(0, 72).addBox(-1.5F, -1.0F, -2.5F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(23, 51).addBox(-1.0F, 5.0F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.5F, 0.5F, -0.3491F, 0.0F, 0.0F));

		PartDefinition toetwo = rightfoot.addOrReplaceChild("toetwo", CubeListBuilder.create().texOffs(15, 4).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 5.0F, -2.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition toethree = rightfoot.addOrReplaceChild("toethree", CubeListBuilder.create().texOffs(15, 4).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 5.0F, -2.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(35, 69).addBox(-1.5F, -3.2679F, -2.2321F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, 2.0F, -7.5F, 0.2618F, 0.0F, 0.7854F));

		PartDefinition leftarmbend = leftarm.addOrReplaceChild("leftarmbend", CubeListBuilder.create().texOffs(0, 13).addBox(-1.5F, 3.0F, -6.5F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.7321F, -0.7321F));

		PartDefinition leftfinger = leftarm.addOrReplaceChild("leftfinger", CubeListBuilder.create().texOffs(43, 54).addBox(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.5F, -6.5F, 0.1745F, 0.8727F, -1.3963F));

		PartDefinition rightfinger = leftarm.addOrReplaceChild("rightfinger", CubeListBuilder.create().texOffs(44, 34).addBox(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, -6.5F, -0.0873F, -0.8727F, -1.3963F));

		PartDefinition middlefinger = leftarm.addOrReplaceChild("middlefinger", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 6.0F, -10.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leftarm1 = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(35, 69).mirror().addBox(-1.5F, -3.2679F, -2.2321F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.5F, 2.0F, -7.5F, 0.2618F, 0.0F, -0.7854F));

		PartDefinition leftarmbend1 = leftarm.addOrReplaceChild("leftarmbend", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-1.5F, 3.0F, -6.5F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 2.7321F, -0.7321F));

		PartDefinition leftfingerleft = leftarm.addOrReplaceChild("leftfingerleft", CubeListBuilder.create().texOffs(45, 35).addBox(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.5F, -6.5F, 0.1745F, -0.8727F, 1.3963F));

		PartDefinition leftfingerrighjt = leftarm.addOrReplaceChild("leftfingerrighjt", CubeListBuilder.create().texOffs(44, 34).addBox(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, -6.5F, -0.0873F, 0.8727F, 1.3963F));

		PartDefinition middlefingerleft = leftarm.addOrReplaceChild("middlefingerleft", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, 6.0F, -10.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 34).addBox(-5.0F, -3.5F, -7.3333F, 10.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.5F, -11.6667F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(50, 15).addBox(-4.0F, -2.0F, -6.0F, 8.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.5F, -7.3333F));

		PartDefinition bottomjaw = head.addOrReplaceChild("bottomjaw", CubeListBuilder.create().texOffs(0, 64).addBox(-3.0F, 2.0F, -6.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.5F, -7.3333F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}



	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		torso.render(poseStack, buffer, packedLight, packedOverlay);
		leftleg.render(poseStack, buffer, packedLight, packedOverlay);
		rightleg.render(poseStack, buffer, packedLight, packedOverlay);
		leftarm.render(poseStack, buffer, packedLight, packedOverlay);
		leftarm.render(poseStack, buffer, packedLight, packedOverlay);
		head.render(poseStack, buffer, packedLight, packedOverlay);
	}



	@Override
	public void setupAnim(Type p_102618_, float p_102619_, float p_102620_, float p_102621_, float p_102622_, float p_102623_) {

	}
}
