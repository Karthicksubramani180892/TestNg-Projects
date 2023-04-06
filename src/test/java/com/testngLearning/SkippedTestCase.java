package com.testngLearning;

import org.testng.annotations.Test;

public class SkippedTestCase {
  @Test(priority = 1)
  public void OnMusic() {
	  System.out.println("On the music player");
  }
  @Test(priority = 0)
  public void StartTheCar() {
	  System.out.println(" Start the car");
  }
  @Test(priority = 2)
  public void PutFirstGear() {
	  System.out.println(" PutFirstGear for car");
  }
  @Test(priority = 3)
  public void PutSecondGear() {
	  System.out.println(" PutSecondGear for car");
  }
  @Test(priority = 4)
  public void PutThirdGear() {
	  System.out.println("PutThirdGear for car");
  }
  @Test(priority = 5, enabled = false)
  public void PutFourthGear() {
	  System.out.println(" PutFourthGear for car");
  }
  
}
