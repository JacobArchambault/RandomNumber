package com.jacobarchambault.randomnumber;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

			output100RandomNumbers(file);
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

	private static void output100RandomNumbers(File file) throws FileNotFoundException {
		// Construct a Formatter object that uses the FileOutputStream class to link to
		// the text file
		// to be downloaded to
		Formatter output = new Formatter(
				new FileOutputStream(
						file,
						true));
		Random random = new Random();
		// Generate 100 random numbers
		for (int i = 0; i < 100; i++) {
			output.format("%d",
					(random.nextInt())); // The %d formats to an integer				
		}
		output.close();
	}

	private static void showMessage() {
		JOptionPane.showMessageDialog(null,
				"Output Complete");
	}
}
