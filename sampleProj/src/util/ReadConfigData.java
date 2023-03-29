package util;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigData {
	static Properties prop;
public ReadConfigData() throws IOException
{
	FileInputStream fis= new FileInputStream("./data/config.properties");
	prop =new Properties();
	prop.load(fis);
	}
		public static String getName()
		{
			//System.out.println(prop.getProperty("name"));
		 String s= prop.getProperty("name"); 
		 System.out.println(s);
		 return s;
		
	
		}
		
		public static String getTitle()
		{
			//System.out.println(prop.getProperty("title"));
			System.out.println(prop.getProperty("title"));
		return prop.getProperty("title"); 
		}
		
		public static String getApplicationURL()
		{
			return prop.getProperty("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
		
		

	}

