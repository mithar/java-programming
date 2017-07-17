package lab10;

import java.text.DecimalFormat;

public class ProductionWorker extends Employee{
	
	private int shift;
	private double payRate;
	
	public static final int DAY_SHIFT = 1;
	public static final int NIGHT_SHIFT = 0;
	
	//non default constructor
	public ProductionWorker(String n, String num, String date, int sh, double rate)
	{
		super(n, num, date);
		shift = sh;
		payRate = rate;
	}
	//default constructor
	public ProductionWorker()
	{
		super();
		shift = 0;
		payRate = 0.0;
	}
	
	public void setShift(int s)
	{
		shift = s;
	}
	
	public void setPayRate(double p)
	{
		payRate = p;
	}
	
	public int getShift()
	{
		return shift;
	}
	
	public double getPayRate()
	{
		return payRate;
	}
	
	@Override
	public String toString()
	{
		String str = super.toString();
		
		str += "\nShift:";
		
		if(shift == DAY_SHIFT)
		{
			str += "day";
		}
		
		else if(shift == NIGHT_SHIFT)
		{
			str += "night";
		}
		
		else{
			str+="INVALID SHIFT NUMBOURS";
		}
		
		return str = ("\n Hourly Pay Rate = " + String.format(null, payRate));
	}
	
	
}