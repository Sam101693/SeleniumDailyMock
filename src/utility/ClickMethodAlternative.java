package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethodAlternative
{
	
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement hindi_link = driver.findElement(By.xpath("//*[text()='हिन्दी']"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].click()", hindi_link);
		
		WebElement english_link = driver.findElement(By.xpath("//*[text()='English']"));
		
		jse.executeScript("arguments[0].click()", english_link);
		
		

	}//main

}
