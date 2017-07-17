import java.util.Scanner;

public class ISPDennis {

	public static void main(String[] args) {
		//initializing variables for calculations
		String input;
		char pack;
		int hours;
		double month;
		double hourCost;
		double total;
		//creating the scanner
		Scanner scan = new Scanner(System.in);
		//asking the user to choose a package
		System.out.println("Hello this is your monthly internet Service provider");
		System.out.println("Which package did you choose? A, B, or C?");
		
		//getting the input and converting it to a char
		input = scan.nextLine();
		pack = input.charAt(0);
		
		//asking the user for the amount of hours provided
		System.out.println("Enter the number of hours provided");
		hours = scan.nextInt();
		
		//if user chooses pack a 
		if(pack == 'a' || pack == 'A')
		{
			
			month = 9.95;
			if(hours > 10)
			{
				//this calculates total if hours goes above the 10 hour limit
			hourCost = 2.00 * (hours - 10);
			total = hourCost + month;
			System.out.println(total);
			}
			// if not above the limit it just charges the month
			else{
				total = month;
				System.out.println(total);
			}
		}
		
		// if users chooses b
		if (pack == 'B' || pack == 'b')
		{
			month = 13.95;
			
			//This calculates the total if hours goes above the 20 hours limit
			if(hours > 20)
			{
			hourCost = 1.00 * (hours - 20);
			total = hourCost + month;
			System.out.println(total);
			}
			
			// if not above limit it just charges the month
			else{
				total = month;
				System.out.println(total);
			}
		}
		// since pack c doesnt have a limit it just charges the monthly rate
		if(pack == 'c' || pack == 'C')
		{
			month = 19.95;
			total = month;
			System.out.println(total);
		}
	
	}

}
