package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//for(int i=3;i<=4;i++)
		//{
			//Thread.sleep(2000);
			//driver.findElement(By.xpath("(//input[contains(@type,'text')])["+i+"]")).sendKeys("Shyam");
		//}
		
		//starts-with(@attribute_name,'attribute_value')
		
		//driver.findElement(By.xpath("(//input[starts-with(@class,'inputtext _55r1')])[1]")).sendKeys("Vishvadeep");
		
		
		for(int i=1;i<=2;i++)
		{
			
			driver.findElement(By.xpath("(//input[starts-with(@class,'inputtext _55r1')])["+i+"]")).sendKeys("Vishvadeep");
			
		}//for
			
		
					
	}//main method

}//class
