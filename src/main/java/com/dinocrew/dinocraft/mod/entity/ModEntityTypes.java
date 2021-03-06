package com.dinocrew.dinocraft.mod.entity;

import com.dinocrew.dinocraft.Dinocraft;
import com.dinocrew.dinocraft.mod.entity.common.entity.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    private ModEntityTypes() {}

    public static DeferredRegister<EntityType<?>> ENTITIES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, Dinocraft.MOD_ID);

        public static final RegistryObject<EntityType<SauropodEntity>> SAUROPOD_ENTITY = ENTITIES.register("sauropod_entity",
                () -> EntityType.Builder.of(SauropodEntity::new, MobCategory.MONSTER).sized(4f, 4f)
                        .build(new ResourceLocation(Dinocraft.MOD_ID, "sauropod_entity").toString()));

        public static final RegistryObject<EntityType<TroodonEntity>> TRODOON_ENTITY = ENTITIES.register("troodon_entity",
            () -> EntityType.Builder.of(TroodonEntity::new, MobCategory.MONSTER).sized(2f, 2.5f)
                    .build(new ResourceLocation(Dinocraft.MOD_ID, "troodon_entity").toString()));

        public static final RegistryObject<EntityType<TheropodEntity>> THEROPOD_ENTITY = ENTITIES.register("theropod_entity",
            () -> EntityType.Builder.of(TheropodEntity::new, MobCategory.MONSTER).sized(4f, 2.5f)
                    .build(new ResourceLocation(Dinocraft.MOD_ID, "theropod_entity").toString()));

        public static final RegistryObject<EntityType<StegoraptorEntity>> STEGORAPTOR_ENTITY = ENTITIES.register("stegoraptor_entity",
            () -> EntityType.Builder.of(StegoraptorEntity::new, MobCategory.MONSTER).sized(0.8f, 0.6f)
                    .build(new ResourceLocation(Dinocraft.MOD_ID, "stegoraptor_entity").toString()));


    public static final RegistryObject<EntityType<MicroraptorEntity>> MICRORAPTOR_ENTITY = ENTITIES.register("microraptor_entity",
            () -> EntityType.Builder.of(MicroraptorEntity::new, MobCategory.MONSTER).sized(2f, 2.5f)
                    .build(new ResourceLocation(Dinocraft.MOD_ID, "microraptor_entity").toString()));
//
//    public static final RegistryObject<EntityType<MosasaurusEntity>> MOSASAURUS_ENTITY = ENTITIES.register("mosasaurus_entity",
//            () -> EntityType.Builder.of(MosasaurusEntity::new, MobCategory.MONSTER).sized(0.8f, 0.6f)
//                    .build(new ResourceLocation(Dinocraft.MOD_ID, "mosasaurus_entity").toString()));

}

