package com.MouseHoverOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra_Men_Jackets_Click {

	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://myntra.com");
		
		driver.manage().window().maximize();
		
		WebElement Men=driver.findElement(By.linkText("Men"));
		
		Actions act = new Actions(driver);
		act.moveToElement(Men).perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Jackets")).click();
		
		driver.close();
		
		

	}

}
