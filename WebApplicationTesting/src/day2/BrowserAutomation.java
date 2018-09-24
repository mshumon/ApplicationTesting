package day2;


import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserAutomation 
{

	public static void main(String[] args)
	{
	
		// class       Object
		FirefoxDriver Shumon = new FirefoxDriver();
		Shumon.get("http://www.amazon.com");
		System.out.println("Amazon Application Home Opened");
		Shumon.close();
		System.out.println("Browser Closed");
		
		
	

	}

}

