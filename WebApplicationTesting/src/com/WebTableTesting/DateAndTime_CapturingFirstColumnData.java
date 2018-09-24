package com.WebTableTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DateAndTime_CapturingFirstColumnData {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		
		// html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[1]/td[1]		
		// html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[2]/td[1]
		// html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[36]/td[1]
		
		String part1="html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[";
		String part2="]/td[1]";
		
		
		
		for(int i=1;i<=36;i++)
		{
		
		String Shumon=driver.findElement(By.xpath(part1+i+part2)).getText();
		
		System.out.println(Shumon);
		
		}
		driver.close();

	}

}
