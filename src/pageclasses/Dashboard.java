package pageclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Dashboard 
{

	WebDriver driver;
	Actions act;
	WebElement getStarted;
	JavascriptExecutor jse;
	
	
	public Dashboard(WebDriver driver, JavascriptExecutor jse) 
	{
		
		this.driver = driver;
		this.jse = jse;
		
	}

	
	public void scrollToGetStarted()
	{
		
		getStarted = driver.findElement(By.xpath("//*[@type='button']"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].scrollIntoView()",getStarted);				
	}
	
	
	public void clickOnGetStarted() throws InterruptedException 
	{
		
		getStarted = driver.findElement(By.xpath("//*[@type='button']"));
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		getStarted.click();
		
		Thread.sleep(2000);
		
	}
	
	
	public void searchAShare() throws InterruptedException
	{
		
		act = new Actions(driver);
		
		WebElement share_search_box = driver.findElement(By.xpath("//*[@class='modal-container layer-2']//input[@type='text']"));
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		System.out.println("In searchAShare method");
		
		act.moveToElement(share_search_box).click().build().perform();
		
		share_search_box.sendKeys("tata");
		
		Thread.sleep(2000);
		
		WebElement tata_invest = driver.findElement(By.xpath("//*[text()='TATAINVEST']"));
		
		act.moveToElement(tata_invest).click().build().perform();
		
		
		WebElement close_buy_share_button = driver.findElement(By.xpath("//*[@class='positions-info-footer actions']//button[@class='button-outline']"));
		
		close_buy_share_button.click();
	
		//jse.executeScript("arguments[0].scrollIntoView()", close_buy_share_button);
		
		//jse.executeScript("arguments[0].scrollIntoView()", close_buy_share_button);
		
	}
	
	
	
}
