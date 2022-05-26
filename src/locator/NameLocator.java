package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator 
{
	
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver"
				, "E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		//username field
		
		WebElement username = driver.findElement(By.name("txtUsername"));
		username.sendKeys("Admin");
		
		//password field
		
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		
		
		//login button
		
		WebElement login_button = driver.findElement(By.name("Submit"));
		login_button.click();
		
		
		
		
	}//main method

}//class
