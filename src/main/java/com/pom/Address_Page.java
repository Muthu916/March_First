package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Page 
{
	public WebDriver driver;
	
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private WebElement ptc2;

	public Address_Page(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPtc2() 
	{
		return ptc2;
	}
	
	
	
}
