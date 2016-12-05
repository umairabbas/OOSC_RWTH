package funcVar;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.JUnitCore;

import funcVar.Tests.SalaryTest;

public class App {
    public static void main(String[] args) {
        System.out.println("running tests");
        Result result = JUnitCore.runClasses(SalaryTest.class);
        if (result.wasSuccessful()) {
            System.out.println("all tests finished successfully");
        } else {
            System.out.println("some tests have failed");
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
        }
        System.out.println();
        System.out.println("done.");
    }
}
