package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleSuggestionHandling
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		Actions act = new Actions(driver);  
		
		Thread.sleep(2000);
		
		WebElement searchbar = driver.findElement(By.xpath("//*[@name='q']"));
		
		
		searchbar.sendKeys("Selenium");
		
		Thread.sleep(3000);
		
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		
		List<WebElement> suggestion_list = driver.findElements
				(By.xpath("//*[@class='mkHrUc']//div[@class='wM6W7d']")); 
		
		for(WebElement suggestion:suggestion_list)
		{
			
			String textdata = suggestion.getText();
			
			System.out.println(textdata);
			
			if(textdata.equals("selenium grid"))
			{
				
				act.sendKeys(Keys.RETURN).build().perform();
			
			}//if
			
			act.sendKeys(Keys.ARROW_DOWN).perform();
			
		
		}//for
		
		
		
		
		
		
		
		
	
	}//main method

}//class
