package tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDropDownUsingArrowDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://zoom.us/signup");
		
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")).click();
		
		driver.findElement(By.xpath("//*[@id='select-0']")).click();
		
		List<WebElement> allmonth = driver.findElements(By.xpath("//*[contains(@id,'select-item-select-0-')]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
				
		WebElement aug_xpath = driver.findElement(By.xpath("(//*[@class='zm-scrollbar__bar is-vertical']//div[@class='zm-scrollbar__thumb'])[4]"));
		
		js.executeScript("arguments[0].scrollIntoView();",aug_xpath);
		
		for(WebElement month:allmonth)
		{
			
			String month_text = month.getText();
			
			System.out.println(month_text);
			
			Thread.sleep(2000);
			
			act.sendKeys(Keys.ARROW_DOWN).build().perform();
			
		}//for
		
	}//main method

}//class method
