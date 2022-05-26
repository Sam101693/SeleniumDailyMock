package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkLocator 
{
	
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		
		//driver.findElement(By.linkText("Forgot your password?")).click();
		
		WebElement forget_password = 	driver.findElement(By.linkText("Forgot your password?"));
		forget_password.click();
		
		
	}//main method

}//class
