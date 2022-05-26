package handlingpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popups
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		//Handling Alert PopUp
		
		WebElement alertpopup =driver.findElement(By.xpath("//*[@name='alert']"));
		
		alertpopup.click();
		
		String popuptext = driver.switchTo().alert().getText();
		
		System.out.println("Alert Text is : "+popuptext);
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		
		Thread.sleep(2000);
		
		
		//Handling confirmation popup
		
		WebElement confirmation_pop_up = driver.findElement(By.xpath("//*[@name='confirmation']"));
		
		confirmation_pop_up.click();
		
		String confirmpopuptext = driver.switchTo().alert().getText();
		
		System.out.println("Confirmation Pop Up text : "+confirmpopuptext);
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
	}//main method
	

}//class
