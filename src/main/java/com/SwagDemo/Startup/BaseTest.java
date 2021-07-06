package com.SwagDemo.Startup;



import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.SwagDemo.Driver.DriverManagerTest;
import com.SwagDemo.Utils.ConfigReader;
import com.aventstack.extentreports.ExtentTest;

public class BaseTest {

	public static Logger log = Logger.getLogger(BaseTest.class);
	public static WebDriver driver;

	public static String suitname;
	public static ExtentTest test;
	public static String methodName;

	public static WebDriver getDriver() {

		return driver;
	}

	public static void setProperty() {
		PropertyConfigurator.configure("log4j.Properties");
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		
		ConfigReader reader = new ConfigReader();

		driver = new ChromeDriver();
		
		log.info("ChromeDriver is launched");
		DriverManagerTest.setWebDriver(driver);
		log.info("driver instance is set to the Threadlocal");
		getDriver().manage().window().maximize();
		System.out.println(reader.getProperty("url"));
		getDriver().get(reader.getProperty("url"));
		log.info("Successfully launched the Browers");

	}

	@BeforeSuite
	public void startup(ITestContext res) {

		setProperty();
		String suitName = res.getCurrentXmlTest().getSuite().getName();
		log.info("SuitName is: ---:>"+suitName);

	}

	@BeforeMethod
	public void methodName(Method method)
	{
		String testCasename = method.getName();

	}

	@AfterSuite
	public void TearDown() {
		log.info("Closing the browser");
		getDriver().quit();
	}

}
