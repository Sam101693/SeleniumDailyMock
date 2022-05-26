package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser 
{
	
	public static void main(String[] args) 
	{
		
		//Chrome Browser web driver
		System.setProperty("webdriver.chrome.driver",  
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe"); //web driver path
				
		WebDriver driver = new ChromeDriver();  //constructor gets called automatically
							
	}//main method
	
}//class
