package BasicMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute 
{
	
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		WebElement username = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		
		username.sendKeys("ShrawaniNikhil");
		
		System.out.println(username.getAttribute("value"));
		
		String actual = username.getAttribute("value");
		
		System.out.println("Actual Value = "+actual);
		
		if(actual.equals("ShrawaniNikhil"))
		{
			
			System.out.println("!!!Value got Verified!!!!");
			
		}//if
		
		else
		{
			
			System.out.println("!!!Value did not verified!!!");
			
		}//else
		
		
		
		driver.get("https://meet.google.com/pyq-tmox-ovo");

		//to get the URL of the current page
		String current_url = driver.getCurrentUrl();
		
		System.out.println("Current URL = "+current_url);
		
		//to get the title of the page
		String title_of_the_page =driver.getTitle();
		
		System.out.println("Title of the Page = "+title_of_the_page);
		

	}//main
	
	
}//class
