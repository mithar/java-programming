package coinGame;
//Dennis Castrooo
import java.util.Random;

public class Coin {
	
	private String sideUp; // to get the name of heads or tails
	private int side; // side determines the side of the coin
	Random rand = new Random(); // making a random that randomly chooses between 1 and 2
	/**
	 * constructor for the coin class
	 * 
	 */
	public Coin() //constructor for the class
	{

		side = rand.nextInt(2);
		if(side == 0)
		{
			sideUp = "Heads";
		}
		
		else{
			sideUp = "Tails";
		}
		System.out.println("The coin is " + sideUp + " At the moment");
	}
	
	/**
	 * 
	 * toss  visualizes the coin being tossed and gives the user the side of the coin
	 */
	public void toss() 
	{
		Random rand = new Random();
		 side = rand.nextInt(2);
		 
		 System.out.println("The coin is being tossed!!");
		 if(side == 0)
		 {
			 sideUp = "Heads";
			 System.out.println("You got " + sideUp );
		 }
		 
		 if(side == 1)
		 {
			 sideUp = "Tails";
			 System.out.println("You got " + sideUp );
		 }
	}
	
	/**
	 * 
	 * @return getSideUp returns the side that the coin is 
	 */
	public String getSideUp()
	{
		return sideUp;
	}
}
