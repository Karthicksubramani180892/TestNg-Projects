package com.testngLearning;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ListenersExample implements ITestListener {

	public void onTestStart(ITestResult result) {
System.out.println("Test case is going execute");		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test case passed");		
	
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test case is failure");		

	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test case is skipped");		

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Case Success percentage");		

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Before everythng");		

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("After everything");		

	}
  
}
