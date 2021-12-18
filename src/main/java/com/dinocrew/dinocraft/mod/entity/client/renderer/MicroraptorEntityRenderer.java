package com.dinocrew.dinocraft.mod.entity.client.renderer;

import com.dinocrew.dinocraft.Dinocraft;
import com.dinocrew.dinocraft.mod.entity.client.renderer.model.MicroraptorEntityModel;
import com.dinocrew.dinocraft.mod.entity.client.renderer.model.SauropodEntityModel;
import com.dinocrew.dinocraft.mod.entity.common.entity.MicroraptorEntity;
import com.dinocrew.dinocraft.mod.entity.common.entity.SauropodEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class MicroraptorEntityRenderer  <Type extends MicroraptorEntity> extends MobRenderer<Type, MicroraptorEntityModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(Dinocraft.MOD_ID, "textures/entities/microraptor_entity.png");


    public MicroraptorEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new MicroraptorEntityModel<>(context.bakeLayer(MicroraptorEntityModel.LAYER_LOCATION)),0.5f);
    }
    @Override
    public ResourceLocation getTextureLocation(Type entity) {
        return TEXTURE;
    }
}


