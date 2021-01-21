package com.jacobarchambault.randomnumber;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JOptionPane;

public class GuardedConsole {
	static void tryWriteToConsole(String filePath) {
		// The StringBuffer class allows you to append to a string of characters
		try {
			new MyConsole(filePath).writeTo();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "File Not Found. Check the name of the file.");
		} catch (IOException ioe) {
			System.out.println("Error reading the file" + ioe);
		}
	}

}
