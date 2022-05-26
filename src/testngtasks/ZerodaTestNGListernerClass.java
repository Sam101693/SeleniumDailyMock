package testngtasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZerodaTestNGListernerClass 
{

	WebDriver driver;
	
	
	@Test(priority = 1)
	public void login()
	{
		
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("DAA677");
		
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Velocity@123");
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='pin']")).sendKeys("866918");
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
	}
	
	
	@Test(priority = 2)
	public void verifyTitle()
	{
		
		String actual_title = driver.getTitle();
		
		System.out.println("Actual Title = "+actual_title);
		
		String expected_title = "Dashboard";
		
		Assert.assertEquals(actual_title, expected_title);
		
	}
	
	
	
}
