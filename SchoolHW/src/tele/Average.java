package tele;

import java.util.Scanner;

public class Average {
	
	private double data [];

	public Average()	
	{
		int tempInt;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many scores do you wish to enter?");
		tempInt = keyboard.nextInt();
		keyboard.nextLine();
		data = new double[tempInt];

		for (int i = 0; i < data.length; i++) {
			System.out.println("Enter score #" + (i + 1) + ": ");
			tempInt = keyboard.nextInt();
			data[i] = tempInt;
		}
	}
	
	public double calculateMean()
	{
		double mean = 0;
		double total = 0;
		for(int i = 0; i < data.length ; i++)
		{
			total += data[i];
			
			
		}
		mean = total/data.length;
		return mean;
		
	}
	
	public String toString() {
		String str = new String();

		// Filling Str
		for (int i = 0; i < data.length; i++)
			str += "Test " + i  + ": " + data[i] + " ";

		return str;
	}

	public double findMin() {
		double min = data[0];
		
		//Compares the value of min to the other values in data to find the smallest number
		for (int i = 1; i < data.length; i++) {
			if (min > data[i])
				min = data[i];
		}

		return min;
	}

	public double findMax() {
		double max = data[0];

		for (int i = 1; i < data.length; i++) {
			if (max < data[i])
				max = data[i];
		}

		return max;
	}

	public double findMidPoint() {
		double min = findMin();
		double max = findMax();
		double midPoint = (min + max) / 2;

		return midPoint;
	}
}
