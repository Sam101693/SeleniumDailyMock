package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethodsForJava
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //Browser Launch
		
		driver.manage().window().maximize(); //Brower's window will fit_to_screen(maximize)
		
		driver.get("https://www.youtube.com/");//Youtube's link will be opened
		
		Thread.sleep(2000);
		
		driver.get("https://www.instagram.com/");
		
		driver.navigate().back();  //Will Navigate Backwards i.e https://www.youtube.com/
		
		Thread.sleep(2000);
		
		driver.navigate().forward(); //Will Navigate Forward i.e https://www.instagram.com/
		
		driver.navigate().refresh(); //refresh the page https://www.instagram.com/
		
		driver.close(); //Will close the current tab of the browser
					
	}//main method

}//class
