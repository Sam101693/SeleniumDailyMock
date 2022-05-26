package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderHandling
{

	public static void main(String[] args) throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/slider/");
		
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		
		driver.switchTo().frame(iframe);
		
		WebElement slidebutton = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(slidebutton).moveByOffset(349, 0).release().build().perform();
		
		Thread.sleep(2000);
		
		act.clickAndHold(slidebutton).moveByOffset(-150, 0).release().build().perform();
		

	}//main method
	
	
}//main
