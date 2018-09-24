package com.FacebookLogInTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogIn
{

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("Shumon"); // Email Element
		
		driver.findElementById("pass").sendKeys("abc123"); // Password Element
		
		driver.findElement(By.id("loginbutton")).click();
		
		driver.close();
		
		
	}

}