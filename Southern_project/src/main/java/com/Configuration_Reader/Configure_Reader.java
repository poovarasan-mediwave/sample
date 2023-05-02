package com.Configuration_Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configure_Reader {
	public static Properties proper;

	public Configure_Reader() throws IOException {
		File f = new File(
				"C:\\Users\\Mediwave Digital\\eclipse-workspace\\Southern_project");
		FileInputStream fi = new FileInputStream(f);

		proper = new Properties();
		proper.load(fi);

	}

	

	public String getResource_title3() {

		String apass = proper.getProperty("resource_title3");
		return apass;

	}

}