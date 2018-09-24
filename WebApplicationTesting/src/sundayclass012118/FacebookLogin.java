package sundayclass012118;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin {

	public static void main(String[] args)
	{
     FirefoxDriver driver = new FirefoxDriver();
     
     driver.get("https://facebook.com");
     
     driver.findElementById("email").sendKeys("shumon111");
     
     
     //driver.findElement(By.id("email")).sendKeys("shumon123@yahoo.com");
     
     //driver.findElement(By.id("email"));
     
     driver.findElementById("pass").sendKeys("pass");
     
     driver.findElementById("loginbutton").click();
     
     driver.close();
    	 
    	 
    	 

	}

}
