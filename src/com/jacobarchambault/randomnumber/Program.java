package com.jacobarchambault.randomnumber;

import java.io.File;
import java.io.FileNotFoundException;
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
			write100RandomNumbers(filePath);
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

	private static void write100RandomNumbers(String toFile) throws IOException {
		FileWriter writer = new FileWriter(new File(
				toFile));
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

	private static void writeToConsole(String filePath) throws IOException {
		System.out.println(Files.readString(Paths.get(filePath)));
	}
}
