package com.dinocrew.dinocraft.mod.registry;

import com.dinocrew.dinocraft.Dinocraft;
import com.dinocrew.dinocraft.mod.entity.ModEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.sql.ClientInfoStatus;


public class RegisterBlocks {


    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Dinocraft.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Dinocraft.MOD_ID);



    public static final RegistryObject<Block> SKELETON_ORE = BLOCKS.register("skeleton_ore", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.TERRACOTTA_GRAY).strength(0.2F, 0.2f).sound(SoundType.WET_GRASS)));
    public static final RegistryObject<Item> SKELETON_ORE_ITEM = ITEMS.register("skeleton_ore", () -> new BlockItem(SKELETON_ORE.get(), new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));

    public static final RegistryObject<Block> BRONZIUM_ORE = BLOCKS.register("bronzium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.TERRACOTTA_GRAY).strength(0.2F, 0.2f).sound(SoundType.WET_GRASS)));
    public static final RegistryObject<Item> BRONZIUM_ORE_ITEM = ITEMS.register("bronzium_ore", () -> new BlockItem(BRONZIUM_ORE.get(), new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));

    public static final RegistryObject<Block> BRONZIUM_BRICKS = BLOCKS.register("bronzium_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.TERRACOTTA_GRAY).strength(0.2F, 0.2f).sound(SoundType.WET_GRASS)));
    public static final RegistryObject<Item> BRONZIUM_BRICKS_ITEM = ITEMS.register("bronzium_bricks", () -> new BlockItem(BRONZIUM_BRICKS.get(), new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));

    public static final RegistryObject<Block> BRONZIUM_BLOCK = BLOCKS.register("bronzium_block", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.TERRACOTTA_GRAY).strength(0.2F, 0.2f).sound(SoundType.WET_GRASS)));
    public static final RegistryObject<Item> BRONZIUM_BLOCK_ITEM = ITEMS.register("bronzium_block", () -> new BlockItem(BRONZIUM_BLOCK.get(), new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));

    public static final RegistryObject<Block> DINOBENCH = BLOCKS.register("dinobench", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.TERRACOTTA_GRAY).strength(0.2F, 0.2f).sound(SoundType.WET_GRASS)));
    public static final RegistryObject<Item> DINOBENCH_ITEM = ITEMS.register("dinobench", () -> new BlockItem(DINOBENCH.get(), new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));

    public static  final RegistryObject<Item> FOSSIL = ITEMS.register("fossil", ()  -> new Item(new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));

    public static  final RegistryObject<Item> SHARD_OF_ENLIGHTENMENT = ITEMS.register("shard_of_enlightenment", ()  -> new Item(new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));

    public static  final RegistryObject<Item> ENLIGHTENED_CORE = ITEMS.register("enlightened_core", ()  -> new Item(new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));

    public static  final RegistryObject<Item> ENLIGHTENED_NECKLACE = ITEMS.register("enlightened_necklace", ()  -> new Item(new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));

    public static  final RegistryObject<Item> SPEAR = ITEMS.register("spear", ()  -> new Item(new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));

    public static  final RegistryObject<Item> TIME_FLINT = ITEMS.register("time_flint", ()  -> new Item(new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));

    public static  final RegistryObject<Item> WYVERN_CRYSTAL = ITEMS.register("wyvern_crystal", ()  -> new Item(new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));

    public static  final RegistryObject<Item> PILL = ITEMS.register("pill", ()  -> new Item(new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));

    public static  final RegistryObject<Item> DINO_KIDNEY = ITEMS.register("dino_kidney", ()  -> new Item(new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));

    public static  final RegistryObject<Item> DINO_SKELETON_JAW = ITEMS.register("dino_skeleton_jaw", ()  -> new Item(new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));

    public static  final RegistryObject<Item> BRONZIUM_INGOT = ITEMS.register("bronzium_ingot", ()  -> new Item(new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));

    public static  final RegistryObject<Item> DINOSTEEL_INGOT = ITEMS.register("dinosteel_ingot", ()  -> new Item(new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));
    public static  final RegistryObject<Item> SKELETON_SWORD = ITEMS.register("skeleton_sword", ()  -> new SwordItem(ModTeirs.SKELETON, 2, 3f, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));
    public static  final RegistryObject<Item> SKELETON_PICKAXE = ITEMS.register("skeleton_pickaxe", ()  -> new SwordItem(ModTeirs.SKELETON, 2, 3f, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));
    public static  final RegistryObject<Item> SKELETON_SHOVEL = ITEMS.register("skeleton_shovel", ()  -> new SwordItem(ModTeirs.SKELETON, 2, 3f, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));
    public static  final RegistryObject<Item> SKELETON_HOE = ITEMS.register("skeleton_hoe", ()  -> new SwordItem(ModTeirs.SKELETON, 2, 3f, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));
    public static  final RegistryObject<Item> SKELETON_AXE = ITEMS.register("skeleton_axe", ()  -> new SwordItem(ModTeirs.SKELETON, 2, 3f, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));

    public static  final RegistryObject<Item> ENLIGHTENED_SWORD = ITEMS.register("enlightened_sword", ()  -> new SwordItem(ModTeirs.ENLIGHTENED, 2, 3f, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));
    public static  final RegistryObject<Item> ENLIGHTENED_PICKAXE = ITEMS.register("enlightened_pickaxe", ()  -> new SwordItem(ModTeirs.ENLIGHTENED, 2, 3f, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));
    public static  final RegistryObject<Item> ENLIGHTENED_SHOVEL = ITEMS.register("enlightened_shovel", ()  -> new SwordItem(ModTeirs.ENLIGHTENED, 2, 3f, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));
    public static  final RegistryObject<Item> ENLIGHTENED_HOE = ITEMS.register("enlightened_hoe", ()  -> new SwordItem(ModTeirs.ENLIGHTENED, 2, 3f, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));
    public static  final RegistryObject<Item> ENLIGHTENED_AXE = ITEMS.register("enlightened_axe", ()  -> new SwordItem(ModTeirs.ENLIGHTENED, 2, 3f, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));

    public static  final RegistryObject<Item> BRONZIUM_SWORD = ITEMS.register("bronzium_sword", ()  -> new SwordItem(ModTeirs.BRONZIUM, 2, 3f, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));
    public static  final RegistryObject<Item> BRONZIUM_PICKAXE = ITEMS.register("bronzium_pickaxe", ()  -> new SwordItem(ModTeirs.BRONZIUM, 2, 3f, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));
    public static  final RegistryObject<Item> BRONZIUM_SHOVEL = ITEMS.register("bronzium_shovel", ()  -> new SwordItem(ModTeirs.BRONZIUM, 2, 3f, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));
    public static  final RegistryObject<Item> BRONZIUM_HOE = ITEMS.register("bronzium_hoe", ()  -> new SwordItem(ModTeirs.BRONZIUM, 2, 3f, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));
    public static  final RegistryObject<Item> BRONZIUM_AXE = ITEMS.register("bronzium_axe", ()  -> new SwordItem(ModTeirs.SKELETON, 2, 3f, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));

    public static  final RegistryObject<Item> DRAGONWOOD_SWORD = ITEMS.register("dragonwood_sword", ()  -> new SwordItem(ModTeirs.DRAGONWOOD, 2, 3f, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));
    public static  final RegistryObject<Item> DRAGONWOOD_PICKAXE = ITEMS.register("dragonwood_pickaxe", ()  -> new SwordItem(ModTeirs.DRAGONWOOD, 2, 3f, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));
    public static  final RegistryObject<Item> DRAGONWOOD_SHOVEL = ITEMS.register("dragonwood_shovel", ()  -> new SwordItem(ModTeirs.DRAGONWOOD, 2, 3f, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));
    public static  final RegistryObject<Item> DRAGONWOOD_HOE = ITEMS.register("dragonwood_hoe", ()  -> new SwordItem(ModTeirs.DRAGONWOOD, 2, 3f, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));
    public static  final RegistryObject<Item> DRAGONWOOD_AXE = ITEMS.register("dragonwood_axe", ()  -> new SwordItem(ModTeirs.DRAGONWOOD, 2, 3f, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));

    public static final RegistryObject<ArmorItem> BRONZIUM_HELMET = ITEMS.register("bronzium_helmet", () -> new ArmorItem(BronziumInit.BRONZIUM, EquipmentSlot.HEAD, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));
    public static final RegistryObject<ArmorItem> SKELETON_HELMET = ITEMS.register("skeleton_helmet", () -> new ArmorItem(ArmorMaterialInit.SKELETON, EquipmentSlot.HEAD, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));

    public static final RegistryObject<ArmorItem> BRONZIUM_CHESTPLATE = ITEMS.register("bronzium_chestplate", () -> new ArmorItem(BronziumInit.BRONZIUM, EquipmentSlot.CHEST, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));
    public static final RegistryObject<ArmorItem> SKELETON_CHESTPLATE = ITEMS.register("skeleton_chestplate", () -> new ArmorItem(ArmorMaterialInit.SKELETON, EquipmentSlot.CHEST, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));

    public static final RegistryObject<ArmorItem> BRONZIUM_LEGGINGS = ITEMS.register("bronzium_leggings", () -> new ArmorItem(BronziumInit.BRONZIUM, EquipmentSlot.LEGS, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));
    public static final RegistryObject<ArmorItem> SKELETON_LEGGINGS = ITEMS.register("skeleton_leggings", () -> new ArmorItem(ArmorMaterialInit.SKELETON, EquipmentSlot.LEGS, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));

    public static final RegistryObject<ArmorItem> BRONZIUM_BOOTS = ITEMS.register("bronzium_boots", () -> new ArmorItem(BronziumInit.BRONZIUM, EquipmentSlot.FEET, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));
    public static final RegistryObject<ArmorItem> SKELETON_BOOTS = ITEMS.register("skeleton_boots", () -> new ArmorItem(ArmorMaterialInit.SKELETON, EquipmentSlot.FEET, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));


    public static  final RegistryObject <Item> RAW_DINO_FLESH = ITEMS.register("raw_dino_flesh", () -> new Item(new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static  final RegistryObject <Item> DINO_FLESH = ITEMS.register("dino_flesh", () -> new Item(new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static  final RegistryObject <Item> BERRIES = ITEMS.register("berries", () -> new Item(new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static  final RegistryObject <Item> INFECTED_BERRIES = ITEMS.register("infected_berries", () -> new Item(new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static  final RegistryObject <Item> TROPICAL_BERRIES = ITEMS.register("tropical_berries", () -> new Item(new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static  final RegistryObject <Item> CYAD_SEEDS = ITEMS.register("cyad_seeds", () -> new Item(new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static  final RegistryObject <Item> ROTTING_CYADS = ITEMS.register("rotting_cyads", () -> new Item(new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static  final RegistryObject <Item> CYAD_LEAF = ITEMS.register("cyad_leaf", () -> new Item(new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));

    public static final RegistryObject<ForgeSpawnEggItem> SAUROPOD_SPAWN_EGG = ITEMS.register("sauropod_entity_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.SAUROPOD_ENTITY, 25600, 9498256, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));
    public static final RegistryObject<ForgeSpawnEggItem> TROODON_SPAWN_EGG = ITEMS.register("troodon_entity_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.TRODOON_ENTITY, 137, 0, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));
    public static final RegistryObject<ForgeSpawnEggItem> THEROPOD_SPAWN_EGG = ITEMS.register("theropod_entity_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.THEROPOD_ENTITY, 167475200, 16777215, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));
    public static final RegistryObject<ForgeSpawnEggItem> MICRORAPTOR_SPAWN_EGG = ITEMS.register("microraptor_entity_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.MICRORAPTOR_ENTITY, 16753920, 132957, new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));

    public static final RegistryObject<Block> DINOSAUR_TEMPERED_GLASS = BLOCKS.register("dinosaur_tempered_glass", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.TERRACOTTA_GRAY).strength(0.2F, 0.2f).sound(SoundType.WET_GRASS).noOcclusion()));
    public static final RegistryObject<Item> DINOSAUR_TEMPERED_GLASS_ITEM = ITEMS.register("dinosaur_tempered_glass", () -> new BlockItem(DINOSAUR_TEMPERED_GLASS.get(), new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));

    public static RegistryObject<Block> DRAGONGRASS = BLOCKS.register("dragongrass", () -> new Block(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS).strength(0.2f, 0.2f).sound(SoundType.GRASS)));
    public static RegistryObject<Item> DRAGONGRASS_ITEM = ITEMS.register("dragongrass", () -> new BlockItem(DRAGONGRASS.get(), new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));

    public static  RegistryObject<Item> SAUROPOD_SKULL = ITEMS.register("sauropod_skull", () -> new Item(new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));
    public static  RegistryObject<Item> TRODOON_SKULL = ITEMS.register("troodon_skull", () -> new Item(new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));
    public static  RegistryObject<Item> THEREPOD_SKULL = ITEMS.register("theropod_skull", () -> new Item(new Item.Properties().tab(ModItemGroups.DINOCRAFT_TAB)));


    private static boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return false;
    }

    public static final void registerAll() {

        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());


        DragonwoodMaterial.registerAll();

    }

}


