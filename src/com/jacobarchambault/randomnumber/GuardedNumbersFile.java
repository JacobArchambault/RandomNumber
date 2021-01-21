package com.jacobarchambault.randomnumber;

import java.io.IOException;

import javax.swing.JOptionPane;

public class GuardedNumbersFile {
	NumbersFile file;
	public GuardedNumbersFile(NumbersFile file) {
		this.file = file;
	}
	void tryWriteNumbers() {
		try {
			file.write100RandomNumbers();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error creatingfile");
		}
	}

}
