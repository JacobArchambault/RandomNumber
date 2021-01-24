package com.jacobarchambault.randomnumber.media;

import java.io.FileWriter;
import java.io.IOException;

import com.jacobarchambault.randomnumber.products.Product;

public class FileFromArray implements Medium {

	Product<int[]> array;
	FileWriter writer;

	public FileFromArray(
			FileWriter writer,
			Product<int[]> array) {
		this.writer = writer;
		this.array = array;
	}

	@Override
	public void writeTo() throws IOException {
		int[] myArray = array.generate();
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(
					"Writing #" + (i) + " to file");
			writer.write(
					String.valueOf(
							myArray[i]) + "\n");
		}
		writer.close();
	}

}
