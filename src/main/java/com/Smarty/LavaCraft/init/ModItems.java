package com.Smarty.LavaCraft.init;

import com.Smarty.LavaCraft.item.*;
import com.Smarty.LavaCraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemLC LavaStone = new ItemLavaStone();
    public static final ItemLC SolidifiedLava = new ItemSolidifiedLava();
    public static final ItemLC ExtractedIron = new ItemExtractedIron();
    public static final ItemLC ExtractedGold = new ItemExtractedGold();
    public static final ItemLC ExtractedCopper = new ItemExtractedCopper();
    public static final ItemLC ExtractedTin = new ItemExtractedTin();
    public static final ItemLC ExtractedSilver = new ItemExtractedSilver();
    public static final ItemLC ExtractedLead = new ItemExtractedLead();
    public static final ItemLC ExtractedNickel = new ItemExtractedNickel();

    public static void init() {
        GameRegistry.registerItem(LavaStone, "LavaStone");
        GameRegistry.registerItem(SolidifiedLava, "SolidifiedLava");
        GameRegistry.registerItem(ExtractedIron, "ExtractedIron");
        GameRegistry.registerItem(ExtractedGold, "ExtractedGold");
        GameRegistry.registerItem(ExtractedCopper, "ExtractedCopper");
        GameRegistry.registerItem(ExtractedTin, "ExtractedTin");
        GameRegistry.registerItem(ExtractedSilver, "ExtractedSilver");
        GameRegistry.registerItem(ExtractedLead, "ExtractedLead");
        GameRegistry.registerItem(ExtractedNickel, "ExtractedNickel");
    }

}