package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bouncycastle.crypto.macs.SipHash128;

public class ExcelWriter
{

	public static void main(String[] args) throws IOException 
	{
		
		File src = new File("C:\\Users\\DEMON\\Desktop\\OrangeHRMTestData.xlsx");
		
		System.out.println(src);
		
		FileInputStream fis = new FileInputStream(src);
		
		System.out.println(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1;
		
		sh1 = wb.getSheetAt(2);
		
		File fout = new File("C:\\Users\\DEMON\\Desktop\\OrangeHRMTestData.xlsx");
				
		sh1.getRow(1).getCell(4).setCellValue("Nikhil");	
		
		FileOutputStream fos = new FileOutputStream(fout);
		
		wb.write(fos);
		
		wb.close();
			
	}//class
	
	
}//class
