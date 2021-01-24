package com.jacobarchambault.randomnumber;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/*  Purpose:  Demonstrate the Formatter, FileInputStream, File, FileOutputStream, 
 *  StringBuffer classes.
 */
import com.jacobarchambault.randomnumber.media.FileFromArray;
import com.jacobarchambault.randomnumber.media.GuardedMedium;
import com.jacobarchambault.randomnumber.media.MyConsole;
import com.jacobarchambault.randomnumber.media.RandomNumbersFile;
import com.jacobarchambault.randomnumber.products.RandomNumberArray;
import com.jacobarchambault.randomnumber.products.RandomNumberString;

public class Program {

	public static void main(
			String[] args) throws IOException {
		firstDemo(
				"numbers.txt");
		secondDemo(
				"numbers2.txt");
	}

	private static void firstDemo(
			String filePath) throws IOException,
			FileNotFoundException {
		writeRandomNumbersFromArray(
				filePath);
		printContentsToConsole(
				filePath);
	}

	private static void printContentsToConsole(
			String filePath) throws FileNotFoundException {
		new GuardedMedium(
				new MyConsole(
						new Scanner(
								new File(
										filePath)))).writeTo();
	}

	private static void secondDemo(
			String filePath) throws IOException,
			FileNotFoundException {
		writeRandomNumbersWithStringBuilder(
				filePath);
		printContentsToConsole(
				filePath);
	}

	private static void writeRandomNumbersFromArray(
			String filePath) throws IOException {
		new GuardedMedium(
				new FileFromArray(
						new FileWriter(
								new File(
										filePath)),
						new RandomNumberArray(
								new Random()))).writeTo();
	}

	private static void writeRandomNumbersWithStringBuilder(
			String filePath) throws IOException {
		new GuardedMedium(
				new RandomNumbersFile(
						new FileWriter(
								new File(
										filePath)),
						new RandomNumberString(
								new StringBuilder(),
								new Random()))).writeTo();
	}

}
