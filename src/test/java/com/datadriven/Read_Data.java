package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data 
{
	public static void particular_Cell_Data() throws IOException
	{
		File f = new File("C:\\Users\\Muthu\\eclipse-workspace\\March_First\\sample.xlsx");//convert from .xlsx to file
		
		FileInputStream fis = new FileInputStream(f); // take the input from the file
		
		Workbook wb = new XSSFWorkbook(fis); //pass the data (which is taken from the file) to workbook
		
		Sheet sheetAt = wb.getSheetAt(0); //retrieve the sheet through workbook
		
		Row row = sheetAt.getRow(4); //retrieve the row
		
		Cell cell = row.getCell(1); //retrieve the cell
		
		CellType type = cell.getCellType();
		
		if(type.equals(CellType.STRING))
		{
			String cellvalue = cell.getStringCellValue();
			System.out.println(cellvalue);
			
		}
		
		else if (type.equals(CellType.NUMERIC))
		{
			double cellvalue = cell.getNumericCellValue();
			int value = (int) cellvalue;
			System.out.println(value);
		}
		wb.close();
		
	}
	
	public static void particular_All_Data() throws IOException
	{
		File f = new File("C:\\Users\\Muthu\\eclipse-workspace\\March_First\\sample.xlsx");//convert from .xlsx to file
		
		FileInputStream fis = new FileInputStream(f); // take the input from the file
		
		Workbook wb = new XSSFWorkbook(fis); //pass the data (which is taken from the file) to workbook
		
		Sheet sheetAt = wb.getSheetAt(0); //retrieve the sheet through workbook
		
		for (int i =0; i<sheetAt.getPhysicalNumberOfRows();i++)
		{
			Row r = sheetAt.getRow(i);
			
			for (int j=0; j<r.getPhysicalNumberOfCells(); j++)
			{
				Cell c = r.getCell(j);
				CellType type = c.getCellType();
				
				if(type.equals(CellType.STRING))
				{
					String cellvalue = c.getStringCellValue();
					System.out.println(cellvalue);
					
				}
				
				else if (type.equals(CellType.NUMERIC))
				{
					double numericvalue = c.getNumericCellValue();
					int value = (int) numericvalue;
					String string = Integer.toString(value);
					System.out.println(string);
				}
				
			}
			
		}
		wb.close();
	}
		
		public static void particular_Row_Data() throws IOException
		{
			
			File f = new File("C:\\Users\\Muthu\\eclipse-workspace\\March_First\\sample.xlsx");//convert from .xlsx to file
			
			FileInputStream fis = new FileInputStream(f); // take the input from the file
			
			Workbook wb = new XSSFWorkbook(fis); //pass the data (which is taken from the file) to workbook
			
			Sheet sheetAt = wb.getSheetAt(0); //retrieve the sheet through workbook
			
			Row r = sheetAt.getRow(3); //retrieve the row
			
			for (int j=0; j<r.getPhysicalNumberOfCells(); j++)
			{
				Cell c = r.getCell(j);
				CellType type = c.getCellType();
				
				if(type.equals(CellType.STRING))
				{
					String cellvalue = c.getStringCellValue();
					System.out.println(cellvalue);
					
				}
				
				else if (type.equals(CellType.NUMERIC))
				{
					double numericvalue = c.getNumericCellValue();
					int value = (int) numericvalue;
					String string = Integer.toString(value);
					System.out.println(string);
				}
				
			}
			wb.close();
		}
		
		public static void particular_Column_Data() throws IOException
		{
			File f = new File("C:\\Users\\Muthu\\eclipse-workspace\\March_First\\sample.xlsx");//convert from .xlsx to file
			
			FileInputStream fis = new FileInputStream(f); // take the input from the file
			
			Workbook wb = new XSSFWorkbook(fis); //pass the data (which is taken from the file) to workbook
			
			Sheet sheetAt = wb.getSheetAt(0); //retrieve the sheet through workbook
			
			for (int i =0; i<sheetAt.getPhysicalNumberOfRows();i++)
			{
				
				Row r = sheetAt.getRow(i);
				Cell c = r.getCell(0);
				
				CellType type = c.getCellType();
				
				if(type.equals(CellType.STRING))
				{
					String cellvalue = c.getStringCellValue();
					System.out.println(cellvalue);
					
				}
				
				else if (type.equals(CellType.NUMERIC))
				{
					double numericvalue = c.getNumericCellValue();
					int value = (int) numericvalue;
					String string = Integer.toString(value);
					System.out.println(string);
				}
			}
			wb.close();
			
		}
	
	public static void main(String[] args) throws IOException 
	{
		particular_Cell_Data();
		particular_All_Data();
		particular_Row_Data();
		particular_Column_Data();
	}

}
