package org.testselenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
	PropertiesFileReader()
	{
		
	}
	public static Properties prop;
	public static Properties loadPropFile(String filepath) {
		 prop = new Properties();
		try {
			FileInputStream f = new FileInputStream(filepath);
			prop.load(f);
			return prop;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	
}
