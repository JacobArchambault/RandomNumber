package com.jacobarchambault.randomnumber;

import java.io.FileWriter;
import java.io.IOException;

public class NumbersFile {

	RandomNumberString numberString;
	FileWriter writer;

	public NumbersFile(FileWriter writer, RandomNumberString string) {
		this.writer = writer;
		numberString = string;
	}

	void write100RandomNumbers() throws IOException {
		writer.write(numberString.generate());
		writer.close();
	}


}
