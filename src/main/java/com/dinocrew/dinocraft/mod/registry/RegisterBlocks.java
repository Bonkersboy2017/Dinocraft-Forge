package com.dinocrew.dinocraft.mod.registry;

import com.dinocrew.dinocraft.Dinocraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class RegisterBlocks {


    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Dinocraft.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Dinocraft.MOD_ID);



    public static final RegistryObject<Block> SKELETON_ORE = BLOCKS.register("skeleton_ore", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.TERRACOTTA_GRAY).strength(0.2F, 0.2f).sound(SoundType.WET_GRASS)));
    public static final RegistryObject<Item> SKELETON_ORE_ITEM = ITEMS.register("skeleton_ore", () -> new BlockItem(SKELETON_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Block> BRONZIUM_ORE = BLOCKS.register("bronzium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.TERRACOTTA_GRAY).strength(0.2F, 0.2f).sound(SoundType.WET_GRASS)));
    public static final RegistryObject<Item> BRONZIUM_ORE_ITEM = ITEMS.register("bronzium_ore", () -> new BlockItem(BRONZIUM_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Block> BRONZIUM_BRICKS = BLOCKS.register("bronzium_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.TERRACOTTA_GRAY).strength(0.2F, 0.2f).sound(SoundType.WET_GRASS)));
    public static final RegistryObject<Item> BRONZIUM_BRICKS_ITEM = ITEMS.register("bronzium_bricks", () -> new BlockItem(BRONZIUM_BRICKS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Block> BRONZIUM_BLOCK = BLOCKS.register("bronzium_block", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.TERRACOTTA_GRAY).strength(0.2F, 0.2f).sound(SoundType.WET_GRASS)));
    public static final RegistryObject<Item> BRONZIUM_BLOCK_ITEM = ITEMS.register("bronzium_block", () -> new BlockItem(BRONZIUM_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Block> DINOBENCH = BLOCKS.register("dinobench", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.TERRACOTTA_GRAY).strength(0.2F, 0.2f).sound(SoundType.WET_GRASS)));
    public static final RegistryObject<Item> DINOBENCH_ITEM = ITEMS.register("dinobench", () -> new BlockItem(DINOBENCH.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));


    private static boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return false;
    }

    public static final void registerAll() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());


        DragonwoodMaterial.registerAll();

    }

}


