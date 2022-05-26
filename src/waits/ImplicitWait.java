package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWait 
{
	
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("India");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.RETURN).build().perform();
		
		WebElement cbi_link = driver.findElement(By.xpath("//div[@class='yuRUbf']//*[text()='Central Bank of India']"));
		
		cbi_link.click();
		
		
	}//main method

}
