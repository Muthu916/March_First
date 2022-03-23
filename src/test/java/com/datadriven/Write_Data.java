package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("C:\\Users\\Muthu\\Documents\\Write_Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f); // take the input from the file
		
		Workbook wb = new XSSFWorkbook(fis); //pass the data (which is taken from the file) to workbook
		
		wb.createSheet("Emp_Data").createRow(0).createCell(0).setCellValue("Email");
		wb.getSheet("Emp_Data").getRow(0).createCell(1).setCellValue("Password");
		wb.getSheet("Emp_Data").createRow(1).createCell(0).setCellValue("Muthu");
		wb.getSheet("Emp_Data").getRow(1).createCell(1).setCellValue("Muthu@916");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("Write Successfully");
		
	}

}
