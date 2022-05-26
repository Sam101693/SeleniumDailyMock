package testclasses;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pageclasses.Dashboard;
import pageclasses.GetConfigData;
import pageclasses.LoginPage;
import pageclasses.LoginPageAdvance;

public class BaseTest extends GetConfigData
{
	
	static WebDriver driver;
	LoginPageAdvance lp;
	Dashboard db;
	JavascriptExecutor jse;
	
	@BeforeSuite
	public void initiBrowser() throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(getValue("testsiteurl"));
		
		jse = (JavascriptExecutor)driver;
		
	}//initiBrowser
	
	/*
	@AfterSuite
	public void closeBrowser() throws InterruptedException
	{
		
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}
	*/
	
	
	@BeforeClass
	public void objectCreation()
	{
		lp = new LoginPageAdvance(driver);
		db = new Dashboard(driver, jse);
	}
	
	
	
	
	
	
	

}
