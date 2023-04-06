package com.testngInterview;

import org.testng.annotations.Test;

public class DependsOnFails {
  @Test(timeOut = 2000)
  public void parentspermission() throws InterruptedException {
	  Thread.sleep(3000);
	  System.out.println(" Parent permission");
  }
  @Test(dependsOnMethods = "parentspermission",alwaysRun = true)
  public void marriage() {
System.out.println("marriage sucess");
}
}
