package com.jacobarchambault.randomnumber.media;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.jacobarchambault.randomnumber.products.RandomNumberString;

public class RandomNumbersFile implements Medium {

	private static void showMessage() {
		JOptionPane.showMessageDialog(
				null,
				"Output Complete");
	}

	RandomNumberString numberString;

	FileWriter writer;

	public RandomNumbersFile(
			FileWriter writer,
			RandomNumberString string) {
		this.writer = writer;
		numberString = string;
	}

	@Override
	public void writeTo() throws IOException {
		writer.write(
				numberString.generate());
		writer.close();
		showMessage();
	}

}
