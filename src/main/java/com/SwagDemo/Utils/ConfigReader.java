package com.SwagDemo.Utils;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

import org.apache.log4j.Logger;

public class ConfigReader {

	Logger log = Logger.getLogger(ConfigReader.class);
	public static Properties prop; 

	public ConfigReader() {

		try {
			prop= new Properties();
			FileReader in = new FileReader("./Properties/config.properties");
			log.info("File as been loaded");

			prop.load(in);

		} catch (Exception e) {
			System.out.println("The file is not loaded");
			e.printStackTrace();
		}
	}

	public  String getProperty(String value) {
		
		try {

		 

		} catch (Exception e) {
			System.out.println("The file is not uploaded");
			e.printStackTrace();
		}
		return prop.getProperty(value);

	}

}
