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

	public static void main(String[] args) throws IOException {
		new GuardedNumbersFile(new NumbersFile(new FileWriter(new File("numbers.txt")),
					new RandomNumberString(new StringBuilder(), new Random()))).tryWriteNumbers();
		tryWriteToConsole("numbers.txt");
	}

	private static void tryWriteToConsole(String filePath) {
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
