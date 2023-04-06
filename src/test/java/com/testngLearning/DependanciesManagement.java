package com.testngLearning;

import org.testng.annotations.Test;

public class DependanciesManagement {
  @Test(enabled = true)
  public void HighSchool() {
	  System.out.println("High School");
  }
  @Test(dependsOnMethods = "HighSchool")
  public void HighSecondary() {
	  System.out.println("High Secondary");
  }
  @Test(dependsOnMethods = "HighSecondary")
  public void Engineering() {
	  System.out.println("Engineering college");
  }
}
