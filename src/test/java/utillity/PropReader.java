package utillity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropReader {
	
	public static String  ReadProperty(String key1) throws FileNotFoundException {
		
		String Val="";
		
		String path =System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties";
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream(path);
		
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Val=prop.getProperty(key1);
	
		return Val;
		
	}
 
	  
	  
  }

