package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
	
	public static void main(String[] args) {
		
		
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
		
		
		
		for(int i=1;i<=147;i++)
		{
			if(i==7 || i==10|| i==32|| i==41||i==50)
			{
				continue;
			}
			
			driver.findElement(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord_"+i+"')]")).click();
			System.out.println(i);
			
		}//for

		
		
	}//main

}//class
