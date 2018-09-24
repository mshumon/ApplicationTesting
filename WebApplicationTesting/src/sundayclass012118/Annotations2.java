package sundayclass012118;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2
{
	@BeforeTest
	public void BrowserLunch()
	{
		System.out.println("this is use to automate browser");
	}

	@Test(priority=1)
	public void LogIn()
	{
	System.out.println("this is use to test login functionality");
	}
	@Test(priority=2)
	public void ComposeMail()
	{
	System.out.println("This ise to compose mail");
	}
	@AfterTest
	public void ApplicationClosed()
	{
		System.out.println("This is use to closed the application");
	}
}
