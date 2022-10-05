package com.automate.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Mphasis Phase 5\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

			
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
			WebElement username = driver.findElement(By.id("email"));
			WebElement password = driver.findElement(By.id("pass"));
			WebElement login = driver.findElement(By.name("login"));
			//Entering credentials
			System.out.println("Login Automation Started....");
			username.clear();//clear id_login field if any filled
			username.click();
			username.sendKeys("gauravmishra@gmail.com");//use your email id
			System.out.println("Username is Entered.");
			
			password.clear();//clear id_password field if any filled
			password.click();
			password.sendKeys("aayu@1234");// use your password
			System.out.println("Password is Entered");
			login.click();
			System.out.println("Clicked On Login Button");
			

	}

}
