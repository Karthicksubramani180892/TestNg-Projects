package com.testngLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver;
	long StartTime;
	long EndTime;

	@BeforeSuite
	public void LaunchBrowser() {
		StartTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karth\\Downloads\\Selenium Properties\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void OpenGoogle() {

		driver.get("htttp://www.google.com");

	}

	@Test
	public void OpenBeing() {

		driver.get("http://www.being.com");

	}

	@Test
	public void OpenYahoo() {

		driver.get("http://www.yahoo.com");

	}

	@AfterSuite
	public void CloseBrowser() {
		driver.quit();
		 EndTime = System.currentTimeMillis();
		long totaltime = EndTime - StartTime;
		System.out.println("time taken : " + totaltime);
	}
}
