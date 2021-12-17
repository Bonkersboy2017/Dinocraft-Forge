package com.dinocrew.dinocraft.mod.entity.client.renderer;

import com.dinocrew.dinocraft.Dinocraft;
import com.dinocrew.dinocraft.mod.entity.client.renderer.model.SauropodEntityModel;
import com.dinocrew.dinocraft.mod.entity.common.entity.SauropodEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SauropodEntityRenderer<Type extends SauropodEntity> extends MobRenderer<Type, SauropodEntityModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(Dinocraft.MOD_ID, "textures/entities/sauropod_entity.png");

    public SauropodEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new SauropodEntityModel<>(context.bakeLayer(SauropodEntityModel.LAYER_LOCATION)),0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type entity) {
        return TEXTURE;
    }
}
