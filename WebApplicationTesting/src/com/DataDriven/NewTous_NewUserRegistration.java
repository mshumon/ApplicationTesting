package com.DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTous_NewUserRegistration 
{

	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	}
	
	
	@Test(priority=1)
	public void Register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
		
	}
	
	@Test(priority=2)
	public void UserRegistration()
	{
		driver.findElement(By.name("firstName")).sendKeys("Shumon");
		driver.findElement(By.name("lastName")).sendKeys("Hello");
		driver.findElement(By.name("phone")).sendKeys("5685588");
		driver.findElement(By.id("userName")).sendKeys("Shumon@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("123MainStreet");
		driver.findElement(By.name("city")).sendKeys("NewYrk");
		driver.findElement(By.name("state")).sendKeys("NYssswe");
		driver.findElement(By.name("postalCode")).sendKeys("28968");
		driver.findElement(By.name("country")).sendKeys("UNITED STATES");
		
		driver.findElement(By.name("email")).sendKeys("Shuuoon");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("confirmPassword")).sendKeys("abc123");
		
		driver.findElement(By.name("register")).click();
		
		String ExpectedUsername="Shuuoon";
		
		String ActualUserRegisterdText=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		
		System.out.println(ExpectedUsername);
		System.out.println(ActualUserRegisterdText);
		
		if(ActualUserRegisterdText.contains(ExpectedUsername))
		{
			System.out.println("User Registered Successfully -- PASS");
		}
		else
		{
			System.out.println("User Registration Faild -- FAIL");
		}
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

	
}
