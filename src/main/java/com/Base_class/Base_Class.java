package com.Base_class;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Base_Class 
{
	public static WebDriver driver;
	
	public static String cellvalue; //null
	
	public static WebDriver browser_Configuration(String type)
	{
		if (type.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
			System.getProperty("user.dir")+ "\\Driver_21\\chromedriver.exe");
			 driver = new ChromeDriver();
			    
		}
		
		else if(type.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "");
			driver = new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public static void implicitWait(int sec, TimeUnit format)
	{
		driver.manage().timeouts().implicitlyWait(sec, format);
	}
	
	public static void explicitWait(WebElement element, int sec)
	{
		WebDriverWait wait = new WebDriverWait(driver, sec);
		wait.until(ExpectedConditions.visibilityOf(element)).click();
				
	}
	
	public static void takeScreenshot(String path) throws Exception
	{
		 TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(path);
			FileUtils.copyFile(src, dest);
	}
	

	public static void clickonElement(WebElement element)
	{
		element.click();
	}
	
	public static void inputValueElement(WebElement element, String data)
	{
	
		element.sendKeys(data);
	}
	
	 public static void actionsClass(WebElement element, String actionName)
	{
		try
		{
			Actions a = new Actions(driver);
			if(actionName.equalsIgnoreCase("moveto"))
			{
				a.moveToElement(element).build().perform();
			}
			else if (actionName.equalsIgnoreCase("clickon"))
			{
				a.click(element).build().perform();
			}
			else if (actionName.equalsIgnoreCase("doubleClick"))
			{
				a.contextClick(element).build().perform();
			}
			else if(actionName.equalsIgnoreCase("click"))
			{
				a.click(element).build().perform();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void takeScreenshot1(String path1) throws Exception
	{
		 TakesScreenshot ts = (TakesScreenshot) driver;
			File src1 = ts.getScreenshotAs(OutputType.FILE);
			File dest1 = new File(path1);
			FileUtils.copyFile(src1, dest1);
			
	}
	

	public static void getUrl(String url)
	{
		driver.get(url);
		
	}
	
	public static String particular_Cell_Data(String path, int row_Index, int cell_Index) throws IOException
	{
		File f = new File(path);//convert from .xlsx to file
		
		FileInputStream fis = new FileInputStream(f); // take the input from the file
		
		Workbook wb = new XSSFWorkbook(fis); //pass the data (which is taken from the file) to workbook
		
		Sheet sheetAt = wb.getSheetAt(0); //retrieve the sheet through workbook
		
		Row row = sheetAt.getRow(row_Index); //retrieve the row
		
		Cell cell = row.getCell(cell_Index); //retrieve the cell
		
		CellType type = cell.getCellType();
		
		if(type.equals(CellType.STRING))
		{
			cellvalue = cell.getStringCellValue();
			System.out.println(cellvalue);
			
		}
		
		else if (type.equals(CellType.NUMERIC))
		{
			double value = cell.getNumericCellValue();
			int intvalue = (int)value;
			//System.out.println(intvalue);
			cellvalue = Integer.toString(intvalue);
		}
		wb.close();
		return cellvalue;
		
	}	
	
	public static String adactin_Particular_Cell_Data(String path, int row_Index, int cell_Index) throws IOException
	{
		File f = new File(path);//convert from .xlsx to file
		
		FileInputStream fis = new FileInputStream(f); // take the input from the file
		
		Workbook wb = new XSSFWorkbook(fis); //pass the data (which is taken from the file) to workbook
		
		Sheet sheetAt = wb.getSheetAt(0); //retrieve the sheet through workbook
		
		Row row = sheetAt.getRow(row_Index); //retrieve the row
		
		Cell cell = row.getCell(cell_Index); //retrieve the cell
		
		CellType type = cell.getCellType();
		
		if(type.equals(CellType.STRING))
		{
			cellvalue = cell.getStringCellValue();
			System.out.println(cellvalue);
			
		}
		
		else if (type.equals(CellType.NUMERIC))
		{
			double value = cell.getNumericCellValue();
			int intvalue = (int)value;
			//System.out.println(intvalue);
			cellvalue = Integer.toString(intvalue);
		}
		wb.close();
		return cellvalue;
		
	}
	
	public static void close()
	{
		driver.close();
	}
	
	
}
