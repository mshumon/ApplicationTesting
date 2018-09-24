package sundayclass012118;

import org.testng.annotations.Test;

public class Annotations1 
{

@Test(priority=1)
public void BrowserLunch()
{
	System.out.println("this is use to automate browser");
}

@Test(priority=2)
public void LogIn()
{
System.out.println("this is use to test login functionality");
}
@Test(priority=3)
public void ComposeMail()
{
System.out.println("This ise to compose mail");
}

}

