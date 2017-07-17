package Ch10BC;

public class CarFuel implements Taxable{
	
	private final double MOTOR_GAS = 0.582;
	private final double DIESEL_GAS = 0.582;
	private final double HYDROGEN = 0.747;
	private int gallons;
	private FuelType type;
	public CarFuel(int g,FuelType t)
	{
		gallons = g;
		this.type = t;
	}

	@Override
	public double calculateTax() {
		double tax = 0;
		if(type == FuelType.MOTOR_GAS)
		{
			tax = gallons * MOTOR_GAS;
		}
		
		else if(type == FuelType.DIESEL_GAS)
		{
			tax = gallons * DIESEL_GAS;
		}
		else if(type == FuelType.HYDROGEN)
		{
			tax = gallons * HYDROGEN;
		}
		
		return tax;
	}

	@Override
	public String getReceiptItem() {
		// TODO Auto-generated method stub
		return gallons + " gallons of "+ type +" fuel: " + calculateTax();
				
	}
}
