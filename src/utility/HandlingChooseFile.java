package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChooseFile 
{
	
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		WebElement filechooser = driver.findElement(By.xpath("//*[@name='upload']"));
		
		filechooser.sendKeys("C:\\Users\\DEMON\\Desktop\\SQL-Cheat-Sheet.pdf");
		
		
				
	}//main method
	
	

}
