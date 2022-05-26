package testng;

import org.testng.annotations.Test;

public class ParallelTestClass2 
{
	
	
	@Test(priority = 3)
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
