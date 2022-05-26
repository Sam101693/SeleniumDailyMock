package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramBasic
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Instgram Home Page
		driver.get("https://www.instagram.com");
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Bandya");
		
		
		Thread.sleep(4000);
		
		driver.close();

		
		
	}//main method

}
