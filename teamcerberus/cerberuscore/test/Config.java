package teamcerberus.cerberuscore.test;

import teamcerberus.cerberuscore.config.ConfigurationOption;
import teamcerberus.cerberuscore.config.ConfigurationParser;
import net.minecraftforge.common.Configuration;

public class Config {
	final Configuration	config;

	@ConfigurationOption(category = "category1", key = "testInt1",
			comment = "this is a comment")
	public int			testInt1		= 1234567;
	@ConfigurationOption(category = "category2", key = "testInt2")
	public Integer		testInt2		= 1234567;
	@ConfigurationOption(category = "category1", key = "testBool2")
	public Boolean		testBoolean1	= false;
	@ConfigurationOption(category = "category2", key = "testBool2")
	public boolean		testBoolean2	= true;
	@ConfigurationOption(category = "category1", key = "testDouble")
	public double		testDouble		= 3698.29554D;
	@ConfigurationOption(category = "category2", key = "testString")
	public String		testString		= "this is a test string";

	public Config(Configuration config) {
		this.config = config;
		ConfigurationParser.Parse(this, config);
	}
}
