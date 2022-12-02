package datadriveninselenium;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileReaderHelper {
	private Properties propObj;
	PropertyFileReaderHelper(String fileName)
	{
		try
		{
			File file=new File(System.getProperty("user.dir")+"\\"+fileName);
			FileInputStream fis=new FileInputStream(file);
			propObj=new Properties();
			propObj.load(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public String getKeyValueFromPropertyFile(String key)
	{
		return propObj.getProperty(key);
		
	}
}
