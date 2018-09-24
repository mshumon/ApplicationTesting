package sundayclass012118;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureURL_Facebook {

	public static void main(String[] args)
	{
		
     FirefoxDriver  Driver = new FirefoxDriver();
     Driver.get("http:gmail.com");
     
     System.out.println(Driver.getCurrentUrl());
     
     Driver.close();
	}

}
