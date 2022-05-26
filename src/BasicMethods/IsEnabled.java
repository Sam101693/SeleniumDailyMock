package BasicMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsEnabled
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://faculty.washington.edu/chudler/java/boxes.html");
		
		WebElement checkbox1 = driver.findElement(By.xpath("(//*[@type='checkbox'])[1]"));
		
		Thread.sleep(50000);
		
		checkbox1.click();
		
		boolean status_of_checkbox1 =checkbox1.isDisplayed();

		System.out.println("Status of Checkbox1 = "+status_of_checkbox1);
		
		
	}//main method

}//class
