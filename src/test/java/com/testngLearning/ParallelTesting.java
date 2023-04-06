package com.testngLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
@Test
	public void OpenBeing() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karth\\Downloads\\Selenium Properties\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("htttp://www.being.com");
	}
@Test
	public void OpenYahoo() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karth\\Downloads\\Selenium Properties\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.yahoo.com");
	}
}
