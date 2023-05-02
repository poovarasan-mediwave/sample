package com.Configuration_Reader;

import java.io.IOException;

public class FileReaderManager {

	private FileReaderManager() {

	}

	public static FileReaderManager getInstanceFRM() {

		FileReaderManager f = new FileReaderManager();
		return f;
	}

	public Configure_Reader getInstanceCR() throws IOException {
		Configure_Reader c = new Configure_Reader();
		return c;

	}

}
