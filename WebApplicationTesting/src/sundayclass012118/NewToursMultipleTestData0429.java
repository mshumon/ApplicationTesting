package sundayclass012118;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursMultipleTestData0429
{
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
	driver= new FirefoxDriver();
	driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	}

	 @Test(priority=1)
	 public void Register()
	 {
	 driver.findElementByLinkText("REGISTER").click();	 
	 }
	 @Test(priority=2)
	 public void UserRegistration() throws IOException
	 {
		 
	FileInputStream file = new FileInputStream("C:\\Users\\Minu\\Desktop\\ShumonSelenium\\WebApplicationTesting\\src\\com\\ExcellDataFile042218\\ShumonUserRegistrationTestData.xlsx");	 
	XSSFWorkbook workBook = new XSSFWorkbook(file);
	XSSFSheet sheet = workBook.getSheet("Sheet1");
	int RowCount=sheet.getLastRowNum();
	for(int a=1;a<=RowCount;a++)
	{
	Row r=sheet.getRow(a);
	
	  driver.findElementByName("firstName").sendKeys(r.getCell(0).getStringCellValue());
	  driver.findElementByName("lastName").sendKeys(r.getCell(1).getStringCellValue());
	  
	  double d=r.getCell(2).getNumericCellValue();
	  long x=(long)d;
	  String PhoneNumber=Long.toString(x);
	  
	  driver.findElementByName("phone").sendKeys(PhoneNumber);
	  driver.findElementById("userName").sendKeys(r.getCell(3).getStringCellValue());
	  driver.findElementByName("address1").sendKeys(r.getCell(4).getStringCellValue());
	  driver.findElementByName("city").sendKeys(r.getCell(5).getStringCellValue());
	  driver.findElementByName("state").sendKeys(r.getCell(6).getStringCellValue());
	  
	  double p=r.getCell(7).getNumericCellValue();
	  long y=(long)p;
	  String PostalCode=Long.toString(y);
	  
	  driver.findElementByName("postalCode").sendKeys(PostalCode);
	  driver.findElementByName("country").sendKeys(r.getCell(8).getStringCellValue());
	  driver.findElementById("email").sendKeys(r.getCell(9).getStringCellValue());
	  driver.findElementByName("password").sendKeys(r.getCell(10).getStringCellValue());
	  driver.findElementByName("confirmPassword").sendKeys(r.getCell(11).getStringCellValue());
	  
	  driver.findElementByName("register").click();
	  
	  String ExpectedUsername=r.getCell(9).getStringCellValue();
	  String ActulUserRegisteredText=driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b").getText(); 
	  System.out.println(ExpectedUsername);
	  System.out.println(ActulUserRegisteredText);
	  
	  if(ActulUserRegisteredText.contains(ExpectedUsername))
	  {
		  System.out.println("User Registred Successfully-- PASS");
		  r.createCell(12).setCellValue("User Registred Successfully-- PASS");
	  }
	  else
	  {
		  System.out.println("User Registred Fail-- Failed");
		  r.createCell(12).setCellValue("User Registred Fail-- Failed");
	  }
	  
	  FileOutputStream file1= new FileOutputStream("C:\\Users\\Minu\\Desktop\\ShumonSelenium\\WebApplicationTesting\\src\\com\\ExcellTestResultsFiles042218\\ShumonUserRegistrationTestData.xlsx");
	  workBook.write(file1);
	  driver.navigate().back(); 
	 }	  
	 }
	@AfterTest
	public void tearDown()
	{
	driver.close();	
	}
}
