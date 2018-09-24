package com.TestNGAnnotations;

import org.testng.annotations.Test;

public class Annotations1
{

	@Test(priority=1)
	public void BrowserLaunch()
	{
		System.out.println("This is used to Automate The Browser");
	}
	
	@Test(priority=2)
	public void LogIn()
	{
		System.out.println("This is used to test LogIn FUnctionality");
	}
	
	@Test(priority=3)
	public void ComposeMail()
	{
		System.out.println("This is used to Test ComposeMail functionality");
	}
	
}
