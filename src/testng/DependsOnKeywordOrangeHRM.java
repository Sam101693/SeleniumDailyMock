package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class DependsOnKeywordOrangeHRM 
{
	
	static WebDriver driver;
	
	Actions act;
		
	@Test(priority = 1)
	public void login()
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		//Username
		WebElement username = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		
		username.sendKeys("Admin");
		
		//Password
		WebElement pass = driver.findElement(By.xpath("//*[@id='txtPassword']"));
		
		pass.sendKeys("admin123");
		
		String username_text = username.getAttribute("value");
		
		String pass_text = pass.getAttribute("value");
		
		Reporter.log(username_text);
		
		Reporter.log(pass_text);
		
		//Pass
		if( (username_text.equals("Admin") && pass_text.equals("admin123")) )
		{
			//loginButton
			driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		}
		
		//Fail
		else
		{
			//loginButton
			driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
			org.testng.Assert.fail("Login Test Case Failed");
			Reporter.log(pass_text, true);
		}
		

		
	}//login
	
	@Test(priority = 2, dependsOnMethods = "login")
	public void logOut()
	{
		
		act = new Actions(driver);
		
		driver.findElement(By.xpath("//*[@id='welcome']")).click();
		
		WebElement logout =  driver.findElement(By.xpath("//*[text()='Logout']"));
		
		act.moveToElement(logout).click(logout).build().perform();

	}

}
