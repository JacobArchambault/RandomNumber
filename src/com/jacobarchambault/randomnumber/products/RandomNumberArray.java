package com.jacobarchambault.randomnumber.products;

import java.util.Random;

public class RandomNumberArray implements Product<int[]> {

	Random random;

	public RandomNumberArray(
			Random random) {
		this.random = random;
	}

	@Override
	public int[] generate() {
		int[] array = new int[100];
		for (int i = 1; i <= 100; i++) {
			array[i - 1] = random.nextInt();
		}
		return array;
	}

}
