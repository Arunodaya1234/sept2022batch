package datadriveninselenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

	public static void main(String[] args) throws IOException {
//		String userDir=System.getProperty("user.dir");
//		System.out.println(userDir);
//		File file=new File(userDir+"\\propertyFile.properties"); 
//		FileInputStream fis=new FileInputStream(file);
//		Properties propObj=new Properties();
//		propObj.load(fis);
//		String myurl=propObj.getProperty("url");
//		System.out.println(myurl);
//		System.out.println(propObj.getProperty("uid"));
		
		PropertyFileReaderHelper obj=new PropertyFileReaderHelper("propertyFile.properties");
		System.out.println(obj.getKeyValueFromPropertyFile("url"));
		System.out.println(obj.getKeyValueFromPropertyFile("uid"));
		System.out.println(obj.getKeyValueFromPropertyFile("pass"));
		System.out.println(obj.getKeyValueFromPropertyFile("email"));
		
	}

}
