package com.Smarty.LavaCraft.block;

import com.Smarty.LavaCraft.creativetab.CreativeTabLC;

public class BlockLavastoneblock extends BlockLC
{
    public BlockLavastoneblock()
    {
        super();
        this.setBlockName("LavaStoneBlock");
        this.setBlockTextureName("LavaStoneBlock");
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(CreativeTabLC.LC_TAB);
    }
}
