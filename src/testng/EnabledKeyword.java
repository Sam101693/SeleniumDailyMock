package testng;

import org.testng.annotations.Test;

public class EnabledKeyword 
{
	
	
	@Test()
	public void login()
	{
		System.out.println("Login Page Executed!!");	
	}

	
	@Test(enabled = false)
	public void logout()
	{
		System.out.println("Logout Page Executed!!!");
	}


}
