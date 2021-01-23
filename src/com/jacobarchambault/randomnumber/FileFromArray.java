package com.jacobarchambault.randomnumber;

import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class FileFromArray implements Medium{

	FileWriter writer;
	RandomNumberArray array;
	FileFromArray(FileWriter writer, RandomNumberArray array){
		this.writer = writer;
		this.array = array;
	}
	@Override
	public void writeTo() throws IOException {
		int[] myArray = array.generate();
		for (int i = 0; i < myArray.length; i++){
			System.out.println("Writing #" + (i) + " to file");
			writer.write(String.valueOf(myArray[i]) + "\n");
		}
		writer.close();
	}
	

}
