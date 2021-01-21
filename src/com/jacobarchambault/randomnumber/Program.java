package com.jacobarchambault.randomnumber;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/*  Purpose:  Demonstrate the Formatter, FileInputStream, File, FileOutputStream, 
 *  StringBuffer classes.
 */
public class Program {

	public static void main(String[] args) throws IOException {
		new GuardedNumbersFile(new NumbersFile(new FileWriter(new File("numbers.txt")),
				new RandomNumberString(new StringBuilder(), new Random()))).tryWriteNumbers();
		new GuardedConsole(new MyConsole("numbers.txt")).tryWriteToConsole();
	}

}
