package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary_Page 
{
	public WebDriver driver;
	@FindBy(xpath="//span[normalize-space()='Proceed to checkout']")
	private WebElement ptc1;

	public Summary_Page(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPtc1() 
	{
		return ptc1;
	}
	
	
}
