package lottery;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PopNamesCastro {
	public static void main(String[] args) throws IOException {

		// Object Declaration
		FileReader fileBoy = new FileReader("BoyNames.txt");
															
		FileReader fileGirl = new FileReader("GirlNames.txt");
																
																
		Scanner keyboard = new Scanner(System.in);
		Scanner boyScanner = new Scanner(fileBoy);
													
		Scanner girlScanner = new Scanner(fileGirl);
													
		String boyNames[] = new String[200];//making 200 strin arrays for boys
		String girlNames[] = new String[200];//making 200 string arrays for girls
		String userNameB;
		String userNameG;
		String cont = "N";

		// Primitive Declaration
		int choice = -1;
						
		boolean flag = false;
								

		// Reads in from the files into the two name arrays
		for (int i = 0; i < 200; i++) {
			boyNames[i] = boyScanner.nextLine();
			girlNames[i] = girlScanner.nextLine();
		}

		// Repeatable loop for the user
		do 
			while (choice < 1 || choice > 3) {
				System.out.print("What wold you like to look up:\n\t1.  A Boy's Name\n\t2.  A Girl's Name\n\t3.  Both");
				choice = keyboard.nextInt();
				keyboard.nextLine();
			

			
			if (choice == 1) {
				System.out.println("Please enter the name of the boy");
				userNameB = keyboard.nextLine();

				
				for (int i = 0; i < 200; i++) {
					if (userNameB.equalsIgnoreCase(boyNames[i]))
						flag = true;
				}		
				if (flag)
					System.out.println("This boy name was one of the 200 most popular in 2009.");
				else
					System.out.println("This boy name was not one of the 200 most popular in 2009.");
			}

			
			else if (choice == 2) {
				System.out.println("Please enter the name of the girl");
				userNameG = keyboard.nextLine();	
				for (int i = 0; i < 200; i++) {
					if (userNameG.equalsIgnoreCase(girlNames[i]))
						flag = true;
				}			
				if (flag)
					System.out.println("This girl name was one of the 200 most popular in 2009.");
				else
					System.out.println("This girl name was not one of the 200 most popular in 2009.");
			}
			else {
				System.out.println("Please enter the name of the boy");
				userNameB = keyboard.nextLine();

				
				for (int i = 0; i < 200; i++) {
					if (userNameB.equalsIgnoreCase(boyNames[i]))
						flag = true;
				}

				
				if (flag)
					System.out.println("This boy name was one of the 200 most popular in 2009.");
				else
					System.out.println("This boy name was not one of the 200 most popular in 2009.");

				flag = false;

				System.out.println("Please enter the name of the girl");
				userNameG = keyboard.nextLine();

				
				for (int i = 0; i < 200; i++) {
					if (userNameG.equalsIgnoreCase(girlNames[i]))
						flag = true;
				}

				
				if (flag)
					System.out.println("This girl name was one of the 200 most popular in 2009.");
				else
					System.out.println("This girl name was not one of the 200 most popular in 2009.");
			}

			
			System.out.print("Would you like to go again? (Y/N)");
			cont = keyboard.nextLine();
			cont = cont.toUpperCase();

			flag = false;
		} while (cont.charAt(0) == 'Y');
		keyboard.close();
		boyScanner.close();
		girlScanner.close();

	}
}
