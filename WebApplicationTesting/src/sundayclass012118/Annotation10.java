package sundayclass012118;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation10 
{
	@BeforeTest
	public void BrowserLunch()

	{
	System.out.println("This is used to Automate the Browser");	
	}
			
	@Test(priority=1)
	public void LogIn()

	{
		System.out.println("This is used to test Login");
	}

	@Test(priority=2)
	public void CompseeMail()
	{
	System.out.println("This is used to test compose email");	
	}
	
	@AfterTest
	public void ApplicationClosed()
	{
	System.out.println("This is used to closed the application");	
	}
}
