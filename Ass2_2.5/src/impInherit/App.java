package impInherit;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import test.ErasmusStudentTest;

import org.junit.runner.JUnitCore;

public class App {
    public static void main(String[] args) {
	    System.out.println("running tests");
	    Result result = JUnitCore.runClasses(ErasmusStudentTest.class);
	    if (result.wasSuccessful()) {
	        System.out.println("all tests finished successfully");
	    } else {
	        System.out.println("some tests have failed");
	        for (Failure failure : result.getFailures()) {
	            System.out.println(failure.toString());
	        }
	    }
    } 
}
