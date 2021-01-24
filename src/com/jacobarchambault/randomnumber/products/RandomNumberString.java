package com.jacobarchambault.randomnumber.products;

import java.util.Random;

public class RandomNumberString implements Product<String> {
	Random random;
	StringBuilder stringBuilder;

	public RandomNumberString(
			StringBuilder builder,
			Random random) {
		stringBuilder = builder;
		this.random = random;
	}

	public String generate() {
		// Generate 100 random numbers
		for (int i = 1; i <= 100; i++) {
			System.out.println(
					"Writing #" + i);
			stringBuilder.append(
					String.valueOf(
							random.nextInt()) + "\n");
		}
		return stringBuilder.toString();
	}

}
