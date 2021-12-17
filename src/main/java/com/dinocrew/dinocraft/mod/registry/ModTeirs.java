package com.dinocrew.dinocraft.mod.registry;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import org.lwjgl.system.CallbackI;

public class ModTeirs {
    public static final ForgeTier SKELETON = new ForgeTier(1, 1500, 1f, 4f, 10, Tags.Blocks.NEEDS_GOLD_TOOL, () -> Ingredient.of(RegisterBlocks.DINO_KIDNEY.get()
    ));

    public static final ForgeTier ENLIGHTENED = new ForgeTier(1, 1500, 1f, 4f, 10, Tags.Blocks.NEEDS_GOLD_TOOL, () -> Ingredient.of(RegisterBlocks.DINO_KIDNEY.get()
    ));

    public static final ForgeTier BRONZIUM = new ForgeTier(1, 1500, 1f, 4f, 10, Tags.Blocks.NEEDS_GOLD_TOOL, () -> Ingredient.of(RegisterBlocks.DINO_KIDNEY.get()
    ));

    public static final ForgeTier DRAGONWOOD = new ForgeTier(1, 1500, 1f, 4f, 10, Tags.Blocks.NEEDS_GOLD_TOOL, () -> Ingredient.of(RegisterBlocks.DINO_KIDNEY.get()
    ));}

