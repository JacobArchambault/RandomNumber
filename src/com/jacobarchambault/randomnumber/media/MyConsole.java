package com.jacobarchambault.randomnumber.media;

import java.io.IOException;
import java.util.Scanner;

public class MyConsole implements Medium {

	Scanner scanner;

	public MyConsole(
			Scanner scanner) {
		this.scanner = scanner;
	}

	@Override
	public void writeTo() throws IOException {
		int lineNumber = 1;
		while (scanner.hasNext()) {
			System.out.println(
					"Reading line number " + lineNumber + ": " + scanner.nextLine());
			lineNumber++;
		}
		scanner.close();
	}

}
