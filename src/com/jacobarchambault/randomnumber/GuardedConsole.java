package com.jacobarchambault.randomnumber;

import java.io.IOException;

class GuardedConsole {
	MyConsole console;

	GuardedConsole(MyConsole myConsole) {
		console = myConsole;
	}

	void tryWriteToConsole() {
		// The StringBuffer class allows you to append to a string of characters
		try {
			console.writeTo();
		} catch (IOException ioe) {
			System.out.println("Error reading the medium" + ioe);
		}
	}

}
