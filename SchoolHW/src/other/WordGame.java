import java.util.Scanner;
//Dennis Castro 2/1/17
public class WordGame {

	public static void main(String[] args) {
		
		//Initializing all the strings necessary for the word game
		String name;
		String age;
		String city;
		String college;
		String profession;
		String animal;
		String petName;
		
		//setting up the scanner to get input from the user 
		Scanner scan = new Scanner (System.in); 
		
		//Telling the user to enter each individual String for the game
		System.out.println("Please enter a name");
		name = scan.nextLine();
		System.out.println("Please enter a age");
		age = scan.nextLine();
		System.out.println("Please enter a city");
		city = scan.nextLine();
		System.out.println("Please enter a college");
		college = scan.nextLine();
		System.out.println("Please enter a profession");
		profession = scan.nextLine();
		System.out.println("Please enter an animal");
		animal = scan.nextLine();
		System.out.println("Please enter a pet name");
		petName = scan.nextLine();
		
		//Outputting the users Strings into a story 
		System.out.println("There once was a person named " + name + " who lived in " + city + ".");
		System.out.println("At the age of " + age + " , " + name + " went to college at " + college + ".");
		System.out.println( name + "graduated and went to work as a " + profession + ".");
		System.out.println("Then, " + name + " adopted a(n) " + animal + " named " + petName);
		System.out.println("They both lived happily ever after!");
	}

}
