package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_Page 
{
	public WebDriver driver;
	
	@FindBy(xpath="//span[normalize-space()='I confirm my order']")
	private WebElement confirm;

	public Confirm_Page(WebDriver driver2) 
	{
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getConfirm() 
	{
		return confirm;
	}
	
	

}
