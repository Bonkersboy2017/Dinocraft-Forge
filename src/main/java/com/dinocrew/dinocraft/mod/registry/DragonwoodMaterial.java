package com.dinocrew.dinocraft.mod.registry;

import com.dinocrew.dinocraft.Dinocraft;

import net.minecraft.core.BlockPos;
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

public class DragonwoodMaterial {

    public static final BlockBehaviour.Properties DRAGONWOOD_SETTINGS = BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS);

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Dinocraft.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Dinocraft.MOD_ID);

    public static final RegistryObject<Block> DRAGONWOOD_PLANKS = BLOCKS.register("dragonwood_planks", () -> new Block(DRAGONWOOD_SETTINGS));
    public static final RegistryObject<Item> DRAGONWOOD_PLANKS_ITEM = ITEMS.register("dragonwood_planks", () -> new BlockItem(DRAGONWOOD_PLANKS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    

    public static final RegistryObject<Block> DRAGONWOOD_LOG = BLOCKS.register("dragonwood_log", () -> new RotatedPillarBlock(DRAGONWOOD_SETTINGS));
    public static final RegistryObject<Item> DRAGONWOOD_LOG_ITEM = ITEMS.register("dragonwood_log", () -> new BlockItem(DRAGONWOOD_LOG.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Block> STRIPPED_DRAGONWOOD_WOOD = BLOCKS.register("stripped_dragonwood_wood", () -> new RotatedPillarBlock(DRAGONWOOD_SETTINGS));
    public static final RegistryObject<Item> STRIPPED_DRAGONWOOD_WOOD_ITEM = ITEMS.register("stripped_dragonwood_wood", () -> new BlockItem(STRIPPED_DRAGONWOOD_WOOD.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Block> STRIPPED_DRAGONWOOD_LOG = BLOCKS.register("stripped_dragonwood_log", () -> new RotatedPillarBlock(DRAGONWOOD_SETTINGS));
    public static final RegistryObject<Item> STRIPPED_DRAGONWOOD_LOG_ITEM = ITEMS.register("stripped_dragonwood_log", () -> new BlockItem(STRIPPED_DRAGONWOOD_LOG.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Block> DRAGONWOOD_WOOD = BLOCKS.register("dragonwood_wood", () -> new RotatedPillarBlock(DRAGONWOOD_SETTINGS));
    public static final RegistryObject<Item> DRAGONWOOD_WOOD_ITEM = ITEMS.register("dragonwood_wood", () -> new BlockItem(DRAGONWOOD_WOOD.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Block> DRAGONWOOD_LEAVES = BLOCKS.register("dragonwood_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).sound(SoundType.AZALEA).strength(0.2f).noOcclusion().isViewBlocking(DragonwoodMaterial::never)));
    public static final RegistryObject<Item> DRAGONWOOD_LEAVES_ITEM = ITEMS.register("dragonwood_leaves", () -> new BlockItem(DRAGONWOOD_LEAVES.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

    public static final RegistryObject<Block> DRAGONWOOD_SLAB = BLOCKS.register("dragonwood_slab", () -> new SlabBlock(DRAGONWOOD_SETTINGS));
    public static final RegistryObject<Item> DRAGONWOOD_SLAB_ITEM = ITEMS.register("dragonwood_slab", () -> new BlockItem(DRAGONWOOD_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Block> DRAGONWOOD_FENCE = BLOCKS.register("dragonwood_fence", () -> new FenceBlock(DRAGONWOOD_SETTINGS));
    public static final RegistryObject<Item> DRAGONWOOD_FENCE_ITEM = ITEMS.register("dragonwood_fence", () -> new BlockItem(DRAGONWOOD_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Block> DRAGONWOOD_STAIRS = BLOCKS.register("dragonwood_stairs", () -> new StairBlock(Blocks.OAK_STAIRS.defaultBlockState(), DRAGONWOOD_SETTINGS));
    public static final RegistryObject<Item> DRAGONWOOD_STAIRS_ITEM = ITEMS.register("dragonwood_stairs", () -> new BlockItem(DRAGONWOOD_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Block> DRAGONWOOD_BUTTON = BLOCKS.register("dragonwood_button", () -> new WoodButtonBlock(DRAGONWOOD_SETTINGS));
    public static final RegistryObject<Item> DRAGONWOOD_BUTTON_ITEM = ITEMS.register("dragonwood_button", () -> new BlockItem(DRAGONWOOD_BUTTON.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static final RegistryObject<Block> DRAGONWOOD_PRESSURE_PLATE = BLOCKS.register("dragonwood_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, DRAGONWOOD_SETTINGS));
    public static final RegistryObject<Item> DRAGONWOOD_PRESSURE_PLATE_ITEM = ITEMS.register("dragonwood_pressure_plate", () -> new BlockItem(DRAGONWOOD_PRESSURE_PLATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static final RegistryObject<Block> DRAGONWOOD_DOOR = BLOCKS.register("dragonwood_door", () -> new DoorBlock(DRAGONWOOD_SETTINGS));
    public static final RegistryObject<Item> DRAGONWOOD_DOOR_ITEM = ITEMS.register("dragonwood_door", () -> new BlockItem(DRAGONWOOD_DOOR.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static final RegistryObject<Block> DRAGONWOOD_TRAPDOOR = BLOCKS.register("dragonwood_trapdoor", () -> new TrapDoorBlock(DRAGONWOOD_SETTINGS));
    public static final RegistryObject<Item> DRAGONWOOD_TRAPDOOR_ITEM = ITEMS.register("dragonwood_trapdoor", () -> new BlockItem(DRAGONWOOD_TRAPDOOR.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static final RegistryObject<Block> DRAGONWOOD_FENCE_GATE = BLOCKS.register("dragonwood_fence_gate", () -> new FenceGateBlock(DRAGONWOOD_SETTINGS));
    public static final RegistryObject<Item> DRAGONWOOD_FENCE_GATE_ITEM = ITEMS.register("dragonwood_fence_gate", () -> new BlockItem(DRAGONWOOD_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    



    private static boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return false;
    }

    public static final void registerAll() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}