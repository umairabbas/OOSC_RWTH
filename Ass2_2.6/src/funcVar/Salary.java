package funcVar;

public class Salary implements ISalary{
	
	 public final double INTERN_SALARY = 8.0;
	 public final double DEFAULT_SALARY = 10.0;
	 public final double SENIOR_SALARY = 15.0;
	 
	/**
     * Calculate salaries at standard rate of developer 10 euro/hour.
     *
     * @param hours the number of hours worked by employee in the whole month.
     * @return salary default amount to be paid at end of month.
     */
	@Override
	public double calculateDeveloperSalary(double hours) {
		if (hours >= 0.0)
			return DEFAULT_SALARY * hours;
		else 
			return 0;
	}

	
}
