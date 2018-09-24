package sundayclass012118;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassLocator0916 {

	public static void main(String[] args) 
	{
	
	FirefoxDriver driver = new FirefoxDriver();
	
	driver.get("https://www.google.com/");
	
	driver.findElementByClassName("gb_P").click();
	
	driver.close();
	
	System.out.println("Click Gmail");

	}

}
