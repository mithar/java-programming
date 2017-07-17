package Ch10BC;

public class CigarettePack implements Taxable{

	private int cigarette;
	
	public CigarettePack(int c)
	{
		cigarette = c;
	}
	
	@Override
	public double calculateTax() {
		double cigTax = 0.13;
		cigTax *= cigarette;
		return cigTax;
	}

	@Override
	public String getReceiptItem() {
		// TODO Auto-generated method stub
		
		return "Pack of " + getCigarette() + " Cigarettes: ";
	}

	public int getCigarette() {
		return cigarette;
	}

	public void setCigarette(int cigarette) {
		this.cigarette = cigarette;
	}

}
