package Ch10BC;

import java.util.ArrayList;

public class TaxCalculator {
	
	public static void main(String [] args)
	{
		//CigarettePack pack = new CigarettePack(20);
		//ArrayList <String> list = new ArrayList<String>();
		ArrayList<Taxable> list = new ArrayList<Taxable>();
		list.add(new CigarettePack(20));
		list.add(new Tire(true));
		list.add(new Tire(true));
		list.add(new Tire(false));
		list.add(new Tire(false));
		list.add(new CarFuel(15,FuelType.DIESEL_GAS));
		
		for(int i = 0; i < list.size(); i++)
		{
			System.out.printf("%s %.3f\n", list.get(i).getReceiptItem(), list.get(i).calculateTax());
			
			//System.out.printf("\nTotal Tax: %.3f", list.get(i).calculateTax());
		}
		//System.out.printf("%.3f", "\nTotal Tax", list.addAll(((Taxable) list).calculateTax()));
	}

}
