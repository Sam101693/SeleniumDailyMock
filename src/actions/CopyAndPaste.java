package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPaste
{
	
public static void main(String[] args) throws InterruptedException 
{
		
	System.setProperty("webdriver.chrome.driver",
			"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/signup");
	
	WebElement first_name = driver.findElement(By.xpath("//*[@name='firstname']"));
	
	Actions act = new Actions(driver);
	
	//Select all Operation
	act.sendKeys(first_name, "Nilesh").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	
	Thread.sleep(2000);
	
	//Copy Operation
	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	
	Thread.sleep(2000);
	
	//Paste Operation
	act.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	
	Thread.sleep(2000);
	
	WebElement password = driver.findElement(By.xpath("//*[@name='reg_passwd__']"));
		
	//Cut Operation
	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).build().perform();
	
	Thread.sleep(2000);
	
	password.click();
	
	act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	
}//main method	

}//class
