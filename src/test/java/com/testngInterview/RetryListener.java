package com.testngInterview;



import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class RetryListener implements IRetryAnalyzer {
int failcount = 0;
int limit = 5;
	public boolean retry(ITestResult result) {
		if(failcount<limit) {
			failcount++;
			return true;
		}
		return false;
	}

}
