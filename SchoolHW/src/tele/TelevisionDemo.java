package tele;
import java.util.Scanner;  // Needed for the Scanner class

/**
   This class demonstrates the Television class.
*/

public class TelevisionDemo
{
 //  public static void main(String[] args)
   {
      // Create a Scanner object to read from the keyboard
      Scanner keyboard = new Scanner (System.in);

      // Declare variables
      int station;         // The user's channel choice
      String choice;
      String key = "N";
      // Declare and instantiate a television object
      Television bigScreen = new Television("Toshiba", 55);

      // Turn the power on
      bigScreen.Power();

      // Display the state of the television
      System.out.println("A " +
                         bigScreen.getScreen_size() +
                         " inch " +
                         bigScreen.getManufacturer() +
                         " has been turned on.");

      // Prompt the user for input and store into station
      System.out.print("What channel do you want? ");
      station = keyboard.nextInt();

      // Change the channel on the television
      bigScreen.setChannel(station);

      // Increase the volume of the television
      bigScreen.increaseVolume();

      // TASK 4: Display the the current channel and
      // volume of the television
      System.out.println("Channel:" + bigScreen.getChannel() +  "  Volume:" + bigScreen.getVolume());
      System.out.println("Too loud! Lowering the volume.");

      // TASK 4: Decrease the volume of the tv by 6 units here
      for(int i = 0; i <= 5; i++)
      bigScreen.decreaseVolume();
      // TASK 4: Display the the current channel and
      // volume of the television
      System.out.println("Channel:" + bigScreen.getChannel() +   "  Volume:" + bigScreen.getVolume());
      System.out.println();   // For a blank line

      // HERE IS WHERE YOU DO TASK #5	        
      
      
      Television sharp = new Television("Sharp" , 19);
      sharp.Power();
      
      System.out.println("A " +
              sharp.getScreen_size() +
              " inch " +
              sharp.getManufacturer() +
              " has been turned on.");
      
      System.out.print("What channel do you want? ");
      station = keyboard.nextInt();

      // Change the channel on the television
      sharp.setChannel(station);
      
      System.out.println("Would you like the volume to be Louder(L), Softer(S), or Neither(N)");
      choice = keyboard.nextLine();
      choice = keyboard.nextLine();
      

      while(!(choice.equals(key))){
      if(choice.equals("L") || choice.equals("l"))
      {
    	  System.out.println("Increasing the volume");
    	  for(int i=0; i <3; i++){//makes it so that the volume increases twice
    	  sharp.increaseVolume();
    	  }
    	  
      }
      else if(choice.equals("S") || choice.equals("s"))
      {		
    	  System.out.println("Decreasing the volume");
    	  for(int i=0; i <3; i++)//makes it so that the volume decreases twice
    	  sharp.decreaseVolume();
      }
      
      System.out.println("Channel:" + sharp.getChannel() + "  Volume:" + sharp.getVolume());
      System.out.println("Would you like the volume to be Louder(L), Softer(S), or Neither(N)");
      choice = keyboard.nextLine();
    
      }
     
      
      System.out.println("Just right!");
      System.out.println("Final settings: Channel:" + sharp.getChannel() + "  Volume:" + sharp.getVolume());
      
      

   }
}