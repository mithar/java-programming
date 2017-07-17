import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.Math;
public class UserIOPractice {

	public static void main(String[] args) {
		

		
		String firstName; // string to store first name
		String lastName; // string to store last name
		String fullName; // storing both full name and last
		String cityOfBirth; // store city of birth
		String stateOfBirth; //store state of birth
		String birthInfo; //store birth info
		char firstInitial; // store first Initial of first Name
		int age; // integer to store age
		double diameter; // double to store diameter
		double volume; // double to store volume
		double radius; // double to store radius
		
		/*
		 * Here we are asking the user for their first and last name, and then 
		 * concactinating them. Then we are showing the user
		 */
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter your first name:");
		firstName = scan.nextLine();
		System.out.print("Enter your last name:");
		lastName = scan.nextLine();
		System.out.print("Enter your age:");
		age = scan.nextInt();
		
		fullName = firstName + " " + lastName;
		
		System.out.println("The user information is below.\n\tFull Name:" + fullName + "\n\tAge:" + age );
		
		
		/*
		 * Here we are using an input log to ask for the users city of birth
		 * and state of birth, then showing it on a message dialog
		 */
		
		cityOfBirth = JOptionPane.showInputDialog("Enter your city of birth ");
		stateOfBirth = JOptionPane.showInputDialog("Enter your state of birth ");
		
		birthInfo = cityOfBirth + "," + stateOfBirth;
		
		JOptionPane.showMessageDialog(null, birthInfo);
		
		/*
		 * Here we are taking the users first name and making it upper case and counting the 
		 * amount of characters in the name
		 */
		
		firstInitial  = firstName.charAt(0);
		
		JOptionPane.showMessageDialog(null, firstInitial);
		
		fullName = fullName.toUpperCase();
		System.out.println(fullName + "\n has " + fullName.length() + " Characters" );
		
		/*
		 * Here we are asking the user to enter a diameter and then solving the volume of a sphere
		 */
		//Scanner scan2 = new Scanner(System.in);
		
		System.out.println("Enter the diameter of a sphere:");
		diameter = scan.nextDouble();
		radius = diameter /2.0;
		volume = ((4.0 / 3.0) * Math.PI * Math.pow(radius,3.0)); // this is the formula for the volume of a sphere
		
		System.out.println("The volume is:" + volume );
		
		scan.close();
	}

}
