package com.jacobarchambault.randomnumber;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class MyConsole {
	String filePath;
	MyConsole(String filePath) {
		this.filePath = filePath;
	}
	void writeTo() throws IOException {
		System.out.println(Files.readString(Paths.get(filePath)));
	}

}
