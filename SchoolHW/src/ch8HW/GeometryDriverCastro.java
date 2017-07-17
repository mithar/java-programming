package ch8HW;

import java.util.Scanner;

public class GeometryDriverCastro {
	public static void main(String args[])
	{
		int choice;
		int var1 = 0;
		int var2 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("What area do you want to find out?\n1.Circle\n2.Rectangle\n3.Triangle\n4.quit");
		
		choice = scan.nextInt();
		GeometryCastro shape = new GeometryCastro();;
		
		do{
		if(choice == (1))
		{
			System.out.println("Whats the radius");
			var1 = scan.nextInt();
			System.out.println("The area of the Circle is :" + shape.areaOfCircle(var1));
		}
		else if(choice == (2))
				{
			System.out.println("What is the Length");
			System.out.println("what is the Width");
			var1 = scan.nextInt();
			var2 = scan.nextInt();
			shape.areaOfRectangle(var1, var2);
			System.out.println("The area of the Rectangle is :" + shape.areaOfRectangle(var1, var2));
						
				}
		else if(choice == (3))
		{
			System.out.println("What is the Base");
			System.out.println("what is the Height");
			var1 = scan.nextInt();
			var2 = scan.nextInt();
			shape.areaOfTriangle(var1, var2);
			System.out.println("The area of the Triangle is :" + shape.areaOfTriangle(var1, var2));
		}
		
		else{
			System.out.println("Program Quit");
		}
		
		choice = scan.nextInt();
		}
		while(choice != 4);
		
		

	}
}
