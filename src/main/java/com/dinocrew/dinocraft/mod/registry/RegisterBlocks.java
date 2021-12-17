package com.dinocrew.dinocraft.mod.registry;

import com.dinocrew.dinocraft.Dinocraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


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

    private static boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return false;
    }

    public static final void registerAll() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());


        DragonwoodMaterial.registerAll();

    }

}


