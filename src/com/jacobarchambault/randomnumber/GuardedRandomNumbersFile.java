package com.jacobarchambault.randomnumber;

import java.io.IOException;

import javax.swing.JOptionPane;

class GuardedRandomNumbersFile {
	RandomNumbersFile file;

	GuardedRandomNumbersFile(RandomNumbersFile file) {
		this.file = file;
	}

	void tryWriteNumbers() {
		try {
			file.write();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error creatingfile");
		}
	}

}
