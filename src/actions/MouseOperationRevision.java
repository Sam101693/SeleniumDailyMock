package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperationRevision 
{
	
	public static void main(String[] args) 
	{
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		Actions act = new Actions(driver);

		WebElement male_radio_button = driver.findElement(By.xpath("(//*[@class='_5k_2 _5dba'])[2]"));
		
		act.moveToElement(male_radio_button).click().build().perform();
		
		
		WebElement first_name = driver.findElement(By.xpath("//*[@name='firstname']"));
		
		act.moveToElement(first_name).click().sendKeys("Ramu").build().perform();
		
	
	}//main method
	
	
}//class
