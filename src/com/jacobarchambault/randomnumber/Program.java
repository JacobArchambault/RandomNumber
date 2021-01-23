package com.jacobarchambault.randomnumber;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/*  Purpose:  Demonstrate the Formatter, FileInputStream, File, FileOutputStream, 
 *  StringBuffer classes.
 */
public class Program {

	public static void main(
			String[] args) throws IOException {
//		new GuardedMedium(
//				new RandomNumbersFile(
//						new FileWriter(
//								new File(
//										"numbers.txt")),
//						new RandomNumberString(
//								new StringBuilder(),
//								new Random()))).writeTo();
		new GuardedMedium(
				new FileFromArray(
						new FileWriter(
								new File(
										"numbers.txt")),
						new RandomNumberArray(
								new Random()))).writeTo();

		new GuardedMedium(
				new MyConsole(
						"numbers.txt")).writeTo();
	}

}
