package testng;

import org.testng.annotations.Test;

public class Grouping1 
{
	
	@Test(groups = "Smoke")
	public void login()
	{
		System.out.println("Login(Grouping1) Page Executed!! from SmokeGroup");	
	}
	

	@Test(groups = "Regresion")
	public void logout()
	{
		System.out.println("Logout(Grouping1) Page Executed!!! from RegresionGroup");
	}
	
	@Test(groups = "Sanity")
	public void dashboard()
	{
		System.out.println("Dashboard(Grouping1) Page Executed!!! from SanityGroup");
	}
	
	@Test(groups = "Sanity")
	public void home()
	{
		System.out.println("Home(Grouping1) Page Executed!!! from SanityGroup");
	}



}
