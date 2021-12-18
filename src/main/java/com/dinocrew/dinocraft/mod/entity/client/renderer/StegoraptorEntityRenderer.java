package com.dinocrew.dinocraft.mod.entity.client.renderer;

import com.dinocrew.dinocraft.Dinocraft;
import com.dinocrew.dinocraft.mod.entity.client.renderer.model.SauropodEntityModel;
import com.dinocrew.dinocraft.mod.entity.client.renderer.model.StegoraptorEntityModel;
import com.dinocrew.dinocraft.mod.entity.common.entity.SauropodEntity;
import com.dinocrew.dinocraft.mod.entity.common.entity.StegoraptorEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class StegoraptorEntityRenderer <Type extends StegoraptorEntity> extends MobRenderer<Type, StegoraptorEntityModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(Dinocraft.MOD_ID, "textures/entities/stegoraptor_entity.png");

    public StegoraptorEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new StegoraptorEntityModel<>(context.bakeLayer(StegoraptorEntityModel.LAYER_LOCATION)),0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type entity) {
        return TEXTURE;
    }
}
