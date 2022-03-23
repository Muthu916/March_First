package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLogout_Page 
{
	public WebDriver driver;
	
	@FindBy(id="logout")
	private WebElement logout;

	public AdactinLogout_Page(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogout() 
	{
		return logout;
	}
	
	

}
