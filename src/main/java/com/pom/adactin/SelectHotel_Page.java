package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel_Page 
{
	public WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	
	@FindBy(id="continue")
	private WebElement con;

	public SelectHotel_Page(WebDriver driver2) 
	{
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadio() 
	{
		return radio;
	}

	public WebElement getCon() 
	{
		return con;
	}

	

}
