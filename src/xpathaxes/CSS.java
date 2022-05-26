package xpathaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CSS 
{
	
	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.edge.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		//Username Field
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Ädmin");
		
		//Password Field
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		
		//LoginButton
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		

	}//main

}//class
