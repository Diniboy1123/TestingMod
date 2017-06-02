package diniboy.TestMod.proxy;

import diniboy.TestMod.init.ModBlocks;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModBlocks.registerRenders();
	}

}
