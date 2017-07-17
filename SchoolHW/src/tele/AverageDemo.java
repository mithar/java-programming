package tele;

public class AverageDemo {
	
	public static void main(String [] args)
	
	{
		Average student = new Average();
		System.out.println("Scores of Sudent 1:\n\t" + student.toString());

		System.out.printf("Mean of Student 1 Scores:      %.2f\n", student.calculateMean());
		System.out.printf("Min of Student 1 Scores:       %.2f\n", student.findMin());
		System.out.printf("Max of Student 1 Scores:       %.2f\n", student.findMax());
		System.out.printf("Midpont of Student 1 Scores:   %.2f\n", student.findMidPoint());
		
		
	}

}
