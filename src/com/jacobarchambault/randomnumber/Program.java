package com.jacobarchambault.randomnumber;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

import javax.swing.JOptionPane;

/*  Purpose:  Demonstrate the Formatter, FileInputStream, File, FileOutputStream, 
 *  StringBuffer classes.
 */
public class Program {

	public static void main(String[] args) {
		File toFile = new File(
				"numbers.txt");

		tryWriteNumbers(toFile);

		// notify the user that the download is complete.
		showMessage();

		tryWriteToConsole("numbers.txt");

	}

	private static void showMessage() {
		JOptionPane.showMessageDialog(null,
				"Output Complete");
	}

	private static void tryWriteNumbers(File file) {
		try {
			write100RandomNumbers(file);
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

	private static void write100RandomNumbers(File toFile) throws IOException {
		// Construct a Formatter object that uses the FileOutputStream class to link to
		// the text file
		// to be downloaded to
		FileWriter writer = new FileWriter(
				toFile);
		Random random = new Random();
		StringBuilder stringBuilder = new StringBuilder();
		// Generate 100 random numbers
		for (int i = 0; i < 100; i++) {
			stringBuilder.append(String.valueOf(random.nextInt()) + "\n");
		}
		writer.write(stringBuilder.toString());
		// always close the stream
		writer.close();
	}
}
