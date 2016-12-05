package funcVar;

public class SalaryIntern extends Salary{

	/**
     * Calculate salaries of intern developer 8 euro/hour.
     *
     * @param hours the number of hours worked by employee in the whole month.
     * @return salary default amount to be paid at end of month.
     */
	@Override
	public double calculateDeveloperSalary(double hours) {
		if (hours >= 0.0)
			return INTERN_SALARY * hours;
		else 
			return 0;
	}
}
