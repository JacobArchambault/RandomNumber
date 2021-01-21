package com.jacobarchambault.randomnumber;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

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
