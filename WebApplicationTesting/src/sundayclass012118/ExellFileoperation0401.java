package sundayclass012118;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExellFileoperation0401 {

	public static void main(String[] args) throws IOException
	{
	
	FileInputStream file = new FileInputStream("C:\\Users\\Minu\\Desktop\\DataFile.xlsx");
	XSSFWorkbook workBook = new XSSFWorkbook(file);
	XSSFSheet Sheet = workBook.getSheet("Sheet1");
	
	Row r=Sheet.getRow(0);
	
	Cell c=r.getCell(0);
	String data=c.getStringCellValue();
	System.out.println(data);
	
	}

}
