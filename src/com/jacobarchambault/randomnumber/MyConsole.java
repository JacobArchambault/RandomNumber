package com.jacobarchambault.randomnumber;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MyConsole {
	static void writeToConsole(String filePath) throws IOException {
		System.out.println(Files.readString(Paths.get(filePath)));
	}

}
