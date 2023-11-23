package com.ExtraaazDemo.testBase;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase {
	public static WebDriver driver;
	public static Logger logger;
	
	
	@BeforeTest
	public void start()
	{
		logger = Logger.getLogger("Extraaaz Demo Framework");
		PropertyConfigurator.configure("Log4J.properties");
		
		logger.info("Framework Execution Started");
	}
	
	@AfterTest
	public void end()
	{
		logger.info("Framework Execution Ended");
	}
	
	@BeforeMethod
	public void setUp()
	{
		String br = "chroME";	
		
		if(br.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Please provide valid browser name");
		}
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.close();
	}
}


