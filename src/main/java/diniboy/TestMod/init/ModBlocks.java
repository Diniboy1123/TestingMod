package diniboy.TestMod.init;

import diniboy.TestMod.blocks.ModCauldron;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block cauldron;

	public static void init() {
		cauldron = new ModCauldron();
	}
	
	public static void register() {
		GameRegistry.register(cauldron);
	}
	
	public static void registerRenders() {
		registerRender(cauldron);
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}

}
