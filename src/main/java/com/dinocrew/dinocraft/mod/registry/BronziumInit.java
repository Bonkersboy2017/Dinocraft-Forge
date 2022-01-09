package com.dinocrew.dinocraft.mod.registry;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class BronziumInit {


        public static ArmorMaterial BRONZIUM = new ModBronziumMaterial(100, new int[]  { 950, 1400, 1800, 1000 },
                new int[] {20, 35, 50, 27}, 3.2f, 1.85f, "bronzium", SoundEvents.ARMOR_EQUIP_CHAIN, () -> Ingredient.of(RegisterBlocks.DINO_SKELETON_JAW.get()));

        private BronziumInit() {

        }
}
