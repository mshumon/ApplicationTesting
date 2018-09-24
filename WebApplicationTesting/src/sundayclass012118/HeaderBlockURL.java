package sundayclass012118;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class HeaderBlockURL {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		
		WebElement HeaderBlock=driver.findElementByClassName("menu-wrap");
		
		List<WebElement>HeaderBlockLinks=HeaderBlock.findElements(By.tagName("a"));
		
		System.out.println(HeaderBlockLinks.size());
		
		for (int i=0;i<HeaderBlockLinks.size();i++)
		{
		System.out.println(HeaderBlockLinks.get(i).getText());
		HeaderBlockLinks.get(i).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		
		driver.navigate().back();
		
		Sleeper.sleepTightInSeconds(10);
		HeaderBlock=driver.findElement(By.className("menu-wrap"));
		HeaderBlockLinks=HeaderBlock.findElements(By.tagName("a"));
		
		}
		
		driver.close();

	}

}
