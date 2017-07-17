package snowDay;

public class SavingsAccount {
	
	private double mIntRate; //The annual interest rate
	private double mBalance; //The balance of the account
	
	/**
	 * Default Constructor sets the interest rate and balance to zero
	 */
	public SavingsAccount()
	{
		mIntRate = 0.0;
		mBalance = 0.0;
		
	}
	
	/**
	 * Constructor
	 * @param r the annual interest rate for the account
	 * @param b the starting balance for the account
	 */
	
	public SavingsAccount(double r, double b )
	{
		mIntRate = r;
		mBalance = b;
		
	}
	
	/**
	 * The setBalance method sets the balance
	 * @param bal the balance for the account
	 */
	public void setBalance(double b)
	{
		mBalance = b;
	}
	
	/**
	 * The getInterest method returns the interest rate
	 * @param rate The annual interest rate for the account
	 */
	public void setInterestRate(double r)
	{
		mIntRate = r;
	}
	/**
	 * The getInterst method returns the interest rate.
	 * @return The annual interest rate for the account
	 */
	public double getInterestRate()
	{
		return mIntRate;
	}
	/**
	 * the getBalance method returns the interest rate
	 * @return the Account balance
	 */
	
	public double getBalance()
	{
		return mBalance;
	}
	
	public void withdraw(String w)
	{
		mBalance = mBalance - Double.parseDouble(w);
	}
	
	public void deposit(String d)
	{
		mBalance += Double.parseDouble(d);
	}
	
	public void applyMonthlyInterest()
	{
		double monthlyInt = mBalance * (mIntRate/12.0);
		mBalance = mBalance + monthlyInt;
	}

}
