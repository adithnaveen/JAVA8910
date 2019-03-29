package com.training.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * 
 * @author Naveen
 * @see Program to store and get the properties information with files (.properties / .xml)
 *    Note that when you are trying to use resource bundle, it shall be inside src folder 
 */
public class PropertiesFileDemo {
	public static void main(String[] args) {
		
//		readFromXML();
//		writeToXML(); 
//		writeProperties();
//		readProperties();
		
		readResourceBundle();
	}

	private static void readFromXML() {
		try {
			File file = new File("DB.xml");
			FileInputStream fileInput = new FileInputStream(file);
			Properties properties = new Properties();
			properties.loadFromXML(fileInput);
			fileInput.close();

			Enumeration keys = properties.keys();
			while (keys.hasMoreElements()) {
				String key = (String) keys.nextElement();
				String value = properties.getProperty(key);
				System.out.println("Key :"+ key + ", Value: " + value);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void writeToXML() {

		try {
			Properties properties = new Properties(); 
			properties.setProperty("stagingServer", "password@123"); 
			properties.setProperty("applicationServer", "dontTry123"); 
			properties.setProperty("testingServer", "preCheck456"); 
			
			properties.storeToXML(new FileOutputStream("DB.xml"), "Servers Password");
		
			System.out.println("properties saved... ");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	private static void readProperties() {
		Properties properties = new Properties(); 
		
		try {
			FileInputStream inStream = new FileInputStream("data.properties"); 
			properties.load(inStream);
			inStream.close(); 
			
			Enumeration keys = properties.keys();
			while (keys.hasMoreElements()) {
				String key = (String) keys.nextElement();
				String value = properties.getProperty(key);
				System.out.println("Key :"+ key + ", Value: " + value);
			}

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	private static void writeProperties() {
		try {
			Properties properties = new Properties(); 
			properties.setProperty("server1", "Asia-Mumbai"); 
			properties.setProperty("server2", "USA-Reston"); 
			properties.setProperty("server3", "Oman-Sur"); 
			
			properties.store(new FileOutputStream("data.properties"), "Configuration data");

			System.out.println("properties saved... ");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	private static void readResourceBundle() {
		
		Locale[] supportedLocales = {
			    Locale.FRENCH,
			    Locale.GERMAN,
			    Locale.ENGLISH
			};
		
		for(Locale locale : supportedLocales) {
			
			ResourceBundle resourceBundle = ResourceBundle.getBundle("greetings", locale); 
			System.out.println("\nLanguage " + locale.getLanguage());
			System.out.println("------------------------------------------");
			Enumeration keys = resourceBundle.getKeys();
			
			while (keys.hasMoreElements()) {
				String key = (String)keys.nextElement();
				String value = resourceBundle.getString(key);
				System.out.println("key -> " + key + ", " + "value => " + value);
			}		
		}
	}
}
