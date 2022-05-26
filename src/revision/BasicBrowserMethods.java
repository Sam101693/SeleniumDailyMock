package revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicBrowserMethods
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		//get method
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		
		//forward method
		
		driver.navigate().forward();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
		//Back method
		
		driver.navigate().back();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		//refresh method
		
		driver.navigate().refresh();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(4000);
		
		driver.close();

		
	}//main method

}//class
