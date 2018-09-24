package sundayclass012118;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newtours_Supports_Vacation {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		driver.findElementByLinkText("SUPPORT").click();
		
		System.out.println("user able to view supoort page");
		
		driver.findElementByLinkText("Vacations").click();
		
		//driver.close();

	}

}
