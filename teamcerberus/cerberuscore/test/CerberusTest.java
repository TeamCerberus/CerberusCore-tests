package teamcerberus.cerberuscore.test;

import java.lang.reflect.Field;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod.Init;

@Mod(modid = "CerberusTest", version = "1")
public class CerberusTest {
	@Instance
	public static CerberusTest	instance;
	public Config				config;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		config = new Config(new Configuration(
				event.getSuggestedConfigurationFile()));
		for (Field f : config.getClass().getDeclaredFields()) {
			try {
				System.out.println(f.get(config));
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Init
	public void init(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new EventTest());
	}
}
