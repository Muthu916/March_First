package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Back2_Page 
{
	public WebDriver driver;

	@FindBy(xpath="//a[@title='Back to orders']")
	private WebElement back2;

	public Back2_Page(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBack2() 
	{
		return back2;
	}
	
	
}
