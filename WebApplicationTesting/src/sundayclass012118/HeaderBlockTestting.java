package sundayclass012118;

import java.util.List;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderBlockTestting {

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
	}
	
	driver.close();

	}

}
