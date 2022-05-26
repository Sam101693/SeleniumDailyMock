package BasicMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		WebElement username = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		
		username.sendKeys("Viru");
		
		Thread.sleep(2000);
		
		username.clear();
		
		username.sendKeys("Admin");
		
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
		
		WebElement checkbox = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_63']"));
		
		Boolean element_status = checkbox.isEnabled();
		
		System.out.println("Status of CheckBox = "+element_status);
	
	}//main method

}//class
