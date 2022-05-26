package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingScreenshot
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		Thread.sleep(2000);
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		
		//String path = "C:\\Users\\DEMON\\eclipse-workspace\\Selenium_Basics_Daily_Mock\\Screenshot\\orangehrm.png";
		
		String path = System.getProperty("user.dir")+"\\Screenshot\\1.png";
		
		System.out.println("Value of Only getProperty = "+System.getProperty("user.dir"));
		
		System.out.println("Complete Path = "+path);
		
		
		File destination = new File(path);  //captured screenshot will be stored in the specified path
		
		FileHandler.copy(source, destination);
		
		driver.close();
		
				
	}//main method
	

}//class
