package waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWait 
{	
	
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
		WebElement hidden_button = driver.findElement(By.xpath("//*[@id='disable']"));
		
		org.openqa.selenium.support.ui.FluentWait<WebDriver> wait = 
				new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
													.withTimeout(Duration.ofSeconds(60))
													.pollingEvery(Duration.ofSeconds(10));
		
		
		wait.until(ExpectedConditions.elementToBeClickable(hidden_button));
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//*[@id='enable-button']")));
		
		WebElement disabled_button = driver.findElement(By.xpath("//*[@id='checkbox']"));
		
		disabled_button.click();
		
		WebElement disabled_check_box = driver.findElement(By.xpath("//*[@id='ch']"));
		
		wait.until(ExpectedConditions.elementToBeClickable(disabled_button));
		
		disabled_button.click();
		
		
	}//main method

}//class
