package com.adactinsite.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws Throwable {
	
	File f = new File ("E:\\maven\\src\\test\\java\\com\\adactinsite\\helper"	);
		FileInputStream fis = new	FileInputStream(f);
	
	p = new Properties();
	p.load(fis);
	
}
	
	public String get_Browser() {
		 String browser = p.getProperty("browser");
		 return browser;
	}
	
	public String get_Url() {
		String url = p.getProperty("url");
		return url;
		
	}
}