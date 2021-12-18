package com.dinocrew.dinocraft.mod.entity.event;

import com.dinocrew.dinocraft.Dinocraft;
import com.dinocrew.dinocraft.mod.entity.ModEntityTypes;
import com.dinocrew.dinocraft.mod.entity.common.entity.*;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Dinocraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonModEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.SAUROPOD_ENTITY.get(), SauropodEntity.createAttributes().build());
        event.put(ModEntityTypes.TRODOON_ENTITY.get(), TroodonEntity.createAttributes().build());
        event.put(ModEntityTypes.THEROPOD_ENTITY.get(), TheropodEntity.createAttributes().build());
        event.put(ModEntityTypes.STEGORAPTOR_ENTITY.get(), StegoraptorEntity.createAttributes().build());
        event.put(ModEntityTypes.MICRORAPTOR_ENTITY.get(), MicroraptorEntity.createAttributes().build());
        //  event.put(ModEntityTypes.MOSASAURUS_ENTITY.get(), MosasaurusEntity.createAttributes().build());
    }
}
