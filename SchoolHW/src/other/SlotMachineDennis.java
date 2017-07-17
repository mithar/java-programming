import java.util.Random;
import java.util.Scanner;

public class SlotMachineDennis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input; // String to read input from the uiser
		boolean cont = true;//boolean to make the loop run 
		String fruit = null; //String to change the fruit strings change with the randoms
		double userMoney; // the users inputted money
		int slot; //slot 1
		int slot2; //slot2
		int slot3; // slot3
		Scanner scan = new Scanner (System.in); //scanner to scan user input
		Random rand = new Random(); //random to make the slots random
		
		System.out.println("\t\tWelcome to the \n\tSLOT MACHINE SIMULATOOOOORRR");

		//set ups while loop to continue as long as the boolean is true
		while(cont == true)
		{
			//Tells the user to enter amount of money
			System.out.println("How much money are you willing to give me today?... I mean spend.. to win more back..");
			input = scan.nextLine();
			userMoney =  Double.parseDouble(input);
			//Makes the slots go from 1 - 5
			slot = rand.nextInt(5);
			slot2 = rand.nextInt(5);
			slot3 = rand.nextInt(5);
			 
			//These ifs sets the numbers to their fruit correspondant
			if (slot == 0)
			{
				fruit = "Cherry";
			}
			else if(slot == 1)
			{
				fruit = "Oranges";
			}

			else if (slot == 2)
			{
				fruit = "Plums";
			}

			else if (slot == 3)
			{
				fruit = "Bells";
			}

			else if(slot == 4)
			{
				fruit = "Melons";
			}

			else if(slot == 5)
			{
				fruit = "Bars";
			}

			System.out.println(fruit);





			if (slot2 == 0)
			{
				fruit = "Cherry";
			}
			else if(slot2 == 1)
			{
				fruit = "Oranges";
			}

			else if (slot2 == 2)
			{
				fruit = "Plums";
			}

			else if (slot2 == 3)
			{
				fruit = "Bells";
			}

			else if(slot2 == 4)
			{
				fruit = "Melons";
			}

			else if(slot2 == 5)
			{
				fruit = "Bars";
			}

			System.out.println(fruit);




			if (slot3 == 0)
			{
				fruit = "Cherry";
			}
			else if(slot3 == 1)
			{
				fruit = "Oranges";
			}

			else if (slot3 == 2)
			{
				fruit = "Plums";
			}

			else if (slot3 == 3)
			{
				fruit = "Bells";
			}

			else if(slot3 == 4)
			{
				fruit = "Melons";
			}

			else if(slot3 == 5)
			{
				fruit = "Bars";
			}

			System.out.println(fruit);



			//Checks if 2 slots match and multiplies user money by 2
			if (slot == slot2 || slot == slot3 || slot2 == slot3)
			{

				userMoney = userMoney *2;
				System.out.printf("You won $%.2f ", userMoney);
			}
			//Checks if 3 slots match and multiplies user money by 3
			if(slot == slot2 && slot2 == slot3)
			{
				userMoney = userMoney * 3;
				System.out.printf("You won $%.2f ", userMoney);
			}
			
			//checks if no slots match, makes user money equal 0
			if(slot != slot2 && slot2 != slot3  && slot != slot3)
			{

				System.out.println("You lost everything mate... 0 dollars 4 u");
			}


			//Asks user if they want to play again, if not then boolean is set to false
			//making the loop stop
			System.out.println("Would you like to lose money (or in the off chances you won, win) again? Y or N?");
			input = scan.nextLine();
			if (input.equals("Y") || input.equals("y"))
			{
				cont = true;
			}

			else
			{
				cont = false;
			}
		}


	}
}
