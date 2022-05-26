package locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		
		//Syntax Xpath ---> //tagname[@attributename = 'attributevalue']
	
		
		/*
		
		driver.findElement(By.xpath("//input[@id = 'txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name = 'txtPassword']")).sendKeys("admin123");
				
		
		driver.findElement(By.xpath("//input[@class = 'button']")).click();
	
		*/
		
		
		
		
		//Indexing 
		
		driver.findElement(By.xpath("(//input[@name='username'])")).sendKeys("Bandya");
		
	//	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Baburao");
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Baburao");

		driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("Goa");
				
		Thread.sleep(2000);
		
		
		//text
		//driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		
		
		
		//contains
		
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("ViratMSK");
		
	}//main method

}//class
