package lab10;

public class GoldCustomer extends SilverCustomer{
	
	public GoldCustomer()
	{
		super();
		
	}
	
	public GoldCustomer(String fn, String ln, int id, double num,double ssd )
	{
		super(fn, ln, id, num,id, ssd);
	}
	
	public GoldCustomer(String fn, String ln)
	{
		super(fn, ln);
	}
	@Override
	public double purchase(double amount)
	{
		super.purchase(amount);
		if(super.getTotalPurchases() > 1000)
		{
			System.out.println("You get a free gift eruuuu");
		}
		return amount;
	}
	

}
