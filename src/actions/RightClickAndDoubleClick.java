package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAndDoubleClick 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		Actions act = new Actions(driver);
		
		WebElement link_text = driver.findElement(By.linkText("Selenium"));
		
		//act.contextClick(link_text).perform();
				
		WebElement doubleclickbutton = driver.findElement(By.xpath("//*[@id='double-click']"));
		
		act.doubleClick(doubleclickbutton).perform();
		
	}//main method

}
