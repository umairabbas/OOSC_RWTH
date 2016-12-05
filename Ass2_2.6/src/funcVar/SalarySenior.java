package funcVar;

public class SalarySenior extends Salary{

	/**
     * Calculate salaries at of Senior developer 15 euro/hour.
     *
     * @param hours the number of hours worked by employee in the whole month.
     * @return salary default amount to be paid at end of month.
     */
	@Override
	public double calculateDeveloperSalary(double hours) {
		if (hours >= 0.0)
			return SENIOR_SALARY * hours;
		else 
			return 0;
	}
	
}
