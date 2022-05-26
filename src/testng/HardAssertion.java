package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssertion 
{
	
	WebDriver driver;
	
	@Test
	public void login()
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		String curr_url = driver.getCurrentUrl();
		
		String expected = "orangehrm";
		
		boolean ispresent = curr_url.contains(expected);
		
	//	Assert.assertTrue(ispresent, "Test Case failed!!!");
		
	//	Assert.assertEquals(curr_url, expected);
				
		Assert.assertFalse(ispresent, "Test Case Failed");
		
		
	}
}
