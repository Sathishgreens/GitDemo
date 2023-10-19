package org.runner;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junitpractice.Adactin;
import org.junitpractice.Sample;

public class RunnerClass {
	
	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(Adactin.class,Sample.class);
		
		List<Failure> failures = result.getFailures();
		
		for(Failure failure:failures) {
			String message = failure.getMessage();
			System.out.println(message);
		}
		
		boolean wasSuccessful = result.wasSuccessful();
		System.out.println("Successfully Executed : "+wasSuccessful);
		
	}
}
