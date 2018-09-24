package sundayclass012118;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NewToursLogin {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElementByName("userName").sendKeys("tutorial");
		
		driver.findElementByName("password").sendKeys("tutorial");
		
		driver.findElementByName("login");
		
		System.out.println("user able to login");
		
		driver.close();

	}

}
