package com.dinocrew.dinocraft.mod.entity.client.renderer;

import com.dinocrew.dinocraft.Dinocraft;
import com.dinocrew.dinocraft.mod.entity.client.renderer.model.TheropodEntityModel;
import com.dinocrew.dinocraft.mod.entity.common.entity.StegoraptorEntity;
import com.dinocrew.dinocraft.mod.entity.common.entity.TheropodEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class TheropodEntityRenderer <Type extends TheropodEntity> extends MobRenderer<Type, TheropodEntityModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(Dinocraft.MOD_ID, "textures/entities/theropod_entity.png");

    public TheropodEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new TheropodEntityModel<>(context.bakeLayer(TheropodEntityModel.LAYER_LOCATION)),0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type entity) {
        return TEXTURE;
    }
}

