package pageclasses;

import java.io.IOException;

import pageclasses.GetConfigData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAdvance extends GetConfigData
{

	
	//Global variable
	WebDriver driver;

	//(Global WebElements)
	
	//Username
	@FindBy(xpath = "//*[@id='userid']") WebElement username;
	
	//Password
	@FindBy(xpath = "//*[@id='password']") WebElement password;
	
	//Login Button
	@FindBy(xpath = "//*[@type='submit']") WebElement login_button;
	
	//Pin
	@FindBy(xpath = "//*[@id='pin']") WebElement pin;
	
	
	
	
	public LoginPageAdvance(WebDriver driver) 
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void enterCredentials() throws IOException
	{
				
		//Username
		//WebElement username = driver.findElement(By.xpath("//*[@id='userid']"));
		username.sendKeys(getValue("username"));
		
		//Password
		//WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
		password.sendKeys(getValue("password"));
		
	}//enterCredentials
		
		
	public void clickOnLogin()
	{
		
		
		//Login Button
		//WebElement login_button = driver.findElement(By.xpath("//*[@type='submit']"));
		login_button.click();		
		
	}//clickOnLogin
	
		public void enterPin() throws IOException
		{
			//Implicit wait applied for Entering Pin
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			//Pin
			//WebElement pin = driver.findElement(By.xpath("//*[@id='pin']"));
			pin.sendKeys(getValue("pin"));
			
			//Continue Button
			//WebElement continue_button = driver.findElement(By.xpath("//*[@type='submit']"));
			login_button.click();
			
		}//enterPin
		
						

}
