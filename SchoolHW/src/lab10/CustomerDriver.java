package lab10;
public class CustomerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer = new Customer("Jane", "Plain");
		SilverCustomer sCustomer = new SilverCustomer("Nate", "Silver");
		GoldCustomer gCustomer = new GoldCustomer("Goldie", "Locks");
		
		System.out.println("Spending Spree for " + customer.getFirstName() + " " +  customer.getLastName());
		customer.purchase(150.00);
		System.out.println("\tTried to Spend $150. Total Purchases now: " + customer.getTotalPurchases());		
		customer.purchase(250.00);
		System.out.println("\tTried to Spend $250. Total Purchases now: " + customer.getTotalPurchases());
		customer.purchase(150.00);
		System.out.println("\tTried to Spend $150. Total Purchases now: " + customer.getTotalPurchases());
		customer.purchase(100.00);
		System.out.println("\tTried to Spend $100. Total Purchases now: " + customer.getTotalPurchases());
		customer.purchase(1000.00);
		System.out.println("\tTried to Spend $1000. Total Purchases now: " + customer.getTotalPurchases());	
		customer.purchase(900.00);
		System.out.println("\tTried to Spend $900. Total Purchases now: " + customer.getTotalPurchases());	
		System.out.println("Summary Post Spree:\n" + customer);
		System.out.println("*******************************************************");	

		System.out.println("Spending Spree for " + sCustomer.getFirstName() + " " +  sCustomer.getLastName());
		sCustomer.purchase(150.00);
		System.out.println("\tTried to Spend $150. Total Purchases now: " + sCustomer.getTotalPurchases());		
		sCustomer.purchase(250.00);
		System.out.println("\tTried to Spend $250. Total Purchases now: " + sCustomer.getTotalPurchases());
		sCustomer.purchase(150.00);
		System.out.println("\tTried to Spend $150. Total Purchases now: " + sCustomer.getTotalPurchases());
		sCustomer.purchase(100.00);
		System.out.println("\tTried to Spend $100. Total Purchases now: " + sCustomer.getTotalPurchases());
		sCustomer.purchase(1000.00);
		System.out.println("\tTried to Spend $1000. Total Purchases now: " + sCustomer.getTotalPurchases());	
		sCustomer.purchase(900.00);
		System.out.println("\tTried to Spend $900. Total Purchases now: " + sCustomer.getTotalPurchases());	
		System.out.println("Summary Post Spree:\n" + sCustomer);
		System.out.println("*******************************************************");	
		
		System.out.println("Spending Spree for " + gCustomer.getFirstName() + " " +  gCustomer.getLastName());
		gCustomer.purchase(150.00);
		System.out.println("\tTried to Spend $150. Total Purchases now: " + gCustomer.getTotalPurchases());		
		gCustomer.purchase(250.00);
		System.out.println("\tTried to Spend $250. Total Purchases now: " + gCustomer.getTotalPurchases());
		gCustomer.purchase(150.00);
		System.out.println("\tTried to Spend $150. Total Purchases now: " + gCustomer.getTotalPurchases());
		gCustomer.purchase(100.00);
		System.out.println("\tTried to Spend $100. Total Purchases now: " + gCustomer.getTotalPurchases());
		gCustomer.purchase(1000.00);
		System.out.println("\tTried to Spend $1000. Total Purchases now: " + gCustomer.getTotalPurchases());	
		gCustomer.purchase(900.00);
		System.out.println("\tTried to Spend $900. Total Purchases now: " + gCustomer.getTotalPurchases());	
		System.out.println("Summary Post Spree:\n" + gCustomer);
		System.out.println("*******************************************************");
	}

}
