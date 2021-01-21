package com.jacobarchambault.randomnumber;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

class RandomNumbersFile implements Writer {

	private static void showMessage() {
		JOptionPane.showMessageDialog(null, "Output Complete");
	}

	RandomNumberString numberString;

	FileWriter writer;

	RandomNumbersFile(FileWriter writer, RandomNumberString string) {
		this.writer = writer;
		numberString = string;
	}

	@Override
	public void write() throws IOException {
		writer.write(numberString.generate());
		writer.close();
		showMessage();
	}

}
