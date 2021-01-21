package com.jacobarchambault.randomnumber;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class MyConsole implements Writer {
	String filePath;

	MyConsole(String filePath) {
		this.filePath = filePath;
	}

	public void writeTo() throws IOException {
		System.out.println(Files.readString(Paths.get(filePath)));
	}

}
