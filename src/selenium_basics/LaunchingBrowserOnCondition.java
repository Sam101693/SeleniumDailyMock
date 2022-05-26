package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowserOnCondition 
{
	
	public static void main(String[] args) 
	{
		
		String browser_name = "Chrome";
		
		if(browser_name.equals("Chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver",
					"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
			
			
			
			WebDriver driver = new ChromeDriver();
			
			System.out.println("if executed");
			
		}//if
		
		else
		{
			
			System.out.println("else executed!!");
			
		}
		
	}//main method

}//class
