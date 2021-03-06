package main;

import java.util.Scanner;

public class Converter_v1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int menuSelection = 0;
		
		while (menuSelection != 4) {
			System.out.println("Please select an option: \n" + 
		"1. Cups to Teaspoons \n" + 
		"2. Miles to Kilometers \n" +
		"3. US Gallons to Imperial Gallons \n" +
		"4. Quit");
		
		Scanner select = new Scanner(System.in);
		
		menuSelection = select.nextInt();
		
			switch(menuSelection) {
			case 1: {System.out.println("How many Cups do you have?");
						Scanner cups = new Scanner(System.in);
						int tea = cups.nextInt();
					System.out.println("You have " + (tea * 48) + " teaspoons. \n");
					break;}
			case 2: {System.out.println("How many miles do you have?");
						Scanner miles = new Scanner(System.in);
						int kilo = miles.nextInt();
					System.out.println("You will walk " + (kilo * 1.6) + " kilometers. \n");
					break;}
			case 3: {System.out.println("How many US gallons do you have?");
						Scanner US = new Scanner(System.in);
						int imp = US.nextInt();
					System.out.println("You have " + (imp * 0.83) + " Imperial gallons. \n");
					break;}
			default : break;
			}
		}
	}
}
