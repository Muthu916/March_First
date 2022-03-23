package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page 
{
	public WebDriver driver;
	
	@FindBy(xpath="//a[normalize-space()='Sign in']")
	private WebElement signin_Btn;

	public Home_Page(WebDriver driver2) 
	{
		this.driver=driver2;//assign the runner class driver to current class driver //get the browser configuration from runner class
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getSignin_Btn() {
		return signin_Btn;
	}
	
	

}
