package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReader
{
	public static void main(String[] args) throws IOException
	{
	
		//Source of the file
		File src = new File("E:\\Selenium\\OrangeHRMTestData.xlsx");
				
		//To access the MS Excel File
		FileInputStream fis = new FileInputStream(src);
		
		//To access work book
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//To locate exact sheet of the workbook
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		
		//To access Sheet Data
		DataFormatter df = new DataFormatter();
		
		String username = df.formatCellValue(sh1.getRow(1).getCell(0));  //Admin
		
		String password = df.formatCellValue(sh1.getRow(1).getCell(1));  //admin123
		
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		WebElement uname = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		
		uname.sendKeys(username);
		
		WebElement pass = driver.findElement(By.xpath("//*[@id='txtPassword']"));
		
		pass.sendKeys(password);
		
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		
	}//main method

}
