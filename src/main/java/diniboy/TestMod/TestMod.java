package diniboy.TestMod;

import diniboy.TestMod.Reference.mBlocks;
import diniboy.TestMod.init.ModBlocks;
import diniboy.TestMod.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACC_MC_VERSIONS)
public class TestMod {  
	@Instance
	public static TestMod instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.init();
		ModBlocks.register();
	}
	
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	System.out.println("Init");
    	proxy.init();
    }
}
