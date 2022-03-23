package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyItinerary_Page 
{
	public WebDriver driver;
	@FindBy(id="my_itinerary")
	private WebElement iti;
	
	
	public MyItinerary_Page(WebDriver driver2) 
	{
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}


	public WebElement getIti() 
	{
		return iti;
	}
	
	

}
