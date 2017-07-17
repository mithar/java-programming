package ch8HW;

public class GeometryCastro {
	
	
	
	public double areaOfCircle(int r)
	{
		double area = 0;
				
				if(r < 0)
				{
					System.out.println("Error m8 cannot be negative");	
				}
				else{
					area = (int) (Math.PI * r);
					System.out.println(area);
				}
		return area;	
	}

	public double areaOfRectangle(double l, double w)
	{
		double area = 0;
		
		if(l < 0 || w <0)
		{
			System.out.println("Error lol theres a negative numb(by linkin park)");
		}
		else{
			area = l * w;
			System.out.println(area);
		}
		
		return area;
	}
	
	public double areaOfTriangle(int b, int h)
	{
		double area = 0;
		
		if( b < 0 || h < 0)
		{
			System.out.println("Error Cannot Calculate a negative numbour");
		}
		else{
		area = b * h * 0.5;
		System.out.println(area);
		}
		return area;
	}
	
}
