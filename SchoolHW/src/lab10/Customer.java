package lab10;

public class Customer {
	
	private String firstName;
	private String lastName;
	private int customerID;
	private double totalPurchases; // tracks the overall amount spent by the customer
	private static int  NUM_CUSTOMERS;
	
	public Customer(String fn, String ln, int id, double tp, int nc)
	{
		firstName = fn;
		lastName = ln;
		customerID = id;
		totalPurchases = tp;
		NUM_CUSTOMERS = nc;
		
	}
	public Customer(String fn, String ln)
	{
		firstName = fn;
		lastName = ln;
	}
	
	public Customer()
	{
		firstName = "";
		lastName = "";
		customerID = 0;
		totalPurchases = 0.0;
		NUM_CUSTOMERS = 0;
	}
	
	public double purchase(double amount)
	{
		amount += totalPurchases;
		return amount;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getCustomerID() {
		return customerID;
	}
	public double getTotalPurchases() {
		return totalPurchases;
	}
	public void setTotalPurchases(double totalPurchases) {
		this.totalPurchases = totalPurchases;
	}
	public static int getNUM_CUSTOMERS() {
		return NUM_CUSTOMERS;
	}
	public static void setNUM_CUSTOMERS(int nUM_CUSTOMERS) {
		NUM_CUSTOMERS = nUM_CUSTOMERS;
	}
	
	
	
	
	

}
