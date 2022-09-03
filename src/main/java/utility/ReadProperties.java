package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties {

	public static String readPropertyFile(String value) throws Exception
	{
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\framework\\Test_Data\\config.properties");
		prop.load(file);
		return prop.getProperty(value);
	
	}
}
