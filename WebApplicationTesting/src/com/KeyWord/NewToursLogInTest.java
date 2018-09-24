package com.KeyWord;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursLogInTest
{

	//FirefoxDriver driver ;
	
	//ChromeDriver driver;
	
	//InternetExplorerDriver driver;
	
	EdgeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		//System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Minu\\Desktop\\ShumonSelenium\\WebApplicationTesting\\BrowserDriverFiles\\MicrosoftWebDriver.exe");
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Minu\\Desktop\\ShumonSelenium\\WebApplicationTesting\\BrowserDriverFiles\\geckodriver.exe");
		
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\Minu\\Desktop\\ShumonSelenium\\WebApplicationTesting\\BrowserDriverFiles\\.exe");
		
		//driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		
		driver = new EdgeDriver();
		driver.get("http://newtours.demoaut.com");
	}
	
	@Test
	public void LogIn() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Minu\\Desktop\\ShumonSelenium\\WebApplicationTesting\\NewToursApplication.properties");
		
		Properties pr = new Properties();
		pr.load(file);
		
		driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("Password"))).sendKeys("tutorial");
		driver.findElement(By.xpath(pr.getProperty("SignIn"))).click();
		
		String ExpectedTitle ="Find";
		String ActualTitle=driver.getTitle();
		System.out.println(ExpectedTitle);
		System.out.println(ActualTitle);
		
		if(ActualTitle.contains(ExpectedTitle))
		{
			System.out.println("User successfully login to the application--pass");
		}
		else
		{
			System.out.println("User Failed to LogIn -- FAIL");
		}
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
}
