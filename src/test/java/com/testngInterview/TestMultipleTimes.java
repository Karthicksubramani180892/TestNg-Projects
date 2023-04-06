package com.testngInterview;

import org.testng.annotations.Test;

public class TestMultipleTimes {
	@Test(invocationCount = 5)
	public void Test() {
		System.out.println("Test for SK");
	}
}
