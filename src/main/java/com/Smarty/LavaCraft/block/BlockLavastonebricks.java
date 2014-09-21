package com.Smarty.LavaCraft.block;

import com.Smarty.LavaCraft.creativetab.CreativeTabLC;

public class BlockLavastonebricks extends BlockLC
{
    public BlockLavastonebricks()
    {
        super();
        this.setBlockName("Lavastonebricks");
        this.setBlockTextureName("Lavastonebricks");
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(CreativeTabLC.LC_TAB);
    }
}