package com.jacobarchambault.randomnumber;

import java.io.File;
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
		new GuardedMedium(
				new RandomNumbersFile(
						new FileWriter(
								new File(
										"numbers.txt")),
						new RandomNumberString(
								new StringBuilder(),
								new Random()))).writeTo();
		new GuardedMedium(
				new FileFromArray(
						new FileWriter(
								new File(
										"numbers.txt")),
						new RandomNumberArray(
								new Random()))).writeTo();

		new GuardedMedium(
				new MyConsole(
						new Scanner(
								new File(
										"numbers.txt")))).writeTo();
	}

}
