package tele;

import java.util.Scanner;

public class ArrayDemo {

	private static final int NUM_TVS = 3;

	public static void main(String args[]) {
		int[] arrayA = { 1, 2, 3, 4, 5, 6 };

		// I. print out intArray
		System.out.print("Printing Array A: ");

		print(arrayA);

		// II. create arrayB containing 1, 4, 9, 16, 25, 36, 49
		int arrayB[] = new int[7];

		for (int i = 0; i < 7; i++) {
			arrayB[i] = (i + 1) * (i + 1);
		}

		// III. Print arrayB by turning the previous
		// print functionality into a method which takes
		// an integer array parameter

		print(arrayB);
		// IV. Create arrayC by reading in a number of integers
		// from the user. First ask them how many they will enter.
		// Then ask them to "Enter #1:", "Enter #2:", etc.
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many integers will you enter?");

		int tempInt;
		int arraySize = keyboard.nextInt();
		int[] arrayC = new int[arraySize];

		for (int i = 0; i < arraySize; i++) {
			System.out.println("Enter #" + (i + 1) + ": ");
			tempInt = keyboard.nextInt();
			arrayC[i] = tempInt;
		}
		print(arrayC);
		keyboard.nextLine();

		// V. Create a function findMax which takes
		// an integer array parameter and returns the
		// maximum value in the array. Then print the
		// maximums below.
		System.out.println("MAX OF A: " + findMax(arrayA));
		System.out.println("MAX OF B: " + findMax(arrayB));
		System.out.println("MAX OF C: " + findMax(arrayC));

		// VI. Read the implementation of the method firstElementTest.
		// Then guess what the code below will do.

		firstElementTest(arrayA);
		System.out.print("Printing Array A post call to firstElementTest: ");
		print(arrayA);

		// VII. Guess what the code below will do.
		int[] arrayD = arrayC;
		firstElementTest(arrayD);
		System.out.print("Printing Array C: ");
		print(arrayC);
		System.out.print("Printing Array D: ");
		print(arrayD);

		// VII-B. arrayD is a SHALLOW copy of arrayC.
		// Create a DEEP copy of arrayC now and store it in arrayE.
		// Then comment out the code below and check out what
		// happens.

		int arrayE[] = new int[arrayB.length];

		for (int i = 0; i < arrayE.length; i++) {
			arrayE[i] = arrayB[i];
		}

		firstElementTest(arrayE);
		System.out.print("Printing Array B: ");
		print(arrayC);
		System.out.print("Printing Array E: ");
		print(arrayE);

		// VIII. Create an array of your favorite 5 Strings.
		// Then create a method printLengths that accepts a parameter that is
		// a string array and then prints the strings and their lengths out.
		String myFavStrings[] = { "lets break it down", "justice reigns from above", "Its high noon",
				"Heros never die" };

		// IX. Notice: length versus length()

		// X. Where have you seen a String array before?
		// Let's finally use this! Woot! Woot!
		// Go to Run -> Run Configurations
		
		printLengths(args);

		// XI. Finally, create a 3 element Television array by asking
		// the user for a manufacturer and a screen size. Use a constant
		// variable NUM_TVS to declare the array size.
		// Then for each element in the TV array, power it on, // print that it
		// was powered on, and then
		// print the manufacturer anad screen size.
		// Uncomment out the code below to help you get started
		
		Television tvs[] = new Television[NUM_TVS];
		
		  int screen; String brand;
		  
		  for (int i = 0; i < NUM_TVS; i++){
		System.out.print("Enter brand: "); 
		brand =keyboard.nextLine();
		  keyboard.nextLine(); System.out.print("Enter screen size: "); 
		  screen = keyboard.nextInt();
		  keyboard.nextInt();
		  keyboard.nextLine(); }
		  
		  
		  for (int i=0; i < NUM_TVS; i++) { 
			
			  tvs[i].Power();
			  System.out.println("Turned on TV #" + (i+1) + "" + tvs[i].getManufacturer() + " " + tvs[i].getScreen_size()); 
			  
		  }
		 

		  

		// XII Make a DEEP(ish) copy of the tvs array
		// and save it as tvs2.
		// You can check that it's DEEP(ish) and not shallow
		// by uncommenting out the code below.

		  
		  Television tvs2[] = new Television[tvs.length];
			 
		  for(int i = 0; i < tvs2.length; i++)
		  {
			  tvs2[i]=tvs[i];
		  }
		
		  changeStationTo150(tvs2);
		  System.out.println("Main: channel of tvs[0]: " + tvs[0].getChannel());
		  System.out.println("Main: channel of tvs2[0]: " + tvs2[0].getChannel());
		 

		// XIII - Uncomment out the following code which prints the
		// original tvs array's volumes. There is an error.
		// Debug and fix it.
		/*
		 * for(int i = 0; i <= tvs2.length; i++) {
		 * System.out.println(tvs[i].getVolume()); }
		 */

		// XIV - Create a String ArrayList called namesList and use it
		// to ask the user for an unknown number of strings.
		// Uncomment out the code to help you do this speedily.
		// You will have to import java.util.ArrayList.

		/*
		 * do { System.out.print("Enter student name (or ? to end): ");
		 * userInput = keyboard.nextLine();
		 * 
		 * }while (!userInput.equals("?"));
		 * 
		 * System.out.print("You entered: "); for (int i = 0; i < ???; i++) {
		 * System.out.print(???? + " "); }
		 */

		// XV - Change the TV code to use a television ArrayList instead of an
		// array
		// and let the user enter as many TVs as they'd like.

		keyboard.close();
	}

	public static void firstElementTest(int[] newArray) {
		if (newArray != null) {
			newArray[0] = 7;
		}
	}

	public static void changeStationTo150(Television[] tvArray) {
		if (tvArray != null) {
			tvArray[0].setChannel(150);
		}

	}

	public static void print(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {

			System.out.print(intArray[i] + " ");
		}
		System.out.println();
	}

	public static int findMax(int intArray[]) {
		int max = intArray[0];
		for (int i = 1; i < intArray.length; i++) {
			if (intArray[i] > max) {
				max = intArray[i];
			}

		}
		return max;
	}

	public static void printLengths(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i] + " " + strings[i].length());
		}
	}
}
