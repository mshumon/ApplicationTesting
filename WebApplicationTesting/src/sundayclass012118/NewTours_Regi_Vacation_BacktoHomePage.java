package sundayclass012118;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Regi_Vacation_BacktoHomePage 
{
	public static void main(String[] args)
	{
	
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElementByLinkText("REGISTER").click();
		
		driver.findElementByLinkText("Vacations").click();
		
		driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img").click();
		
		driver.close();

	}

}
