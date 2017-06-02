package diniboy.TestMod;

public class Reference {
	
    public static final String MODID = "mtm";
    public static final String NAME = "Mr Dini's testing mod";
    public static final String VERSION = "0.1";
    public static final String ACC_MC_VERSIONS = "[1.11.2]";
    
    public static final String CLIENT_PROXY_CLASS = "diniboy.TestMod.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "diniboy.TestMod.proxy.ServerProxy";
    
    public static enum mBlocks {
    	CAULDRON("modcauldron", "ModCauldron");
    	
    	private String unlocalizedName;
    	private String registryName;
    	
    	mBlocks(String unlocalizedName, String registryName) {
    		this.unlocalizedName = unlocalizedName;
    		this.registryName = registryName;
    	}
    	
    	public String getUnlocalizedName() {
    		return unlocalizedName;
    	}
    	
    	public String getRegistryName() {
    		return registryName;
    	}
    }
}
