package cspik3.chapter_5;

import static java.lang.System.out;

/**
 * @author chloe.spilker
 * character types
 * 10/30/18
 */

public class Strings_n_Stuff {

	public static void main(String[] args) {
		char char1 = '\u0037';	// chars have to be wrapped in apostrophes
		char char2 = '\u0036';	// \u0000 is unicode - specific characters
		char char3 = '\u0030';
		char char4 = '\u0032';
		char char5 = '\u0039';
		char char6 = '\u0031';
		char char7 = '\u0038';
		char char8 = '\u0035';
		char char9 = '\u0033';
		char char0 = '\u0034';
		
		// prints numbers in char order
		out.println(char1 + "" + char2 + "" + char3 + "" + char4 + "" + 
		char5 + "" + char6 + "" + char7 + "" + char8 + "" + char9 + "" + char0);
		
		/**
		 * Unicode Alphabet:
		 * A: \u0041
		 * B: \u0042
		 * C: \u0043
		 * D: \u0044
		 * E: \u0045
		 * F: \u0046
		 * G: \u0047
		 * H: \u0048
		 * I: \u0049
		 * J: \u004A
		 * K: \u004B
		 * L: \u004C
		 * M: \u004D
		 * N: \u004E
		 * O: \u004F
		 * P: \u0050
		 * Q: \u0051
		 * R: \u0052
		 * S: \u0053
		 * T: \u0054
		 * U: \u0055
		 * V: \u0056
		 * W: \u0057
		 * X: \u0058
		 * Y: \u0059
		 * Z: \u005A
		 */
		
		// creates a word out of unicode
		String word1 = "\u004D\u0059 ";
		String word2 = "\u004E\u0041\u004D\u0045 ";
		String word3 = "\u0049\u0053 ";
		String word4 = "\u0043\u0048\u004C\u004F\u0045 ";
		String word5 = "\u0053\u0050\u0049\u004C\u004B\u0045\u0052";
		String sent = word1 + word2 + word3 + word4 + word5;
		
		// prints sentence
		out.println(sent);
		
		char char01 = 'A';
		char char02 = 'b';
		char char03 = 'a';
		char char04 = '1';
		char char05 = '8';
		
		boolean boo = char01 < char02;
		boolean bo0 = char03 < char01;
		boolean b00 = char04 < char05;
		
		// tells which char's unicode is larger
		out.println(boo + "\n" + bo0 + "\n" + b00);
		
		// returns whether or not char is capitalized
		if (char01 >= '\u0041' && char01 <= '\u005A') {
			out.println(char01 + " is capatalized.");
		} else {
			out.println(char01 + " is not capatalized.");
		}
		
		// returns whether or not char is lowercase
		if (char02 >= 'a' && char02 <= 'z') {
			out.println(char02 + " is not capatalized.");
		} else {
			out.println(char02 + " is capatalized.");
		}
		
		// character class through dot notation
		out.println("isDigit('a') is " + Character.isDigit('a'));
		out.println("isLetter('a') is " + Character.isLetter('a'));
		out.println("isLowerCase('a') is " + Character.isLowerCase('a'));
		out.println("isUpperCase('a') is " + Character.isUpperCase('a'));
		out.println("toLowerCase('T') is " + Character.toLowerCase('T'));
		out.println("toUpperCase('q') is " + Character.toUpperCase('q'));
		

	}

}
