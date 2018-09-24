package sundayclass012118;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserAutomation {

	public static void main(String[] args) {
		// class       object 
		
		FirefoxDriver  Driver = new FirefoxDriver();
		Driver.get("https://www.amazon.com");
		System.out.println("Amazon application home page opened");
		Driver.close();
		System.out.println("Driver Closed");

	}

}
