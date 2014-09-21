package com.Smarty.LavaCraft.init;

import com.Smarty.LavaCraft.block.BlockLC;
import com.Smarty.LavaCraft.block.BlockLavastoneblock;
import com.Smarty.LavaCraft.block.BlockLavastonebricks;
import com.Smarty.LavaCraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLC LavaStoneBlock = new BlockLavastoneblock();
    public static final BlockLC Lavastonebricks = new BlockLavastonebricks();

    public static void init()
    {
        GameRegistry.registerBlock(LavaStoneBlock, "LavaStoneblock");
        GameRegistry.registerBlock(Lavastonebricks, "Lavastonebricks");
    }
}
