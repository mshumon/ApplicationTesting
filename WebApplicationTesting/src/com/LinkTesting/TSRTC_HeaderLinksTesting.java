package com.LinkTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class TSRTC_HeaderLinksTesting {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		
		WebElement HeaderBlock=driver.findElement(By.className("menu-wrap")); // Header Block
		List<WebElement>HeaderBlockLinks=HeaderBlock.findElements(By.tagName("a")); // Header Block Links
		
		System.out.println(HeaderBlockLinks.size());
		
		for(int i=0;i<HeaderBlockLinks.size();i++)
		{
		
		System.out.println(HeaderBlockLinks.get(i).getText());
		
		HeaderBlockLinks.get(i).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		
		driver.navigate().back();
		
		Sleeper.sleepTightInSeconds(10);
		
		HeaderBlock=driver.findElement(By.className("menu-wrap")); // Header Block
		HeaderBlockLinks=HeaderBlock.findElements(By.tagName("a")); // Header Block Links -- recreating ArrayList
		
		
		}
		
		driver.close();

	}

}
