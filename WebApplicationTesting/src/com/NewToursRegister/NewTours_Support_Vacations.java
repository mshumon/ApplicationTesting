package com.NewToursRegister;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Support_Vacations {

	public static void main(String[] args)
	
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		//driver.findElement(By.linkText("SUPPORT")).click();
		
		driver.findElement(By.partialLinkText("SUPP")).click();
		
		driver.findElementByLinkText("Vacations").click();
		
		driver.close();
		
		

	}

}
