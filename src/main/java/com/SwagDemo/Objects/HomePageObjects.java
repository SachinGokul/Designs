package com.SwagDemo.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects {
	
	WebDriver driver;
	public HomePageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	@FindBy(xpath ="//*[@id='user-name']")
	public WebElement username;
	@FindBy(xpath ="//*[@id='password']")
	public WebElement password;
	
	
	//
	
	@FindBy(xpath ="//*[@id='login-button']")
	public WebElement loginButton;

}
