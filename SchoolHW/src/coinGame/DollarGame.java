package coinGame;

public class DollarGame {
	
	public static void main(String args[])
	{
		double nickel = .05; // setting the price of the nickel
		double dime = .10; //setting the price of the dime
		double quarter = .25;//setting the price of the quarter
		double total = 0; //total of the flips
		int count; // the count that counts the number of flips
		
		Coin coin  = new Coin();//Making a coin object from the coin class
		
		System.out.println("\nHello We are going to play dollar game because we only have dollar. Roll\n");
		coin.getSideUp();
		
		
		
		while(total < 1.00) // while the total is below a dollar the game keeps running
		{
			coin.toss();// tossing the coin from the coin class
			
			if(coin.getSideUp() == "Heads") // getting the coin side and seeing if its equal to heads for nickel
			{
				total += nickel; // adding the nickel price to the total
				System.out.println("You gained 5 cents! \n"); // telling the user
			}
			coin.toss(); // tossing the coin again
			if(coin.getSideUp() == "Heads") // checking the side of the coin toss for a dime
			{
				total += dime; // adding dime price to the total
				System.out.println("You gained 10 cents!\n"); // telling the user
			}
			coin.toss(); // tossing another coin - quarter
			if(coin.getSideUp() == "Heads") // checking if the side up is heads
			{
				total += quarter; // Adding quarter price to total
				System.out.println("You gained 25 cents!\n"); // telling user
			}
			
			System.out.println("You have " + total);// Telling the user the total
			
		}
		
		if (total > 1.00)// if the total is over a dollar the user loses
		{
			System.out.println("You silly willy, ya lost!");//telling the user they are a loser
		}
		
		if(total == 1.00)//if the total = 100 the user wins
		{
			System.out.println("OMG YOU WON! LETS BREAK IT DOWN!"); // telling the user they won
		}
		
	}
 
}
