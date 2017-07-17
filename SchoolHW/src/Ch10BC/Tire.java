package Ch10BC;

public class Tire implements Taxable{

	private boolean used;
	public Tire(boolean u)
	{

		used = u;
	}
	@Override
	public double calculateTax() {
		double tax = 0;
		if (used == false)
		{
			tax = 1;
		}
		else
		{
			tax = 0;
		}
	
		return tax;
	}

	@Override
	public String getReceiptItem() {
		String receipt;
		if(used == true)
		{
			receipt = "Used Tire:";
		}
		else
		{
			receipt = "New Tire:";
		}
		return receipt;
	}

	public boolean isUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}

}
