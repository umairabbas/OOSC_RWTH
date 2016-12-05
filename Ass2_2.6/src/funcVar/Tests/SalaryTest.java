package funcVar.Tests;
import org.junit.Assert;
import org.junit.Test;

import funcVar.ISalary;
import funcVar.Salary;
import funcVar.SalaryIntern;
import funcVar.SalarySenior;

public class SalaryTest {
	
	 public final double INTERN_SALARY = 8.0;
	 public final double DEFAULT_SALARY = 10.0;
	 public final double SENIOR_SALARY = 15.0;
	 
	@Test
    public void test_Zero_Neg_Hours() {
        ISalary[] algorithms = {
                new Salary(),
                new SalaryIntern(),
                new SalarySenior(),
        };
        final double hours[] = {0.0, -1.0, -10.0, -0.1};
        for (int i = 0; i < algorithms.length; i++) {
            double salary = algorithms[i].calculateDeveloperSalary(hours[i]);
            Assert.assertEquals(0, salary, 0);
        }
    }

    @Test
    public void test_Commutation() {
    	ISalary[] algorithms = {
                new Salary(),
                new SalaryIntern(),
                new SalarySenior(),
        };
        final double hours[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double newSalary = 0.0;
        for (int i = 0; i < algorithms.length; i++) {
            double salary = algorithms[i].calculateDeveloperSalary(hours[i]);
            if(i==0)
            	newSalary = hours[i] * DEFAULT_SALARY;
            else if(i==1)
            	newSalary = hours[i] * INTERN_SALARY;
            else 
            	newSalary = hours[i] * SENIOR_SALARY;
            Assert.assertEquals(newSalary, salary, 0);
        }
    }

    @Test
    public void test_NotEqualsZero() {
    	ISalary[] algorithms = {
                new Salary(),
                new SalaryIntern(),
                new SalarySenior(),
        };
        final double hours[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double newSalary = 0.0;
        for (int i = 0; i < algorithms.length; i++) {
            double salary = algorithms[i].calculateDeveloperSalary(hours[i]);
            Assert.assertNotEquals(0, salary, 0);
        }
    }
}
