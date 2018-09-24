package sundayclass012118;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelloperation {

	public static void main(String[] args) throws IOException
	{
	FileInputStream file = new FileInputStream("C:\\Users\\Minu\\Desktop\\DataFile.xlsx");// identifying a file on the System
	XSSFWorkbook workBook = new XSSFWorkbook(file);// Identifying WorkBook in the File
	XSSFSheet Sheet = workBook.getSheet("Sheet1");// Identifying Sheet in the workBook
	
	 Row r=Sheet.getRow(0);
	 Cell c=r.getCell(0);
	 String data=c.getStringCellValue();
	 
	 System.out.println(data);
	
	}

}
