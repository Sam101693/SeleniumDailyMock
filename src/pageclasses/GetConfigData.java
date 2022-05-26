package pageclasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetConfigData 
{
	
	
	public String getValue(String key) throws IOException
	{
		
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\DEMON\\eclipse-workspace\\Selenium_Basics_Daily_Mock\\config.properties");
		
		prop.load(fis);
		
		String value = prop.getProperty(key);
		
		return value;
		
	}
	
	

}
