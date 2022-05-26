package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait
{
	
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		WebElement disabled_button = driver.findElement(By.xpath("//*[@id='disable']"));
		
		WebElement enabled_button = driver.findElement(By.xpath("//*[@id='enable-button']"));
		
		enabled_button.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		wait.until(ExpectedConditions.elementToBeClickable(disabled_button));
		
		enabled_button.click();
		
		WebElement hidden_button = driver.findElement(By.xpath("//*[@id='hidden']"));
		
		WebElement visible_button = driver.findElement(By.xpath("//*[@id='display-other-button']"));
		
		visible_button.click();
		
		wait.until(ExpectedConditions.visibilityOf(hidden_button));
		
		visible_button.click();
		
		
	}//main method

}
