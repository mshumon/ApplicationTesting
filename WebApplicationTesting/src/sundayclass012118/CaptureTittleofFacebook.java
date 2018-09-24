package sundayclass012118;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureTittleofFacebook {

	public static void main(String[] args) {
		
		FirefoxDriver Shumon = new FirefoxDriver();
		
		Shumon.get("https://facebook.com");
		
		System.out.println(Shumon.getTitle());
		
		Shumon.close();
		
		//System.out.println("Browser closed");

	}

}
