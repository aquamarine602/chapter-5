package cspik3.chapter_5;

import java.util.Scanner;
import static java.lang.System.out;

public class Methods_and_ya {

	@SuppressWarnings({"resource", "unused"})
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String s1 = "Welcome to Java";
		String s2 = "Programming is fun";
		String s3 = "Welcome to Java";
		
		out.println(s1 == s2);					// a
		out.println(s2 == s3);					// b
		out.println(s1.equals(s2));				// c
		out.println(s1.equals(s3));				// d
		out.println(s1.compareTo(s2));			// e
		out.println(s2.compareTo(s3));			// f
		out.println(s2.compareTo(s2));			// g
		out.println(s1.charAt(0));				// h
		out.println(s1.indexOf('j'));			// i
		out.println(s1.indexOf("to"));			// j
		out.println(s1.lastIndexOf('a'));		// k
		out.println(s1.lastIndexOf("o", 15));	// l
		out.println(s1.length());				// m
		out.println(s1.substring(5));			// n
		out.println(s1.substring(5,11));		// o
		out.println(s1.startsWith("Wel"));		// p
		out.println(s1.endsWith("Java"));		// q
		out.println(s1.toLowerCase());			// r
		out.println(s1.toUpperCase());			// s
		out.println(s1.concat(s2));				// t
		out.println(s1.contains(s2));			// u
		out.println("\t Wel \t".trim());		// v
		
		
		

	}

}
