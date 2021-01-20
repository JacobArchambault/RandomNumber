package com.jacobarchambault.randomnumber;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Formatter;

import javax.swing.JOptionPane;

/*  Purpose:  Demonstrate the Formatter, FileInputStream, File, FileOutputStream, 
 *  StringBuffer classes.
 */
public class Program {

	public static void main(String[] args) {
		File file = new File(
				"numbers.txt");


		// The StringBuffer class allows you to append to a string of characters

		method1(file);

		// notify the user that the download is complete.
		JOptionPane.showMessageDialog(null,
				"Output Complete");

		method2(file);

	}

	private static void method2(File file) {
		StringBuffer strContent = new StringBuffer(
				"");
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

	private static void method1(File file) {
		try {
			// Construct a Formatter object that uses the FileOutputStream class to link to
			// the text file
			// to be downloaded to
			Formatter output = new Formatter(
					new FileOutputStream(
							file,
							true));

			// Generate 100 random numbers
			for (int i = 0; i < 100; i++) {
				output.format("%d",
						(int) (Math.random() * 100000)); // The %d formats to an integer

			}
			// always close the stream
			output.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,
					"Error creatingfile");
		}
	}
}
