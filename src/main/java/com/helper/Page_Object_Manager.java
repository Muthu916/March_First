package com.helper;

import org.openqa.selenium.WebDriver;


import com.pom.Address_Page;
import com.pom.Back2_Page;
import com.pom.Back_Page;
import com.pom.Cart_Page;
import com.pom.Click_Shirt;
import com.pom.Confirm_Page;
import com.pom.Home_Page;
import com.pom.Login_Page;
import com.pom.Logout_Page;
import com.pom.Payment_Page;
import com.pom.Ship2_Page;
import com.pom.Shipping_Page;
import com.pom.Summary_Page;

public class Page_Object_Manager 
{
	public WebDriver driver;
	private Home_Page hp;//null
	private Login_Page login;//null
	private Back_Page back;//null
	private Click_Shirt sh;
	private Cart_Page cart;
	private Summary_Page sum;
	private Address_Page add;
	private Shipping_Page ship;
	private Ship2_Page ship2;
	private Payment_Page pay;
	private Confirm_Page con;
	private Back2_Page back2;
	private Logout_Page log;

	public Page_Object_Manager(WebDriver driver2) 
	{
		this.driver=driver2;
	}

	public Home_Page get_InstanceHp() 
	{
		hp = new Home_Page(driver);
		return hp;
	}
	
	public Login_Page get_InstanceLogin() 
	{
		login = new Login_Page(driver);//null object become an object
		return login;
	}
	
	public Back_Page get_InstanceBack() 
	{
		back = new Back_Page(driver);
		return back;
	}
	
	public Click_Shirt get_InstanceSh() 
	{
		sh = new Click_Shirt(driver); 
		return sh;
	}
	
	public Cart_Page get_InstanceCart() 
	{
		cart = new Cart_Page(driver);
		return cart;
	}
	
	public Summary_Page get_InstanceSum() 
	{
		sum = new Summary_Page(driver);
		return sum;
	}
	
	public Address_Page get_InstanceAdd() 
	{
		add = new Address_Page(driver);
		return add;
	}
	
	public Shipping_Page get_InstanceShip() 
	{
		ship = new Shipping_Page(driver);
		return ship;
	}
	
	public Ship2_Page get_InstanceShip2() 
	{
		ship2 = new Ship2_Page(driver);
		return ship2;
	}
	
	public Payment_Page get_InstancePay() 
	{
		pay = new Payment_Page(driver);
		return pay;
	}
	
	public Confirm_Page get_InstanceCon() 
	{
		con = new Confirm_Page(driver);
		return con;
	}
	
	public Back2_Page get_InstanceBack2() 
	{
		back2 = new Back2_Page(driver);
		return back2;
	}
	
	public Logout_Page get_InstanceLog() 
	{
		log = new Logout_Page(driver);
		return log;
	}
	

	
	
	
	
	

}
