package testng;

import org.testng.annotations.Test;

public class IncludeAndExclude 
{
	
	@Test()
	public void login()
	{
		System.out.println("Login Page Executed!!");	
	}
	

	@Test
	public void logout()
	{
		System.out.println("Logout Page Executed!!!");
	}
	
	@Test
	public void dashboard()
	{
		System.out.println("Dashboard Page Executed!!!");
	}



}
