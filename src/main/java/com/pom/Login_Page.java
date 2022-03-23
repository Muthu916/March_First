package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{
	public WebDriver driver;
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="passwd")
	private WebElement pwd;
	
	@FindBy(xpath="//span[normalize-space()='Sign in']")
	private WebElement signin1;

	public Login_Page(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getSignin1() {
		return signin1;
	}
	
	
	

}
