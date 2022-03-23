package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page 
{
	public WebDriver driver;
	
	@FindBy(name="Submit")
	private WebElement cart;

	@FindBy(xpath="//span[normalize-space()='Proceed to checkout']")
	private WebElement ptc;

	public Cart_Page(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCart() 
	{
		return cart;
	}

	public WebElement getPtc() 
	{
		return ptc;
	}
	
	
		
		

	}
	
	


