package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShotMethod 
{
	
	public static void captureScreenShot(WebDriver driver,String filename) throws IOException, InterruptedException
	{
		
		TakesScreenshot screenshot = (TakesScreenshot)driver; //TypeCasting
		
		Thread.sleep(2000);
		
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		
		String path = System.getProperty("user.dir")+"\\Screenshot\\"+filename+".png";
		
		//"C:\Users\DEMON\eclipse-workspace\Selenium_Basics_Daily_Mock\Screenshot\Instagram.png"
		
		File destination = new File(path);
		
		FileHandler.copy(source, destination);
		
	}//captureScreenShot
	
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		captureScreenShot(driver,"Instagram");
		
		driver.get("https://www.google.com/");
		
		captureScreenShot(driver, "Google");
		
		driver.close();
		
	}//main
	
	
	

}//class
