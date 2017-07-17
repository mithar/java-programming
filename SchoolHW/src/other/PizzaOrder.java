import java.util.Scanner;  // Needed for the Scanner class

/**
   This program allows the user to order a pizza.
*/

public class PizzaOrder
{
  // public static void main (String[] args)
   {
      // Create a Scanner object to read input.
      Scanner keyboard = new Scanner (System.in);

      String firstName;             // User's first name
      boolean discount = false;     // Flag for discount
      int inches;                   // Size of the pizza
      char crustType ;               // For type of crust
      String crust = "Hand-tossed"; // Name of crust
      double cost = 12.99;          // Cost of the pizza
      final double TAX_RATE = .06;  // Sales tax rate
      double tax;                   // Amount of tax
      char choice;                  // User's choice
      String input;                 // User input
      String toppings = "Cheese ";  // List of toppings
      int numberOfToppings = 0;     // Number of toppings

      // Prompt user and get first name.
      System.out.println("Welcome to Mike and " +
                         "Diane's Pizza");
      System.out.print("Enter your first name: ");
      firstName = keyboard.nextLine();

      // Determine if user is eligible for discount by
      // having the same first name as one of the owners.
      // ADD LINES HERE FOR TASK #1
      
      if (firstName.equals("Mike") || firstName.equals("mike"))
      {
    	  discount = true;
    	  //System.out.println("discount!");
      }
      
      if (firstName.equals("Diane") || firstName.equals("diane"))
      {
    	  discount = true;
      }
      
      
     
      
      

      // Prompt user and get pizza size choice.
      System.out.println("\nPizza Size (inches)   Cost");
      System.out.println("        10            $10.99");
      System.out.println("        12            $12.99");
      System.out.println("        14            $14.99");
      System.out.println("        16            $16.99");
      System.out.println("What size pizza " +
                         "would you like?");
      System.out.print("10, 12, 14, or 16 " +
                       "(enter the number only): ");
      inches = keyboard.nextInt();

      // Set price and size of pizza ordered.
      // ADD LINES HERE FOR TASK #2
      
      if (inches == 10)
      {
    	  cost = 10.99;
      }
      
      else if(inches == 12)
      {
    	  cost = 12.99;
      }
      
      else if(inches == 14)
      {
    	  cost = 14.99;
      }

      else if(inches == 16)
      {
    	  cost = 16.99;
      }
      
      else
    	  cost = 12.99;
   
	 
      //Consume the remaining newline character.  
      keyboard.nextLine();  //Task 8 refers to this line of code.


      // Prompt user and get crust choice.
      System.out.println("\nWhat type of crust " +
                         "do you want? ");
      System.out.print("(H)Hand-tossed, " +
                       "(T) Thin-crust, or " +
                       "(D) Deep-dish " +
                       "(enter H, T, or D): ");
      input = keyboard.nextLine();
	 // ADD LINES HERE FOR TASK #2B
     
     crustType = input.charAt(0);
      

      // Prompt user and get topping choices one at a time.
      System.out.println("\nAll pizzas come with cheese.");
      System.out.println("Additional toppings are " +
                         "$1.25 each, choose from:");
      System.out.println("Pepperoni, Sausage, " +
                         "Onion, Mushroom");

      // Set user's crust choice on pizza ordered.
      // ADD LINES FOR TASK #3
      
      switch(crustType)
      {
      
      case 'H':
    	  crust = "Hand Tossed";
    	  break;
    	  
      case 'h':
    	  crust = "Hand Tossed";
    	  break;
    	  
      case 'T':
      crust = "Thin-Crust";
      break;
      
      case 't':
          crust = "Thin-Crust";
          break;
      
      case 'D':
    	  
    	  crust = "Deep Dish";
    	  break;
    	  
      case 'd':
        	  
          crust = "Deep Dish";
          break;
    	  
      default:
    	crust = "Hand-tossed";
      }
     
      
		
      // If topping is desired,
      // add to topping list and number of toppings
 	 // TASK #4: Add code for each toppings question below
      System.out.print("Do you want Pepperoni? (Y/N): ");
      input = keyboard.nextLine();
      if(input.equals("Y") || input.equals("y"))
      {
    	  toppings += "pepporoni ";
    	  numberOfToppings += 1;
      }
	 System.out.print("Do you want Sausage? (Y/N): ");
      input = keyboard.nextLine();
      if(input.equals("Y") || input.equals("y"))
      {
    	  toppings += "Sausage ";
    	  numberOfToppings += 1;
      }
      
	 System.out.print("Do you want Onion? (Y/N): ");
      input = keyboard.nextLine();
      if(input.equals("Y") || input.equals("y"))
      {
    	  toppings += "Onion ";
    	  numberOfToppings += 1;
      }
      System.out.print("Do you want Mushroom? (Y/N): ");
      input = keyboard.nextLine();
      if(input.equals("Y") || input.equals("y"))
      {
    	  toppings += "Mushroom ";
    	  numberOfToppings += 1;
      }

      // Add additional toppings cost to cost of pizza.
      // INSERT CODE FOR TASK #5 HERE
      
      cost += 1.25 * numberOfToppings;

      // Display order confirmation.
      System.out.println();
      System.out.println("Your order is as follows: ");
      System.out.println("\t"+inches + " inch pizza");
      System.out.println("\t"+crust + " crust");
      System.out.println("\t"+toppings);

      // Apply discount if user is eligible.
      // ADD LINES FOR TASK #6 HERE
      
      if(discount != false)
      {  
    	  System.out.println("You get a $2.00 Discount!");
    	  cost -= 2.00;
      }
      
      else
      {
    	  System.out.println("No discount");
      }

      // EDIT PROGRAM FOR TASK #7
      // SO ALL MONEY OUTPUT APPEARS WITH 2 DECIMAL PLACES
      System.out.printf("The cost of your order " +
                        "is: $%.2f \n" , cost);

      // Calculate and display tax and total cost.
      tax = cost * TAX_RATE;
      System.out.printf("The tax is: $%.2f \n", tax);
      System.out.printf("The total due is: $%.2f" ,
                        (tax + cost));

      System.out.print("\nYour order will be ready " +
                         "for pickup in 30 minutes.");

	 keyboard.close();
   }
}