package com.adactinsite.helper;

public class File_Reader_Manager {

	
	private File_Reader_Manager() {
		//---------> restrict to create object
	}
	
	public static File_Reader_Manager getInstance() {
		File_Reader_Manager helper = new File_Reader_Manager();
		return helper;
	}
	
	public Configuration_Reader grtInstanceCR() throws Throwable {
		Configuration_Reader reader = new Configuration_Reader();
		return reader;
	}
	
}

