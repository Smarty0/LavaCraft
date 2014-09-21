package com.Smarty.LavaCraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe (new ShapedOreRecipe(new ItemStack(ModBlocks.LavaStoneBlock), "ss ", "ss ", "   ", 's', new ItemStack(ModItems.LavaStone)));
        //GameRegistry.addRecipe (new ShapelessOreRecipe(new ItemStack((ModBlocks.)));

    }
}
