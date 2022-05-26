package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlternativeSendKeys 
{
	
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement last_name = driver.findElement(By.xpath("//*[@name='lastname']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].value='Bandya';", last_name);
		
		
	}//main method

}//class
