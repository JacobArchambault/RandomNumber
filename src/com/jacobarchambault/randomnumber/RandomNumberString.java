package com.jacobarchambault.randomnumber;

import java.util.Random;

public class RandomNumberString {
	Random random;
	StringBuilder stringBuilder;
	public RandomNumberString(StringBuilder builder, Random random) {
		stringBuilder = builder;
		this.random = random;
	}
	String generate() {
		// Generate 100 random numbers
		for (int i = 0; i < 100; i++) {
			stringBuilder.append(String.valueOf(random.nextInt()) + "\n");
		}
		return stringBuilder.toString();
	}

}
