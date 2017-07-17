package lab10;

public class SilverCustomer extends Customer{
	
	private double spentSinceDiscount;
	
	public SilverCustomer(String fn, String ln, int id,double tp, int nc, double ssd)
	{
		super(fn, ln, id,tp, nc);
		spentSinceDiscount = ssd;
	}
	public SilverCustomer(String fn, String ln)
	{
		super(fn, ln);
	}
	
	public SilverCustomer()
	{
		super();
		spentSinceDiscount = 0;
	}
	
	
	@Override
	public double purchase(double amount)
	{
		
		amount += spentSinceDiscount;
		if(super.getTotalPurchases() > 200.00)
		{
			amount = super.getTotalPurchases() * .25;
			spentSinceDiscount = 0;
		}
		
		getSpentSinceDiscount();
		super.getTotalPurchases();
		
		return amount;
	}
	public double getSpentSinceDiscount()
	{
		return spentSinceDiscount;
	}
}
