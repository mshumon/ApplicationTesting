package sundayclass012118;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTour_Regi_Page {

	public static void main(String[] args) 
	
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		driver.findElementByLinkText("REGISTER").click();
		
		driver.close();
		
		System.out.println("user able to view Register page");

	}

}
