package com.jacobarchambault.randomnumber;

import java.io.IOException;

import javax.swing.JOptionPane;

class GuardedFile implements Medium {
	Medium medium;

	GuardedFile(Medium medium) {
		this.medium = medium;
	}

	public void writeTo() {
		try {
			medium.writeTo();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error creatingfile");
		}
	}

}
