package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelBrowserExecution 
{
	
	
	//Launching Chrome Browser
	@Test
	public void chromeBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
	}
	
	//Launching MS Edge Browser
	@Test
	public void msEdge()
	{
		
		
		System.setProperty("webdriver.edge.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
	}
	
}
