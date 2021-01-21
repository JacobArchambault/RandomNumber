package com.jacobarchambault.randomnumber;

import java.io.IOException;

import javax.swing.JOptionPane;

class GuardedMedium implements Medium {
	Medium medium;

	GuardedMedium(Medium medium) {
		this.medium = medium;
	}

	@Override
	public void writeTo() {
		try {
			medium.writeTo();
		} catch (IOException ioe) {
			System.out.println("Error reading the medium" + ioe);
		}
	}

}
