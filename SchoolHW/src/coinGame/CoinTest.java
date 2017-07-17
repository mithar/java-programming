package coinGame;
//Dennis Castrooo babbbbyyyyy
public class CoinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int heads = 0; // setting heads to 0 for the count
		int tails = 0; // setting tails to 0 for the count
		Coin coin = new Coin(); // making the coin object from the coin class 
		coin.getSideUp(); // getting the side of the coin
		coin.toss(); // getting the toss instance and tossing the coin
		
		for(int i = 0; i <= 19; i++)//running the program 20 times so that we get 10 flips
		{
			coin.toss();
			
			if(coin.getSideUp() == "Heads") //if heads is flipped
			{
				heads += 1;
			}
			
			if(coin.getSideUp() == "Tails")//if tails is flipped
			{
				tails += 1;
			}
			
		}
		
		System.out.println("You tossed:" + heads + " Heads and " + tails + " Tails"); // giving the results of the heads and tails
		
		
	}
	
}
