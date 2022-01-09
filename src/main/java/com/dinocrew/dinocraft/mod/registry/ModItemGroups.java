package com.dinocrew.dinocraft.mod.registry;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModItemGroups {
    public static final CreativeModeTab DINOCRAFT_TAB = new CreativeModeTab("dinocraftTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegisterBlocks.FOSSIL.get());
        }


//        @Override
//        public void fillItemList(NonNullList<ItemStack> p_40778_) {
//            super.fillItemList(p_40778_);
//            NonNullList<ItemStack>
//        }
    };
}
