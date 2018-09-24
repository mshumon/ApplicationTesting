package com.NewToursLogin;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTourlogin {

	public static void main(String[] args) 
	{
		// TC01: this test case is to verify that the system shall allow user to login the new tours application.
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElementByName("userName").sendKeys("tutorial"); // Username Element
        driver.findElementByName("password").sendKeys("tutorial"); // Password Element
        driver.findElementByName("login").click();
        
        System.out.println("user able to login");
        
        driver.close();
        
	}

}
