package com.TestNGAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3
{


	@BeforeMethod
	public void BrowserLaunchAndLogIn()
	{
		System.out.println("THis is used to automate Browser and Login");
	}
	
	@Test(priority=1)
	public void InBox()
	{
		System.out.println("This is used to test INBox Functionality");
	}
	
	@Test(priority=2)
	public void ComposeMail()
	{
		System.out.println("This is used to test Compose Mail Functionality");
	}
	
	@AfterMethod
	public void ApplicationCLose()
	{
		System.out.println("This is used to close the Application");
		
	}

	
	
	
}
