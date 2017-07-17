import java.util.Scanner;

public class CrazyDictionaryDennis {

	public static void main(String[] args) {
		
		//initializing the strings for word comparison
		String word1;
		String word2;
		String word3;
		String order1;
		String order2;
		String order3;
		
		
		Scanner scan = new Scanner(System.in); //makes the scanner
		
		//gets the users input of all the words
		System.out.print("Enter the first word:");
		word1 = scan.nextLine();
		System.out.print("Enter the second word:");
		word2 = scan.nextLine();
		System.out.print("Enter third word:");
		word3 = scan.nextLine();
		
		System.out.println("Order in the oxford Dictionary");
		
		if(word1.compareToIgnoreCase(word2) <= 0 && word1.compareToIgnoreCase(word3) <= 0 )
		{
			order1 = word1; // word one will come first
			if(word2.compareToIgnoreCase(word3) <= 0)
			{
				order2 = word2;
				order3 = word3;
			}
			
			else
			{
				order2 = word3;
				order3 = word2;
			}
			
		}
		
		else if(word1.compareToIgnoreCase(word2) >= 2 && word1.compareToIgnoreCase(word3) >= 0)// word one will come last
		{
			order3 = word1;
			if(word2.compareToIgnoreCase(word3) >= 0)
			{
				order1 = word3;
				order2 = word2;
			}
			else{
				order1 = word1;
				order2 = word3;
			}
		}
			
			else
			{
				order2 = word1; // word 1 will be the second word
				if (word2.compareToIgnoreCase(word3) >= 0) //word 3 comes before word 2
				{
					order1 = word3; 
					order3 = word2;
				}
				else //word 2 comes before word 3
				{
					order1 = word2;
					order3 = word3;
				}
			}
			//prints out the oxford dictionary format
			System.out.println("\t" + order1);
			System.out.println("\t" + order2);
			System.out.println("\t" + order3);
			
			System.out.println("Order in the Crazy Unicode Dictionary:");
			
			if (word1.compareTo(word2) <= 0 && word1.compareTo(word3) <= 0) //compares the first word to the others
			{
				order1 = word1;//word 1 will be the first
				if (word2.compareTo(word3) <= 0)//word 2 comes before word 1
				{
					order2 = word2;
					order3 = word3;
				}
				else
				{
					//word 3 comes before the others
					order2 = word3;
					order3 = word2;
				}
			}
			else if (word1.compareTo(word2) >= 0 && word1.compareTo(word3) >= 0)//compares first word to other 2 words
			{
				order3 = word1;//makes word 1 the last output
				if (word2.compareTo(word3) >= 0)//word 3 comes before word 1
				{
					order1 = word3;
					order2 = word2;
				}
				else//word 2 comes before word 3
				{
					order1 = word2;
					order2 = word3;
				}
			}
			else
			{
				order2 = word1;//word one will be the second to last
				if (word2.compareTo(word3) >= 0)// word 3 comes before word 2
				{
					order1 = word3;
					order3 = word2;
				}
				else//word 2 comes before word 3
				{
					order1 = word2;
					order3 = word3;
				}
			}
			//print out the unicode order format
			System.out.println("\t" + order1);
			System.out.println("\t" + order2);
			System.out.println("\t" + order3);
			
			scan.close(); //closes scanner
	}
}
		
	




