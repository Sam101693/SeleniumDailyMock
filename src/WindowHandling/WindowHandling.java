package WindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling 
{
	
	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement gmail_link = driver.findElement(By.xpath("(//*[@class='gb_d'])[1]"));
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).click(gmail_link).keyUp(Keys.CONTROL).build().perform();
		
		
		//Returns Only Parent Window ID In String
		String parent_window_id = driver.getWindowHandle();
		
		System.out.println("Parent ID = "+parent_window_id);
		
		//Returns Multiple Windows ID including Parent ID in String
		Set<String> all_win_id = driver.getWindowHandles();
		
		System.out.println("Windows ID's Are = "+all_win_id);

		
		
		for(String win:all_win_id)
		{
			
			if(!(win.equals(parent_window_id)))
			{
				
				driver.switchTo().window(win);
				
			}//if
			
		}//for
		
		
		
		
	}//main method

}//class
