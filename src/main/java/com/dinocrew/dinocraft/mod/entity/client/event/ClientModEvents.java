package com.dinocrew.dinocraft.mod.entity.client.event;

import com.dinocrew.dinocraft.Dinocraft;
import com.dinocrew.dinocraft.mod.entity.ModEntityTypes;
import com.dinocrew.dinocraft.mod.entity.client.renderer.SauropodEntityRenderer;
import com.dinocrew.dinocraft.mod.entity.client.renderer.model.SauropodEntityModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Dinocraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {

    private ClientModEvents() {

    }

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(SauropodEntityModel.LAYER_LOCATION, SauropodEntityModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityTypes.SAUROPOD_ENTITY.get(), SauropodEntityRenderer::new);
    }
}
