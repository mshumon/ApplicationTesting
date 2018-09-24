package sundayclass012118;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigatetoFacebookURL {

	public static void main(String[] args) 
	{
     // class      Object
    FirefoxDriver driver = new FirefoxDriver();
    
    driver.navigate().to("https://facebook.com");
    
    driver.close();
	}

}
