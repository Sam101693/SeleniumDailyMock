package handlingdropdown;

import java.time.DayOfWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithSelect 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Facebook Sign Up Page
		driver.get("https://www.facebook.com/signup");
				
		driver.manage().window().maximize();

		WebElement daydropdown = driver.findElement(By.xpath("//*[@id='day']"));
		
		WebElement monthdropdown = driver.findElement(By.xpath("//*[@id='month']"));
		
		WebElement yeardropdown = driver.findElement(By.xpath("//*[@id='year']"));
		
		Select select_day = new Select(daydropdown);
		
		Select select_month = new Select(monthdropdown);

		Select select_year = new Select(yeardropdown);
		
		select_day.selectByVisibleText("16");  //selectByVisibleText 

		select_month.selectByValue("5");  //selectByValue
		
		select_year.selectByIndex(27);  //selectByIndex
		
		Thread.sleep(5000);
				
		driver.close();
		
	}//main method

}//class
