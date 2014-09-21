package com.Smarty.LavaCraft;

        import com.Smarty.LavaCraft.client.handler.KeyInputEventHandler;
        import com.Smarty.LavaCraft.handler.ConfigurationHandler;
        import com.Smarty.LavaCraft.init.ModBlocks;
        import com.Smarty.LavaCraft.init.ModItems;
        import com.Smarty.LavaCraft.init.Recipes;
        import com.Smarty.LavaCraft.proxy.IProxy;
        import com.Smarty.LavaCraft.reference.Reference;
        import com.Smarty.LavaCraft.utility.LogHelper;
        import cpw.mods.fml.common.FMLCommonHandler;
        import cpw.mods.fml.common.Mod;
        import cpw.mods.fml.common.SidedProxy;
        import cpw.mods.fml.common.event.FMLInitializationEvent;
        import cpw.mods.fml.common.event.FMLPostInitializationEvent;
        import cpw.mods.fml.common.event.FMLPreInitializationEvent;

        import static cpw.mods.fml.common.Mod.EventHandler;

@Mod(modid= Reference.MOD_ID, name= Reference.MOD_NAME, version= Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LavaCraft
{
    @Mod.Instance(Reference.MOD_ID)
    public static LavaCraft instance;

    @SidedProxy (clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @EventHandler
    public void preInit (FMLPreInitializationEvent event)
    {
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        proxy.registerKeyBindings();

        ModItems.init();

        ModBlocks.init();

        LogHelper.info("Pre Initialization Complete!");

    }
    @EventHandler
    public void init (FMLInitializationEvent event)
    {
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());

        Recipes.init();

        LogHelper.info("Initialization Complete!");

    }
    @EventHandler
    public void postInit (FMLPostInitializationEvent event)
    {

        LogHelper.info("Post Initialization Complete!");

    }

}