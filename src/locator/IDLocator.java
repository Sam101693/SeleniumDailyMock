package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocator 
{
	
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		
		//Username Field
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
		//Password Field
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		//Login Button
		WebElement login_button = driver.findElement(By.id("btnLogin"));
		login_button.click();
		
				
	}//main method
	
}//class
