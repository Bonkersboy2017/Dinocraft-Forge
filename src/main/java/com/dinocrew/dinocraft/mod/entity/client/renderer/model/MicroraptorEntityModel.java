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
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart right_leg;
	private final ModelPart right_knee;
	private final ModelPart right_foot;
	private final ModelPart left_leg;
	private final ModelPart left_knee;
	private final ModelPart left_foot;
	private final ModelPart right_wing1;
	private final ModelPart right_wing2;
	private final ModelPart right_wing3;
	private final ModelPart left_wing1;
	private final ModelPart left_wing2;
	private final ModelPart left_wing3;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private float oldangle;

	public MicroraptorEntityModel(ModelPart root) {
		this.body = root.getChild("body");
		this.tail1 = this.body.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.left_wing1 = this.body.getChild("left_wing1");
		this.left_wing2 = this.left_wing1.getChild("left_wing2");
		this.left_wing3 = this.left_wing2.getChild("left_wing3");
		this.right_wing1 = this.body.getChild("right_wing1");
		this.right_wing2 = this.right_wing1.getChild("right_wing2");
		this.right_wing3 = this.right_wing2.getChild("right_wing3");
		this.left_leg = this.body.getChild("left_leg");
		this.left_knee = this.left_leg.getChild("left_knee");
		this.left_foot = this.left_knee.getChild("left_foot");
		this.right_leg = this.body.getChild("right_leg");
		this.right_knee = this.right_leg.getChild("right_knee");
		this.right_foot = this.right_knee.getChild("right_foot");
		this.neck = this.body.getChild("neck");
		this.head = this.neck.getChild("head");
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
	public void setupAnim(Type entity, float limbAngle, float limbDistance, float animationProgress, float headyRot, float headzRot) {
		float pi = 3.14159265358979323846264338327950288F;
		this.neck.setRotation(-0.6981F, 0.0F, 0.0F);
		this.head.setRotation(0.7854F, 0.0F, 0.0F);
		this.right_foot.setRotation(-0.3491F, 0.0F, 0.0F);
		this.left_foot.setRotation(-0.3491F, 0.0F, 0.0F);

		if(!entity.isOnGround()) {

			this.body.yRot = headyRot;

			//this.body.xRot = this.oldangle - headyRot;

			this.oldangle = headyRot;

//			this.body.xRot = headxRot;


			this.right_wing1.yRot = 0;
			this.left_wing1.yRot = 0;
			this.right_wing1.xRot = 0;
			this.left_wing1.xRot = 0;
			this.right_wing1.zRot = (float)Math.cos(animationProgress/5)/3;
			this.left_wing1.zRot = -(float)Math.cos(animationProgress/5)/3;

			this.right_wing2.yRot = 0;
			this.left_wing2.yRot = 0;
			this.right_wing2.xRot = 0;
			this.left_wing2.xRot = 0;
			this.right_wing2.zRot = (float)Math.cos(animationProgress/5)/3;
			this.left_wing2.zRot = -(float)Math.cos(animationProgress/5)/3;

			this.right_wing3.yRot = 0;
			this.left_wing3.yRot = 0;
			this.right_wing3.xRot = 0;
			this.left_wing3.xRot = 0;
			this.right_wing3.zRot = (float)Math.cos(animationProgress/5)/3;
			this.left_wing3.zRot = -(float)Math.cos(animationProgress/5)/3;

			this.tail1.yRot = 0;
			this.tail2.yRot = 0;
			this.tail3.yRot = 0;

			this.tail2.xRot = 0;
			this.tail3.xRot = 0;

			this.tail1.zRot = 0;
			this.tail2.zRot = 0;
			this.tail3.zRot = 0;

			this.tail1.xRot = 0;

			this.left_leg.xRot = 1;
			this.right_leg.xRot = 1;

			this.left_knee.xRot = 1;
			this.right_knee.xRot = 1;

			this.head.xRot = 0;
			this.neck.xRot = 0;
			this.head.yRot = 0;

		} else {

			this.body.yRot = 0;

			this.body.zRot = 0;

			this.oldangle = headyRot;

			this.body.xRot = 0;

			this.right_wing1.setRotation(-2.2772F, 1.196F, -0.6124F);
			this.left_wing1.setRotation(-2.2772F, -1.196F, 0.6124F);

			this.right_wing2.yRot = 0;
			this.left_wing2.yRot = 0;
			this.right_wing2.zRot = 0;
			this.left_wing2.zRot = 0;
			this.right_wing2.xRot = 0;
			this.left_wing2.xRot = 0;

			this.right_wing3.yRot = 0;
			this.left_wing3.yRot = 0;
			this.right_wing3.zRot = 0;
			this.left_wing3.zRot = 0;
			this.right_wing3.xRot = 0;
			this.left_wing3.xRot = 0;

			this.tail1.yRot = -(float)Math.cos(animationProgress/5)/5;
			this.tail2.yRot = -(float)Math.cos(animationProgress/5)/5;
			this.tail3.yRot = -(float)Math.cos(animationProgress/5)/5;

			this.tail1.zRot = (float)Math.cos(animationProgress/5)/5;
			this.tail2.zRot = (float)Math.cos(animationProgress/5)/5;
			this.tail3.zRot = (float)Math.cos(animationProgress/5)/5;

			this.head.xRot = 0.7854F;
			this.neck.xRot = -0.6981F;

			this.head.yRot = headyRot;

			this.tail1.xRot = -(float)Math.sin(animationProgress/5)/20 - 20 * pi/180;
			this.tail2.xRot = (float)Math.sin(animationProgress/5)/20 + 10 * pi/180;
			this.tail3.xRot = -(float)Math.sin(animationProgress/5)/20 - 10 * pi/180;

			this.left_leg.xRot = (float)Math.cos(limbAngle * 0.6662F + 3.1415927F) * 1.4F * limbDistance / 2 - 0.3491F;
			this.right_leg.xRot = -(float)Math.cos(limbAngle * 0.6662F + 3.1415927F) * 1.4F * limbDistance / 2 - 0.3491F;

			this.left_knee.xRot = (float)Math.cos(limbAngle * 0.6662F + 3.1415927F) * 1.4F * limbDistance / 2 + 0.6981F;
			this.right_knee.xRot = -(float)Math.cos(limbAngle * 0.6662F + 3.1415927F) * 1.4F * limbDistance / 2 + 0.6981F;

		}


	}
}