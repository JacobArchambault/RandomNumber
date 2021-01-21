package com.jacobarchambault.randomnumber;

import java.io.IOException;

import javax.swing.JOptionPane;

class GuardedFile implements Writer {
	Writer file;

	GuardedFile(Writer file) {
		this.file = file;
	}

	public void writeTo() {
		try {
			file.writeTo();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error creatingfile");
		}
	}

}
