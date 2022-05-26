package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypesOfLocators 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");
		
		Thread.sleep(3000);
		
		//Name Locator
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		
		firstname.sendKeys("Pandya");
		
		//ID Locator
		
		WebElement surname = driver.findElement(By.name("lastname"));
		
		surname.sendKeys("Panduuuuuuuuuu");
		
		//Class Locator
		
		WebElement mobileno = driver.findElement(By.name("reg_email__"));
		
		mobileno.sendKeys("100");
		
		Thread.sleep(2000);
		
		//LinkTest Locator
		
		WebElement already_sign_up = driver.findElement(By.linkText("Already have an account?"));
		
		already_sign_up.click();
		
		Thread.sleep(2000);
		
		//PartialLinkTest Locator
		
		WebElement forgot_password = driver.findElement(By.partialLinkText("Forgotten "));
		
		forgot_password.click();
		
		//ID Locator
		
		WebElement verify_element = driver.findElement(By.id("identify_email"));
		
		verify_element.sendKeys("Done");
		
		Thread.sleep(4000);
		
		driver.close();
				
	}//main method


}
