package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterClass 
{
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login Page Executed!!");	
	}
	
	@Test(priority = 3)
	public void buyShares()
	{
		System.out.println("Buy Shares Page Executed!!!");
	}
	
	@Test(priority = 2)
	public void home()
	{
		Reporter.log("Home Page Executed!!!", true);
	}
	
	@Test(priority = 4)
	public void logout()
	{
		System.out.println("Logout Page Executed!!!");
	}
	


}
