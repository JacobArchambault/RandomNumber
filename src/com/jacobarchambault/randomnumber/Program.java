package com.jacobarchambault.randomnumber;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

/*  Purpose:  Demonstrate the Formatter, FileInputStream, File, FileOutputStream, 
 *  StringBuffer classes.
 */
public class Program {

	public static void main(String[] args) {
		tryWriteNumbers("numbers.txt");
		showMessage();
		tryWriteToConsole("numbers.txt");
	}

	private static void showMessage() {
		JOptionPane.showMessageDialog(null,
				"Output Complete");
	}

	private static void tryWriteNumbers(String filePath) {
		try {
			new NumbersFile(new FileWriter(new File(
				filePath))).write100RandomNumbers(filePath);;
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,
					"Error creatingfile");
		}
	}

	private static void tryWriteToConsole(String filePath) {
		// The StringBuffer class allows you to append to a string of characters
		try {
			writeToConsole(filePath);
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null,
					"File Not Found. Check the name of the file.");
		} catch (IOException ioe) {
			System.out.println("Error reading the file" + ioe);
		}
	}

	private static void writeToConsole(String filePath) throws IOException {
		System.out.println(Files.readString(Paths.get(filePath)));
	}
}
