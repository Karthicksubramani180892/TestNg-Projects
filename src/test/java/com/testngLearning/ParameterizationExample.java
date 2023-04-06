package com.testngLearning;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
@Test
@Parameters("Name")
	public void PrintName(String Name) {
System.out.println("Print Name is : "+Name);
	}
}
