package com.jacobarchambault.randomnumber;

import java.io.IOException;

import javax.swing.JOptionPane;

class GuardedRandomNumbersFile implements Writer {
	RandomNumbersFile file;

	GuardedRandomNumbersFile(RandomNumbersFile file) {
		this.file = file;
	}

	public void write() {
		try {
			file.write();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error creatingfile");
		}
	}

}
