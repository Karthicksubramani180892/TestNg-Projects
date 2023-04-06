package com.testngLearning;

import org.testng.Assert;
import org.testng.annotations.Test;



public class AssertionExample {

	String Name = "sabi";
	boolean value = false;

	@Test
	public void CheckedInfo() {
//		if (Name.equals("sabi")) {
//			System.out.println("this name is true");
//		} else {
//			System.out.println("this name is exact sabi");
//		}
		
	//Assert.assertEquals(Name, "sabi");
	//Assert.assertTrue(value, "this value is true");
	Assert.assertFalse(value, "this value is false");
	}
}
