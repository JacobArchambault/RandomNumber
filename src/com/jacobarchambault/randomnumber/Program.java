package com.jacobarchambault.randomnumber;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Random;

import javax.swing.JOptionPane;

/*  Purpose:  Demonstrate the Formatter, FileInputStream, File, FileOutputStream, 
 *  StringBuffer classes.
 */
public class Program {

	public static void main(String[] args) {
		File file = new File(
				"numbers.txt");



		tryOutputNumbers(file);

		// notify the user that the download is complete.
		showMessage();

		method2(file);

	}

	private static void tryOutputNumbers(File file) {
		try {

			write100RandomNumbers(file);
			// always close the stream
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,
					"Error creatingfile");
		}
	}

	private static void method2(File file) {
		// The StringBuffer class allows you to append to a string of characters
		StringBuffer strContent = new StringBuffer();
		FileInputStream fin;
		try {
			fin = new FileInputStream(
					file);
			// while there is anything to read through the FileInputStream append to the
			// StringBuffer
			int ch;
			while ((ch = fin.read()) != -1) {
				strContent.append((char) ch);
			}
			// close the stream
			fin.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null,
					"File Not Found. Check the name of the file.");
		} catch (IOException ioe) {
			System.out.println("Error reading the file" + ioe);
		}
		System.out.println(strContent);
	}

	private static void write100RandomNumbers(File toFile) throws IOException {
		// Construct a Formatter object that uses the FileOutputStream class to link to
		// the text file
		// to be downloaded to
		FileWriter writer = new FileWriter(toFile);
		Random random = new Random();
		StringBuilder stringBuilder = new StringBuilder();
		// Generate 100 random numbers
		for (int i = 0; i < 100; i++) {
			stringBuilder.append(String.valueOf(random.nextInt()) + "\n");
		}
		writer.write(stringBuilder.toString());			
		writer.close();
	}

	private static void showMessage() {
		JOptionPane.showMessageDialog(null,
				"Output Complete");
	}
}
