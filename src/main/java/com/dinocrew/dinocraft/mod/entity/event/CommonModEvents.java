package com.dinocrew.dinocraft.mod.entity.event;

import com.dinocrew.dinocraft.Dinocraft;
import com.dinocrew.dinocraft.mod.entity.ModEntityTypes;
import com.dinocrew.dinocraft.mod.entity.common.entity.SauropodEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Dinocraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonModEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.SAUROPOD_ENTITY.get(), SauropodEntity.createAttributes().build());
    }
}
