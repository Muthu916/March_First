package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ship2_Page 
{
	public WebDriver driver;
	
	@FindBy(name="cgv")
	private WebElement agree;
	
	@FindBy(xpath="(//span[normalize-space()='Proceed to checkout'])[2]")
	private WebElement ptc4;

	public Ship2_Page(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAgree() {
		return agree;
	}

	public WebElement getPtc4() {
		return ptc4;
	}
	
	
	
}
