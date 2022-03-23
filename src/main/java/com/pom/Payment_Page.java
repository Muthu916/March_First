package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page 
{
	public WebDriver driver;
	
	@FindBy(xpath="//p[@class='payment_module']")
	private WebElement payment;

	public Payment_Page(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPayment() {
		return payment;
	}

	
	
}
