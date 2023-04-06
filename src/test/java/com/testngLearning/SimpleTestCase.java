package com.testngLearning;

import org.testng.annotations.Test;

public class SimpleTestCase {
@Test(enabled = true)
	public void FirstTest() {
System.out.println("first test case");
	}
	/*
	 * @Test public void SecondTest() { System.out.println("second test case");
	 * 
	 * }
	 * 
	 * @Test public void ThirdTest() { System.out.println("third test case");
	 * 
	 * }
	 * 
	 * @Test public void FourthTest() { System.out.println("fourth test case");
	 * 
	 * }
	 */
}
