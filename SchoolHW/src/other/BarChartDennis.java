import java.io.*;
import java.util.Scanner;

public class BarChartDennis {

	public static void main(String[] args) throws IOException {
		String input;
		String output;
		String line;
		int number;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter an InputFile: ");
		input = scan.nextLine();
		System.out.print("Enter an Output File: ");
		output = scan.nextLine(); // gets the users output File
		
		scan.close();//Closes the scanner
		
		File file = new File(input);
		Scanner fileScanner = new Scanner(file);
		
		FileWriter fw = new FileWriter ("Results.txt", true);
		PrintWriter outputFile = new PrintWriter(fw); // output file initialization
		
		
		while(fileScanner.hasNextLine())
		{
			line = fileScanner.nextLine();
	    	outputFile.print(line+":  "); //prints first line from input file to output file
	    	line = fileScanner.nextLine();
	    	number=Integer.parseInt(line); //changes next line to an int
	        number = number / 100; //divides int by 100
	        String star = "*";
	        int counter = 0;
	        while (counter < number)
	        {
	        	outputFile.print("*"); //prints amount of stars according to number / 100
	        	counter++; //updates counter
	        }
	        outputFile.println("");
	    }
	    fileScanner.close(); //closes file scanners
	    outputFile.close();
	    
	    System.out.println("");
	    
	    System.out.println("Bar Chart Completed!");
		
	}

}
