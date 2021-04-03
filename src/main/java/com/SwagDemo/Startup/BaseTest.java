package com.SwagDemo.Startup;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import com.SwagDemo.Utils.ConfigReader;

public class BaseTest {

	public static Logger log = Logger.getLogger(BaseTest.class);
	public static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setProperty() {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		ConfigReader reader = new ConfigReader();

		driver = new ChromeDriver();
		getDriver().manage().window().maximize();
		System.out.println(reader.getProperty("url"));
		getDriver().get(reader.getProperty("url"));
		log.info("Successfully launched the Browers");

	}

	@BeforeSuite
	public void startup() {

		setProperty();
	}

	@AfterSuite
	public void TearDown() {
		log.info("Closing the browser");
		getDriver().quit();
	}

}
