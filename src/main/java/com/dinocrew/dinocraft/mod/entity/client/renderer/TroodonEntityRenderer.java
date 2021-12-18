package com.dinocrew.dinocraft.mod.entity.client.renderer;

import com.dinocrew.dinocraft.Dinocraft;
import com.dinocrew.dinocraft.mod.entity.client.renderer.model.TroodonEntityModel;
import com.dinocrew.dinocraft.mod.entity.common.entity.StegoraptorEntity;
import com.dinocrew.dinocraft.mod.entity.common.entity.TroodonEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class TroodonEntityRenderer <Type extends TroodonEntity> extends MobRenderer<Type, TroodonEntityModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(Dinocraft.MOD_ID, "textures/entities/troodon_entity.png");

    public TroodonEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new TroodonEntityModel<>(context.bakeLayer(TroodonEntityModel.LAYER_LOCATION)),0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type entity) {
        return TEXTURE;
    }
}


