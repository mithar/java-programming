/**
   This program demonstrates a solution to 
   the Employee and ProductionWorker Classes 
   programming challenge.
*/

package lab10;
public class WorkerDemo
{
   public static void main(String[] args)
   {
      // Create a ProductionWorker object and pass the initialization
      // data to the constructor.
      ProductionWorker pw =
           new ProductionWorker("John Smith", "123-A", "11-15-2005",
                                ProductionWorker.DAY_SHIFT, 16.50);
      
      // Display the data.
      System.out.println("Here's the first production worker.");
      System.out.println(pw);
      
      // Create another ProductionWorker object and use the
      // set methods.
      ProductionWorker pw2 = new ProductionWorker();
      pw2.setName("Joan Jones");
      pw2.setEmployeeNumber("222-L");
      pw2.setHireDate("12-12-2005");
      pw2.setShift(ProductionWorker.NIGHT_SHIFT);
      pw2.setPayRate(18.50);
      
      // Display the data.
      System.out.println("\nHere's the second production worker.");
      System.out.println(pw2);
      System.out.println();
        
      /*TASK 4:  Use the NON-DEFAULT constructor to create a TeamLeader t whose information is below.  Then display the contents of t. 
            Here's the first team leader.
			Name: Janet Jackison
			Employee Number: 456-B
			Hire Date: 01-17-2015
			Shift: Day
			Hourly Pay Rate: $21.50
			Monthly Bonus: $500.00
			Required Training Hours: 5.0
			Training Hours Attended: 2.5
       */
      
      TeamLeader pw3 = new TeamLeader("Janet Jackson", "456-B", " 01-17-2015", ProductionWorker.DAY_SHIFT, 21.50, 500, 5.0, 2.5);
      System.out.println(pw3);
      
      
      /*TASK 4:  Use the DEFAULT constructor and set methods to create a TeamLeader t2 whose information is below. Then display the contents of t2.
		Name: Janet Jackison
		Name: Michael Jackison
		Employee Number: 333-J
		Hire Date: 12-12-2012
		Shift: Night
		Hourly Pay Rate: $18.50
		Monthly Bonus: $600.00
		Required Training Hours: 7.0
		Training Hours Attended: 3.5

 */

   }
}