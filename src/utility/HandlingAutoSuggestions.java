package utility;


import java.util.List;

import javax.naming.directory.SearchResult;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class HandlingAutoSuggestions
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement  searchbox = driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
		
		Actions act = new Actions(driver);
		
		act.click(searchbox).sendKeys("India").build().perform();
		
		Thread.sleep(2000);
		
		List<WebElement> searchresults = driver.findElements(By.xpath
				("//*[@class='mkHrUc']//div[@class='pcTkSc']"));
		
		
		System.out.println("Nikhil");
		for(WebElement result : searchresults)
		{
			String value = result.getText();
			
			 System.out.println(value);
			
			if(value.equalsIgnoreCase("india vs sri lanka"))
			{
				
			 result.click();
			 break;
			 
			 
				
			}
			
			
		}
		
		
		
		
		
		
	}


}
