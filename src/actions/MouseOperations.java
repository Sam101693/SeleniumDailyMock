package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperations 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		Actions act = new Actions(driver);

		WebElement female_radio_button = driver.findElement(By.xpath("(//*[@class='_8esa'])[2]"));
		
		act.moveToElement(female_radio_button).perform();
		
		Thread.sleep(2000);
		
		female_radio_button.click();
		
		
	}//main method

}//class
