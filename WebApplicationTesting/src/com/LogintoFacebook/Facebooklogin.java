package com.LogintoFacebook;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebooklogin {

	public static void main(String[] args) 
	{
	
	FirefoxDriver driver = new FirefoxDriver();
	
	driver.get("http://facebook.com");
	
	driver.findElementById("email").sendKeys("shumon125@yahoo.com"); // Email/Phone Element
	
	driver.findElementById("pass").sendKeys("monday"); // Password Element
	
	driver.findElementById("loginbutton").click();
	
	driver.close();

	}

}
