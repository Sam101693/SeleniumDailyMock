package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		//Instagram Username
		
		WebElement username = driver.findElement(By.xpath("(//input[@class='_2hvTZ pexuQ zyHYP'])[1]"));
		
		username.sendKeys("RCB");
		
		//Instagram Password
		
		WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
		
		password.sendKeys("Pragti");
		
		//Login Button
		
		WebElement login = driver.findElement(By.xpath("(//button[@class='sqdOP  L3NKy   y3zKF     '])"));
		
		login.click();
		
		Thread.sleep(4000);
		
		driver.close();

	}//main method

}//class
