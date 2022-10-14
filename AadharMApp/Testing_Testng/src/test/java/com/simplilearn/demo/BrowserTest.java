package com.simplilearn.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserTest {
	
	WebDriver driver=null;
	//Check whether different browsers and screen resolutions render it the same way 
	@Test(groups = "Chrome")
	//Chrome Browser

	public void launchChrome() {
		boolean chromeLaunched = false;
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\Mphasis Phase 5\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("http://localhost:4200/");
		
			Thread.sleep(3000);
			chromeLaunched = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			chromeLaunched = false;
			e.printStackTrace();
		}
		
		if(chromeLaunched) {
			System.out.println("Chrome Launched Successfully");
		}
		else {
			System.out.println("Chrome Launched Unsuccessfully");

		}
	}
	
	@Test(groups = "Firefox")
	//Firefox Browser
	public void launchFireFox() {
		boolean firefoxLaunched = false;
		try {
		System.setProperty("webdriver.gecko.driver", "E:\\Mphasis Phase 5\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("http://localhost:4200/");

			Thread.sleep(3000);
			firefoxLaunched = true;

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			firefoxLaunched = true;
			e.printStackTrace();
		}
		if(firefoxLaunched) {
			System.out.println("Firefox Launched Successfully");
		}
		else {
			System.out.println("Firefox Launched Unsuccessfully");

		}
	}

}
