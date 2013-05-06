package teamcerberus.cerberuscore.test;

import net.minecraftforge.common.Configuration;
import teamcerberus.cerberuscore.config.ConfigurationClass;
import teamcerberus.cerberuscore.config.ConfigurationParser;

public class ConfigExample2 {
	Options options;
	
	public ConfigExample2(Configuration conf) {
		options = new Options();
		ConfigurationParser.ParseClass(options, conf);
	}
	
	@ConfigurationClass
	public class Options {
		public boolean ShouldIDoThis = false;
	}
	@ConfigurationClass
	public class Items {
		public int itemTest = 1234;
	}
}
