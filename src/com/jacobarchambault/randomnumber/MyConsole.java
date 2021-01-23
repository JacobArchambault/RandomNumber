package com.jacobarchambault.randomnumber;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class MyConsole implements Medium {
	String filePath;

	MyConsole(
			String filePath) {
		this.filePath = filePath;
	}

	@Override
	public void writeTo() throws IOException {
		System.out.println(
				Files.readString(
						Paths.get(
								filePath)));
	}

}
