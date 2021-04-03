package com.SwagDemo.PageActions;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.SwagDemo.Objects.HomePageObjects;
import com.SwagDemo.Startup.BaseTest;

public class LoginActionsPage extends BaseTest {

	Logger log = Logger.getLogger(LoginActionsPage.class);
	
	
	public  void LoginActivites()
	{
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		HomePageObjects home = PageFactory.initElements(driver, HomePageObjects.class);
		
		home.username.click();
		home.username.sendKeys("standard_user");
		home.password.click();
		home.password.sendKeys("secret_sauce");
		home.loginButton.click();
	}
	
	
}
