package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

public class KeyboardActions
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		Actions act = new Actions(driver);  
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.TAB).perform();
		
		act.sendKeys(Keys.TAB).sendKeys("Nikhil").build().perform();  //First Name
		
		WebElement mobno = driver.findElement(By.xpath("//*[@name='reg_email__']"));
		
		Thread.sleep(2000);
		
		act.click(mobno).sendKeys("100").build().perform();  //Mobile Number
		
		

	}//main method

}//class
