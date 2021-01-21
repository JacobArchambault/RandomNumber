package com.jacobarchambault.randomnumber;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

class RandomNumbersFile {

	private static void showMessage() {
		JOptionPane.showMessageDialog(null, "Output Complete");
	}

	RandomNumberString numberString;

	FileWriter writer;

	RandomNumbersFile(FileWriter writer, RandomNumberString string) {
		this.writer = writer;
		numberString = string;
	}

	void write() throws IOException {
		writer.write(numberString.generate());
		writer.close();
		showMessage();
	}

}
