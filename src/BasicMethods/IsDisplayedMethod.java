package BasicMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod
{
	
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		WebElement element = driver.findElement(By.xpath("//*[@name='actionID']"));
		
		Boolean element_status = element.isDisplayed();
		
		System.out.println(element_status);
		
		WebElement username = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		
		Boolean username_status = username.isDisplayed();
		
		System.out.println("Username display status = "+username_status);
		
		WebElement csrf_token = driver.findElement(By.xpath("//*[@id='csrf_token']"));
		
		System.out.println("CSRF Display Status = "+csrf_token.isDisplayed());
		
	}

}
