package testng;

import org.testng.annotations.Test;

public class Priority 
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
		System.out.println("Home Page Executed!!!");
	}
	
	@Test(priority = 4)
	public void logout()
	{
		System.out.println("Logout Page Executed!!!");
	}
	


}
