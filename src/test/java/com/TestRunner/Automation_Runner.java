package com.TestRunner;

import java.io.File;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.Base_class.Base_Class;
import com.helper.Page_Object_Manager;
import com.pom.Address_Page;
import com.pom.Back2_Page;
import com.pom.Back_Page;
import com.pom.Cart_Page;
import com.pom.Click_Shirt;
import com.pom.Confirm_Page;
import com.pom.Home_Page;
import com.pom.Login_Page;
import com.pom.Logout_Page;
import com.pom.Payment_Page;
import com.pom.Ship2_Page;
import com.pom.Shipping_Page;
import com.pom.Summary_Page;
import java.lang.*;

public class Automation_Runner extends Base_Class
{ 	
	public static String path="C:\\Users\\Muthu\\eclipse-workspace\\March_First\\Test Case - Automation Practice - Final.xlsx";
	public static WebDriver driver = browser_Configuration("Chrome"); // null
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	public static Logger log = Logger.getLogger(Automation_Runner.class);
	
	public static void main(String[] args) throws Throwable, IllegalArgumentException
	{ 
		PropertyConfigurator.configure("log4j.properties");
		
		getUrl("http://automationpractice.com/index.php");
		implicitWait(30, TimeUnit.SECONDS); 
		log.info("URL Launch");
		
		clickonElement(pom.get_InstanceHp().getSignin_Btn());
		
		//inputValueElement(pom.get_InstanceLogin().getEmail(), "smkmuthu91@gmail.com");
		inputValueElement(pom.get_InstanceLogin().getEmail(), particular_Cell_Data(path,3,5));
		Thread.sleep(5000);
		
		//inputValueElement(pom.get_InstanceLogin().getPwd(), "123456");
		inputValueElement(pom.get_InstanceLogin().getPwd(), particular_Cell_Data(path,8,5));
		
		clickonElement(pom.get_InstanceLogin().getSignin1());
		Thread.sleep(5000);
		
		log.info("Credentials Entered in field");
		
		clickonElement(pom.get_InstanceBack().getStore());
		
		actionsClass(pom.get_InstanceSh().getShirt(), "click");
		
		actionsClass(pom.get_InstanceCart().getCart(), "click");
		
		//driver.switchTo().parentFrame();	
		explicitWait(pom.get_InstanceCart().getPtc(), 30);
		
		actionsClass(pom.get_InstanceSum().getPtc1(), "click");
		
		actionsClass(pom.get_InstanceAdd().getPtc2(), "click");

		actionsClass(pom.get_InstanceShip().getPtc3(), "click");
 
		actionsClass(pom.get_InstanceShip2().getAgree(),"click");

		actionsClass(pom.get_InstanceShip2().getPtc4(), "click");

		actionsClass(pom.get_InstancePay().getPayment(), "click");

		actionsClass(pom.get_InstanceCon().getConfirm(), "click");
		
		takeScreenshot("C:\\Users\\Muthu\\eclipse-workspace\\com.selenium.concepts\\Screenshot\\miniprojectend.png");

		actionsClass(pom.get_InstanceBack2().getBack2(), "click");
			
		takeScreenshot1("C:\\Users\\Muthu\\eclipse-workspace\\com.selenium.concepts\\Screenshot\\miniprojectable.png");

		actionsClass(pom.get_InstanceLog().getLogout(), "click");
	}
}
