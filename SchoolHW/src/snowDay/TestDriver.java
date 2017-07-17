package snowDay;

import javax.swing.JOptionPane;

public class TestDriver {
	
	public static void main(String [] args)
	
	{
		String temp;
		String rateStr; // annual interest rate in string format
		String startingBalStr; // starting balance in String format
		String numMonthsStr; // number of months since opening in string format
		double rate, startingBal; // interst rate, starting balance in double format
		Integer numMonths; // number of months in integer format
		
		rateStr = JOptionPane.showInputDialog("Enter Annual Interest tate (%):" );
		rate = Double.parseDouble(rateStr);
		
		startingBalStr = JOptionPane.showInputDialog("Enter the Starting Balance:");
		startingBal = Double.parseDouble(startingBalStr);
		
		numMonthsStr = JOptionPane.showInputDialog("How many months since you opened this account?");
		numMonths = Integer.parseInt(numMonthsStr);
		
		SavingsAccount myAccount = new SavingsAccount(rate/100, startingBal); // rate divided by 100 to make it into a decimal
		
		for(int i = 0; i < numMonths; i++)
		{
			temp = JOptionPane.showInputDialog("The amount deposited in month " + (i+1) + "?");
			myAccount.deposit(temp);
			
			temp = JOptionPane.showInputDialog("The amount withdrawn in month " + (i+1) + "?");
			myAccount.withdraw(temp);
			
			myAccount.applyMonthlyInterest();
			
		}
		
		JOptionPane.showMessageDialog(null, String.format("Ending Balance: %.2f", myAccount.getBalance()));
		 
	}

}
