package com.Smarty.LavaCraft.creativetab;

import com.Smarty.LavaCraft.init.ModItems;
import com.Smarty.LavaCraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabLC
{
    public static final CreativeTabs LC_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.LavaStone;
        }
    };
}
