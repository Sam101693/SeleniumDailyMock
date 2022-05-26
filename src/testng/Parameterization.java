package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization 
{
	

@Parameters({"username","password"})
@Test
public void login(String uname_value, String pass_value)
{
	
	System.setProperty("webdriver.chrome.driver", 
		"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");	
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();

	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	
	WebElement uname = driver.findElement(By.xpath("//*[@id='txtUsername']"));
	uname.sendKeys(uname_value);
	
	
	WebElement pass = driver.findElement(By.xpath("//*[@id='txtPassword']"));
	pass.sendKeys(pass_value);
	
	WebElement login_button = driver.findElement(By.xpath("//*[@id='btnLogin']"));
	login_button.click();
	
		
}//login

	
	
}//class
