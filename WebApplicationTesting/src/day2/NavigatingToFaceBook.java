package day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigatingToFaceBook
{

	public static void main(String[] args) 
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		//driver.get("http://gmail.com");
		
		driver.navigate().to("http://facebook.com");
		
		driver.close();
	}

}
