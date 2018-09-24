package com.LoginNewTours;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NewtourLogin {

	public static void main(String[] args) 
	{
		// TC01: This test cases is to verify the system shall allow user to login to newtours application.
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElementByName("userName").sendKeys("tutorial");
		
		driver.findElementByName("password").sendKeys("tutorial");
		
		driver.findElementByName("login").click();
		
		System.out.println("user able to login");
		
		driver.close();

	}

}
