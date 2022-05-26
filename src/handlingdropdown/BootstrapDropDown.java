package handlingdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Facebook Sign Up Page
		driver.get("https://zoom.us/signup");
				
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		//PopUp Window
		driver.findElement(By.xpath("//*[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")).click();
		
		Thread.sleep(3000);
		
		//Month Dropdown
		driver.findElement(By.xpath("//*[@class='zm-select-scrollbar-fix zm-scrollbar']")).click();
		
		
		//Selects Month
		driver.findElement(By.xpath("//*[@id='select-item-select-0-11']")).click();
		
		Thread.sleep(3000);
		
		//Day DropDown
		driver.findElement(By.xpath("//*[@id='select-1']")).click();
		
		//Selects Day
		driver.findElement(By.xpath("//*[@id='select-item-select-1-15']")).click();
		
		Thread.sleep(3000);
		
		//Year DropDown
		driver.findElement(By.xpath("//*[@id='select-2']")).click();
		
		//Selects Year
		driver.findElement(By.xpath("//*[@id='select-item-select-2-106']")).click();
		
	}//main
	
	
}//class
