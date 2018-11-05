package cspik3.chapter_5;

import static java.lang.System.out;
import java.util.Scanner;

public class More_chars {

	@SuppressWarnings({"resource"})
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// only prints me
		String message = "Welcome to Java";
		message = message.substring(5, 7);
		out.println(message);
		
		// shows position of letter in string
		String message2 = "Welcome to Java";
		out.println(message2.indexOf("J"));
		// doesn't start looking for "a" until after position 13
		out.println(message2.indexOf("a", 13));
		// shows which position it starts in
		out.println(message2.indexOf("Wel"));
		// starts from the back of string
		out.println(message2.lastIndexOf("a"));
		
		
		// separates my first and last name
		out.println("\nEnter your first and last name:");
		String name = input.nextLine();
		int space = name.indexOf(" ");	// finds the index of the space
		String fname = name.substring(0, space);	// from 0 to the space
		String lname = name.substring(space + 1);	// from space + 1 to the end
		// tells user first and last name
		out.println("\nYour first name is: ");
		out.println(fname);
		out.println("\nYour last name is: ");
		out.println(lname);
		
		// parsing things
		String thing = "0";
		int thing1 = Integer.parseInt(thing);
		double thing2 = Double.parseDouble(thing);

		
		/**
		 * NOTES
		 * _____
		 * charAt(); method
		 * gets the char at that position
		 * 
		 * Strings are immutable: 
		 * you can overwrite it, but you cannot change it
		 * 
		 * -1 in finding letter position:
		 * it's not in the string
		 */

	}

}
