public class StockComissionCalculator {
	//Dennis Castro 2/1/17
	public static void main (String [] args)
	{
		
		int shares = 600; // integer stores amount of shares
		double price = 21.77; // double stores the price of the shares
		double comission = .02; // comission stores the percentage of the comission
		double stockTotal; // store the stock total calculation
		double comissionTotal; // store the comission total calculations
		double total; // store the total
		
		//calculating the total amount needed to pay for the stocks 
		stockTotal = shares * price;
		//calculating the stock price amount times the comission percentage to get the comission costs
		comissionTotal = stockTotal * comission;
		//adding the comission costs with the stock costs for the total amount
		total = stockTotal + comissionTotal;
		
		//printing out all the calculations
		System.out.println("The amount paid for stock alone = $" + stockTotal);
		System.out.println("The ammount paid for comission is $" + comissionTotal);
		System.out.println("The total amount is $" + total);
		
	}

}
