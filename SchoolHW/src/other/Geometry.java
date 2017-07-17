import java.util.Scanner;

/**
   This program demonstrates static methods
*/

public class Geometry
{
	
   public static void main(String[] args)
   {
      int choice;       // The user's choice
      double value = 0; // The method's return value
      char letter;      // The user's Y or N decision
      double radius;    // The radius of the circle
      double length;    // The length of the rectangle
      double width;     // The width of the rectangle
      double height;    // The height of the triangle
      double base;      // The base of the triangle
      double side1;     // The first side of the triangle
      double side2;     // The second side of the triangle
      double side3;     // The third side of the triangle

      // Create a scanner object to read from the keyboard
      Scanner keyboard = new Scanner(System.in);

      // The do loop allows the menu to be displayed first
      do
      {
         // TASK #1 Call the printMenu method
    	  
    	  printMenu();
         choice = keyboard.nextInt();

         switch(choice)
         {
            case 1:
               System.out.print("Enter the radius of the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the calcCircleGeometry method and
               // find the area of a circle. Store the result in 
               // the value variable
               value = calcCircleGeometry(radius, true);

               System.out.println("The area of the circle is " + value);
               break;
               
            case 2:
               System.out.print("Enter the length of the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the calcRectGeometry method and
               // calculate area. Store the result in the value variable
               
               value = calcRectGeometry(length, width,true);
               System.out.println("The area of the rectangle is " + value);
               break;
               
            case 3:
            	
               System.out.print("Enter the height of the triangle: ");
               height = keyboard.nextDouble();
               System.out.print("Enter the base of the triangle: ");
               base = keyboard.nextDouble();

               // TASK #3 Call the calcTriangleArea method and
               // store the result in the value variable
               value = calcTriangleArea(base, height);
               System.out.println("The area of the triangle is " + value);
               break;
          
            case 4:
               System.out.print("Enter the radius of the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the calcCircleGeometry method and
               // find the circumference.  Store the result in 
               // the value variable
               value = calcCircleGeometry(radius, false);
               System.out.println("The circumference of the circle is " +
                                  value);
               break;
               
            case 5:
               System.out.print("Enter the length of the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the calcRectGeometry method and
               // calculate perimeter. Store the result in the 
               // value variable
               value = calcRectGeometry(length, width, false);
               System.out.println("The perimeter of the rectangle is " +
                                  value);
               break;
               
            case 6:
               System.out.print("Enter the length of side 1: ");
               side1 = keyboard.nextDouble();
               System.out.print("Enter the length of side 2: ");
               side2 = keyboard.nextDouble();
               System.out.print("Enter the length of side 3: ");
               side3 = keyboard.nextDouble();

               // TASK #3 Call the calcTrianglePerimeter method and
               // store the result in the value variable
               value = calcTrianglePerimeter(side1, side2, side3);
               System.out.println("The perimeter of the triangle is " +
                                  value);
               break;
               
            default:
               System.out.println("You did not enter a valid choice.");
         }
         keyboard.nextLine(); // Consume the new line

         System.out.print("Do you want to exit the program (Y/N)?: ");
         String answer = keyboard.nextLine();
         letter = answer.charAt(0);
      } while(letter != 'Y' && letter != 'y');
      keyboard.close();
   }
   
   

   // TASK #1 Create the printMenu method here

   // TASK #2 Create the value-returning methods here
   /*
    * the calcCircleGeometry method calculates the area or circumference of a circle
    * @param rad gets the radius
    * @param wantsArea gets the boolean to decide the area or cicumference
    * @return area returns the area of the circle
    * @return circumference returns the circumference of the circle
    */
   
   public static double calcCircleGeometry(double rad, boolean wantsArea)
   {
	   double area;
	   double circumference;
	   area = (rad * rad)  * Math.PI; // area of a circle
	   circumference = 2 * Math.PI * rad; // circumference of a circle
	   
	   if(wantsArea == true)
	   {
		   
		   return area;
	   }
	   else
	   {
		   
		   return circumference;
	   }
   }
   

/*
 * calcRectGeometry calculates the Area or Perimeter of a rectangle
 * @param length gets the length of the rectangle
 * @param width gets the width of the rectangle
 * @return area returns the area
 * @return perimeter returnes the perimeter
 */
   public static double calcRectGeometry (double length, double width, boolean wantsArea)
   {
	   double area;
	   double perimeter;
	   if(wantsArea == true)
	   {
		   area = length * width;
		   return area;
	   }
	   else
	   {
		   perimeter = (2 * length) + (2 * width);
		   return perimeter;
	   }
   }
	 
   /*
    * calcTriangleArea calculates the area of a triangle
    * @param base gets the base of the triangle
    * @param height gets the height of the triangle
    * @return area returns the area of the triangle
    */
   public static double calcTriangleArea(double base, double height)
   {
	   double area;
	   area = (.5 * base) * height;
	   return area;
   }
   
   /*
    * calcTrianglePerimeter calculates the perimeter of a triangle
    * @param side1 gets the first side of the triangle
    * @param side2 gets the second side of the triangle
    * @param side3 gets the third side of the triangle
    * @return perimeter returns the perimeter of the triangle
    */
 
   public static double calcTrianglePerimeter(double side1, double side2, double side3)
   {
	   double perimeter;
	   perimeter = side1 + side2 + side3;
	   return perimeter;
   }
   
   public static void printMenu()
   {
	   System.out.println("***********************************");
	   System.out.println("This is a geometry calculator");
	   System.out.println("Choose what you would like to calculate.");
	   System.out.println("1. Find the area of a circle");
	   System.out.println("2. Find the area of a rectangle");
	   System.out.println("3. Find the area of a triangle");
	   System.out.println("4. Find the circumference of a circle");
	   System.out.println("5. Find the perimeter of a rectangle");
	   System.out.println("6. Find the perimeter of a triangle");
	   System.out.println("Enter the number of your choice");
   }


}