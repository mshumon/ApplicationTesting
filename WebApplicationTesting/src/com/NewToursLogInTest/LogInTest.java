package com.NewToursLogInTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInTest 
{
	public static void main(String[] args)
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		driver.findElementByName("password").sendKeys("tutorial");
		
		driver.findElementByName("login").click();
		
		driver.close();

	}

}
