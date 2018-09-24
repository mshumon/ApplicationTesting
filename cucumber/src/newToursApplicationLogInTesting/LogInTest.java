package newToursApplicationLogInTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInTest
{

	FirefoxDriver driver;

@Given("^Open Firefox Browser and Navigate to NewTours Application$")
public void Open_Firefox_Browser_and_Navigate_to_NewTours_Application() throws Throwable
{
   driver = new FirefoxDriver();
   driver.get("http://newtours.demoaut.com");
}

@When("^User enters Valid UserName and Password and Click on SignIn button$")
public void User_enters_Valid_UserName_and_Password_and_Click_on_SignIn_button() throws Throwable
{
	driver.findElement(By.name("userName")).sendKeys("tutorial");
	
	driver.findElementByName("password").sendKeys("tutorial");
	
	driver.findElementByName("login").click();
}

@Then("^User should be able to succesfully logIn and Close the Application$")
public void User_should_be_able_to_succesfully_logIn_and_Close_the_Application() throws Throwable
{
	String ExpectedTitle="Find";
	System.out.println(ExpectedTitle);
	
	String ActualTitle=driver.getTitle();
	System.out.println(ActualTitle);
	
	if(ActualTitle.contains(ExpectedTitle))
	{
		System.out.println("LogIn Successful -- PASS");
	}
	else
	{
		System.out.println("LogIn Failed -- FAIL");
	}
	
	driver.close();
}
	
}
