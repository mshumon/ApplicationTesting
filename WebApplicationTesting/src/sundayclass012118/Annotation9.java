package sundayclass012118;

import org.testng.annotations.Test;

public class Annotation9 {
	
@Test(priority=1)
public void BrowserLunch()

{
System.out.println("This is used to Automate the Browser");	
}
		
@Test(priority=2)
public void LogIn()

{
	System.out.println("This is used to test Login");
}

@Test(priority=3)
public void CompseeMail()
{
System.out.println("This is used to test compose email");	
}
}
