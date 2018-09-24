package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadOperation1 {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Minu\\Desktop\\TestData.xlsx");// identifying a file on the System
		XSSFWorkbook workBook = new XSSFWorkbook(file); // Identifying WorkBook in the File
		XSSFSheet sheet = workBook.getSheet("Sheet1"); // Identifying Sheet in the workBook
		
		Row r=sheet.getRow(0); // Identifying a particular Row in the Sheet
		Cell c=r.getCell(0); // Identifying a particular Cell in the Row
		String data=c.getStringCellValue();
		System.out.println(data);
		
	}

}
