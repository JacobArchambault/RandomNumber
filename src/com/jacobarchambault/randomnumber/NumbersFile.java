package com.jacobarchambault.randomnumber;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class NumbersFile {

	FileWriter writer;

	public NumbersFile(FileWriter writer) {
		this.writer = writer;
	}

	void write100RandomNumbers() throws IOException {
		String numberString = randomNumberString();
		writer.write(numberString);
		// always close the stream
		writer.close();
	}

	private String randomNumberString() {
		Random random = new Random();
		StringBuilder stringBuilder = new StringBuilder();
		// Generate 100 random numbers
		for (int i = 0; i < 100; i++) {
			stringBuilder.append(String.valueOf(random.nextInt()) + "\n");
		}
		return stringBuilder.toString();
	}

}
