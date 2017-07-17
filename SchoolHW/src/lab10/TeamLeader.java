package lab10;

public class TeamLeader extends ProductionWorker{
	
	private double monthlyBonus;
	private double requiredTrainingTime;
	public double trainingHoursAttended;
	
	public TeamLeader (String n, String num, String date,int sh, double rate, double mb, double rth, double tha)
	{
		super(n, num, date, sh, rate);
		monthlyBonus = mb;
		requiredTrainingTime = rth;
		trainingHoursAttended = tha;
	}
	
	public TeamLeader()
	{
		super();
		monthlyBonus = 0;
		requiredTrainingTime = 0;
		trainingHoursAttended = 0;
	}
	
	public void setMonthlyBonus(double b)
	{
		monthlyBonus = b;
	}

	public double getRequiredTrainingTime() {
		return requiredTrainingTime;
	}

	public void setRequiredTrainingTime(double p) {
		requiredTrainingTime = p;
	}

	public double getTrainingHoursAttended() {
		return trainingHoursAttended;
	}

	public void setTrainingHoursAttended(double t) {
		trainingHoursAttended = t;
	}

	public double getMonthlyBonus() {
		return monthlyBonus;
	}
	
	@Override
	public String toString()
	{
		String str = super.toString();
		//str += String.format(str, "Monthly Bonus:" + monthlyBonus);
		//str += String.format(str, "Required Training Hours:" + requiredTrainingTime);
		//str += String.format(str, "Training Hours Attended:" +trainingHoursAttended);
		str +=monthlyBonus;
		str += requiredTrainingTime;
		//str += trainingHoursAttended;
		return str.format(str, "Monthly Bonus:" + monthlyBonus);
	}

}
