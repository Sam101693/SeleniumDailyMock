package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText 
{
	public static void main(String[] args) 
	{
		
		
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.xpath("//h2[@class=\"_8eso\"]")); //h2 element located
		
		String print_username = username.getText(); //h2's content stored in print_username
		
		System.out.println(print_username); //printing h2's content
		
		//driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys(print_username);

		
		for(int i=1;i<=2;i++)
		{
			driver.findElement(By.xpath("(//input[starts-with(@class,'inputtext _55r1 _6luy')])["+i+"]")).sendKeys(print_username);
		}
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.close();
		
	}//main
	

}//class
