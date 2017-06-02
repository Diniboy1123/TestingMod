package diniboy.TestMod.blocks;

import diniboy.TestMod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModCauldron extends Block {

	public ModCauldron() {
		super(Material.GROUND);
		setUnlocalizedName(Reference.mBlocks.CAULDRON.getUnlocalizedName());
		setRegistryName(Reference.mBlocks.CAULDRON.getRegistryName());
	}

}
