package com.jacobarchambault.randomnumber.media;

import java.io.IOException;

public class GuardedMedium implements Medium {
	Medium medium;

	public GuardedMedium(
			Medium medium) {
		this.medium = medium;
	}

	@Override
	public void writeTo() {
		try {
			medium.writeTo();
		} catch (IOException ioe) {
			System.out.println(
					"Error reading the medium" + ioe);
		}
	}

}
