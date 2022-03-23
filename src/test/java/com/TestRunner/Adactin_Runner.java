package com.TestRunner;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import com.Adactinhelper.AdactinPOManager;
import com.Base_class.Base_Class;
import com.helper.Page_Object_Manager;
import com.pom.AdactinLogout_Page;
import com.pom.adactin.BookHotel_Page;
import com.pom.adactin.Login_Page;
import com.pom.adactin.MyItinerary_Page;
import com.pom.adactin.SearchHotel_Page;
import com.pom.adactin.SelectHotel_Page;

public class  Adactin_Runner extends Base_Class
{
	public static WebDriver driver=browser_Configuration("Chrome");
	public static AdactinPOManager pom1 = new AdactinPOManager(driver);
	public static String path="C:\\Users\\Muthu\\eclipse-workspace\\March_First\\Test Case - Adactin Hotel - Final.xlsx";
	public static Logger logg = Logger.getLogger(Adactin_Runner.class);
	
	public static void main(String[] args) throws Exception 
	{
		PropertyConfigurator.configure("log4j.properties");
		
		getUrl("https://adactinhotelapp.com/");
		implicitWait(10, TimeUnit.SECONDS);
		logg.info("URL Launched");
		
		//inputValueElement(pom1.getInstance_Log().getUser(), "rathidhana20");
		inputValueElement(pom1.getInstance_Log().getUser(), adactin_Particular_Cell_Data(path, 2, 5)); 
		inputValueElement(pom1.getInstance_Log().getPass(), adactin_Particular_Cell_Data(path, 2, 9));
		clickonElement(pom1.getInstance_Log().getLogin());
		logg.info("Credentials Entered in field");
		
		logg.info("Searching the Hotel");
		inputValueElement(pom1.getInstance_Search().getLocation(), adactin_Particular_Cell_Data(path, 3, 5));
		inputValueElement(pom1.getInstance_Search().getHotels(), adactin_Particular_Cell_Data(path, 4, 5));
		inputValueElement(pom1.getInstance_Search().getRoomtype(), adactin_Particular_Cell_Data(path, 5, 5));
		inputValueElement(pom1.getInstance_Search().getRoomno(), "5 - Five");
		inputValueElement(pom1.getInstance_Search().getDatepickin(), "03/03/2022");
		inputValueElement(pom1.getInstance_Search().getDatepick_out(), "05/03/2022");
		inputValueElement(pom1.getInstance_Search().getAdultroom(), "2 - Two");
		inputValueElement(pom1.getInstance_Search().getChildroom(), "2 - Two");
		clickonElement(pom1.getInstance_Search().getSubmit());

		clickonElement(pom1.getInstance_Sel().getRadio());
		clickonElement(pom1.getInstance_Sel().getCon());
		logg.info("Hotel Selected Successfully");
		
		inputValueElement(pom1.getInstance_Book().getFname(), adactin_Particular_Cell_Data(path, 14, 5));
		inputValueElement(pom1.getInstance_Book().getLname(), adactin_Particular_Cell_Data(path, 15, 5));
		inputValueElement(pom1.getInstance_Book().getAddress(), adactin_Particular_Cell_Data(path, 16, 5));
		inputValueElement(pom1.getInstance_Book().getCcnum(), "1234567891111110");
		inputValueElement(pom1.getInstance_Book().getCctype(), adactin_Particular_Cell_Data(path, 18, 5));
		inputValueElement(pom1.getInstance_Book().getCcmonth(), adactin_Particular_Cell_Data(path, 19, 5));
		inputValueElement(pom1.getInstance_Book().getCcyear(), adactin_Particular_Cell_Data(path, 19, 9));
		inputValueElement(pom1.getInstance_Book().getCvv(), adactin_Particular_Cell_Data(path, 20, 5));
		clickonElement(pom1.getInstance_Book().getBook());
		logg.info("Hotel Booked Successfully");
		 
		clickonElement(pom1.getInstance_Itin().getIti());
		 
		 takeScreenshot("C:\\Users\\Muthu\\eclipse-workspace\\March_First\\ScreenShot_Maven\\adactin.png");
		 
		 clickonElement(pom1.getInstance_Out().getLogout());
	}

}
