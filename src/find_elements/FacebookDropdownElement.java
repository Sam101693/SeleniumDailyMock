package find_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDropdownElement {
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		//Facebook Sign Up Page
		driver.get("https://www.facebook.com/signup");
				
		driver.manage().window().maximize();
		
		List<WebElement> daydropdown = driver.findElements(By.xpath("//*[@id='day']//option")); //Located Web Elements of Day
		
		List<WebElement> monthdropdown = driver.findElements(By.xpath("//*[@id=\"month\"]//option")); //Located Web Elements of Month
		
		List<WebElement> yeardropdown = driver.findElements(By.xpath("//*[@id=\"year\"]//option"));  //Located Web Elements of Year
		
		
		
		//Day Drop down
		for(WebElement day:daydropdown)
		{
			
			String d = day.getText(); //Single Day stored at each iteration
			
			System.out.println(d);
		
			if(d.equals("16"))
			{
			
				System.out.println("!!If executed!!");
				day.click();
				
			}//if
				
			
		}//for
		
		Thread.sleep(3000);
		
		//Month
		
		for(WebElement month:monthdropdown)
		{
			
			String month_data = month.getText();
			
			if(month_data.equalsIgnoreCase("May"))
			{
				
				month.click();
				
			}//if
			
		}//for
		
		
		Thread.sleep(3000);
		
		//Year
		
		for(WebElement year:yeardropdown)
		{
			
			String year_data = year.getText();
			if(year_data.equalsIgnoreCase("1995"))
			{
				
				year.click();
				
			}//if
			
			
		}//for
		
		
		Thread.sleep(5000);
		
		driver.close();
		
		
	}//main method

}//class
