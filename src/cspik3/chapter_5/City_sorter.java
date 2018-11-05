package cspik3.chapter_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.out;

public class City_sorter {
	
	@SuppressWarnings({ "unchecked", "rawtypes", "resource" })
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List cities = new ArrayList();
		
		out.println("This program will ask for a list of cities and\nprint them in alphabetical order.");
		
		out.println("\nEnter the first city:");
		String city1 = input.nextLine();
		
		out.println("\nEnter the second city:");
		String city2 = input.nextLine();
		
		out.println("\nEnter the third city:");
		String city3 = input.nextLine();
		
		out.println("\nEnter the fourth city:");
		String city4 = input.nextLine();
		
		out.println("\nEnter the fifth city:");
		String city5 = input.nextLine();
		
		cities = Arrays.asList(city1, city2, city3, city4, city5);
		
		Collections.sort(cities);
		
		out.println();
		
		out.println(cities);
		

	}

}
