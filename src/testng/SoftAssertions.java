package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions 
{
	
	WebDriver driver;
	
	@Test
	public void login()
	{
		
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String curr_url = driver.getCurrentUrl();
		
		//Boolean expected = curr_url.contains("googlepppp");
		
		SoftAssert sa = new SoftAssert();
				
		sa.assertEquals(curr_url, "nfkrjfri");
		
		sa.assertAll();
		
	}
	
}
