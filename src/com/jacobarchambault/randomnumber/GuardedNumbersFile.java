package com.jacobarchambault.randomnumber;

import java.io.IOException;

import javax.swing.JOptionPane;

class GuardedNumbersFile {
	NumbersFile file;
	GuardedNumbersFile(NumbersFile file) {
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
