package handlingpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://groww.in/");
		
		driver.findElement(By.xpath("//*[text()='Login/Register']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("ViratKohli@RCB.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='rodal-close']")).click();
		
		Thread.sleep(2000);

		
	}//main method

}//class
