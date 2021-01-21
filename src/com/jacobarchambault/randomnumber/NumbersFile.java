package com.jacobarchambault.randomnumber;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

class NumbersFile {

	private static void showMessage() {
		JOptionPane.showMessageDialog(null, "Output Complete");
	}

	RandomNumberString numberString;

	FileWriter writer;

	NumbersFile(FileWriter writer, RandomNumberString string) {
		this.writer = writer;
		numberString = string;
	}

	void write100RandomNumbers() throws IOException {
		writer.write(numberString.generate());
		writer.close();
		showMessage();
	}

}
