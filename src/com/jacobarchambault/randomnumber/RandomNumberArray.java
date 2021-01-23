package com.jacobarchambault.randomnumber;

import java.util.Random;

public class RandomNumberArray implements Product{

	Random random;
	
	RandomNumberArray(Random random){
		this.random = random;
	}

	@Override
	public int[] generate() {
		int[] array = new int[100];
		for(int i = 1; i <= 100; i++) {
			System.out.println("Writing #" + i);
			array[i - 1] = random.nextInt(); 
		}
		return array;
	}
	
}
