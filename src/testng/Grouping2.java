package testng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Grouping2
{
	
	@Test(groups = {"Smoke","Regresion"})
	public void login()
	{
		System.out.println("Login(Grouping2) Page Executed!! from SmokeGroup & RegresionGroup");	
	}
	

	@Test(groups = {"Regresion","Sanity"})
	public void logout()
	{
		System.out.println("Logout(Grouping2) Page Executed!!! from RegresionGroup & SanityGroup");
	}
	
	@AfterGroups(groups = {"Sanity","Smoke"})
	public void dashboard()
	{
		System.out.println("Dashboard(Grouping2) Page Executed!!! from SanityGroup & SmokeGroup");
	}
	
	@BeforeGroups(groups = {"Sanity","Smoke"})
	public void home()
	{
		System.out.println("Home(Grouping2) Page Executed!!! from SanityGroup & SmokeGroup");
	}



}
