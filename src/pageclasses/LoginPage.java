package pageclasses;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	
	//Global variable
	WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
		
		this.driver = driver;
		
	}
	
	
	
	public void enterCredentials()
	{
				
		//Username
		WebElement username = driver.findElement(By.xpath("//*[@id='userid']"));
		username.sendKeys("DAA677");
		
		//Password
		WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
		password.sendKeys("Velocity@123");
		
	}//enterCredentials
		
		
	public void clickOnLogin()
	{
		
		
		//Login Button
		WebElement login_button = driver.findElement(By.xpath("//*[@type='submit']"));
		login_button.click();		
		
	}//clickOnLogin
	
		public void enterPin()
		{
			//Implicit wait applied for Entering Pin
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			//Pin
			WebElement pin = driver.findElement(By.xpath("//*[@id='pin']"));
			pin.sendKeys("866918");
			
			//Continue Button
			WebElement continue_button = driver.findElement(By.xpath("//*[@type='submit']"));
			continue_button.click();
			
		}//enterPin
		
				
		
	
	

}
