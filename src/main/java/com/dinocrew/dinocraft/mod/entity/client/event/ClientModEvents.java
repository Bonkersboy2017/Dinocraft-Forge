package com.dinocrew.dinocraft.mod.entity.client.event;

import com.dinocrew.dinocraft.Dinocraft;
import com.dinocrew.dinocraft.mod.entity.ModEntityTypes;
import com.dinocrew.dinocraft.mod.entity.client.renderer.SauropodEntityRenderer;
import com.dinocrew.dinocraft.mod.entity.client.renderer.StegoraptorEntityRenderer;
import com.dinocrew.dinocraft.mod.entity.client.renderer.TheropodEntityRenderer;
import com.dinocrew.dinocraft.mod.entity.client.renderer.TroodonEntityRenderer;
import com.dinocrew.dinocraft.mod.entity.client.renderer.model.SauropodEntityModel;
import com.dinocrew.dinocraft.mod.entity.client.renderer.model.StegoraptorEntityModel;
import com.dinocrew.dinocraft.mod.entity.client.renderer.model.TheropodEntityModel;
import com.dinocrew.dinocraft.mod.entity.client.renderer.model.TroodonEntityModel;
import com.dinocrew.dinocraft.mod.entity.common.entity.StegoraptorEntity;
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
        event.registerLayerDefinition(TroodonEntityModel.LAYER_LOCATION, TroodonEntityModel::createBodyLayer);
        event.registerLayerDefinition(TheropodEntityModel.LAYER_LOCATION, TheropodEntityModel::createBodyLayer);
        event.registerLayerDefinition(StegoraptorEntityModel.LAYER_LOCATION, StegoraptorEntityModel::createBodyLayer);
    }



    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityTypes.SAUROPOD_ENTITY.get(), SauropodEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypes.TRODOON_ENTITY.get(), TroodonEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypes.THEROPOD_ENTITY.get(), TheropodEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypes.STEGORAPTOR_ENTITY.get(), StegoraptorEntityRenderer::new);
    }
}
