package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnKeyword 
{
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login Page Executed!!");
	}
	
	@Test(priority = 2)
	public void dashboard()
	{
		System.out.println("Dashboard Page Executed!!!");
	}
	
	@Test(priority = 3)
	public void home()
	{
		System.out.println("Home Page Executed!!!");
		Assert.fail("Test Case failed!!!!");
	}
	
	@Test(priority = 4, dependsOnMethods = "home" )
	public void logout()
	{
		System.out.println("Logout Page Executed!!!");
	}

}
