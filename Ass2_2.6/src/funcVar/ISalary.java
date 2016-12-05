package funcVar;

public interface ISalary {
	/**
     * Calculate salaries of developer.
     *
     * @param hours the number of hours worked by employee in the whole month.
     * @return salary the amount to be paid at end of month.
     */
	double calculateDeveloperSalary(double hours);
}
