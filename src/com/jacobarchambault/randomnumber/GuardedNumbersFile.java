package com.jacobarchambault.randomnumber;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import javax.swing.JOptionPane;

public class GuardedNumbersFile {
	static void tryWriteNumbers(String filePath) {
		try {
			new NumbersFile(new FileWriter(new File(filePath)),
					new RandomNumberString(new StringBuilder(), new Random())).write100RandomNumbers();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error creatingfile");
		}
	}

}
