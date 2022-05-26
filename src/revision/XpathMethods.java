package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathMethods 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		WebElement admin_username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		
		admin_username.sendKeys("Admin");
		
		WebElement admin_pass = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		
		admin_pass.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		
		login.click();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");		
		
		//1.Indexing
		
		WebElement username =  driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		
		username.sendKeys("RohitSharma");
		
		Thread.sleep(2000);
		
		WebElement emp_name = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		emp_name.sendKeys("Mumbai Indians");
		
		Thread.sleep(1000);
		
		//2.text() method
		
		driver.findElement(By.xpath("(//*[text()='Admin'])[3]")).click();
		
		driver.navigate().back();
		
		//3.contains() method
		
		//driver.findElement(By.xpath("(//*[contains(@id,'ohrmList_chkSelectRecord_')])[4]")).click();
		
		//4.Dynamic Xpath
		
		for(int i=1;i<=47;i++)
		{
			driver.findElement(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord_"+i+"')]")).click();
			
		}//for
		
		
		
		Thread.sleep(4000);
		
		//driver.close();

		
	}//main

}//class
