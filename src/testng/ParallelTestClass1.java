package testng;

import org.testng.annotations.Test;

public class ParallelTestClass1 
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

}
