package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations1
{
	
	
	//Annotations
	
	//1.@BeforeMethod
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method Executed");
	}
	
	//2.After Method
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method Executed");
	}
	
	//3.BeforeClass
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class Executed");
	}
	

	//4.AfterClass
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class Executed");
	}
	
	//5.BeforeTest
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test Executed");
	}
	
	//6.AfterTest
	@AfterTest
	public void afterTest() 
	{
		System.out.println("After Test Executed");
	}
	
	
	//7.BeforeSuite
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite Executed");
	}
	
	
	//8.AfterSuite
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite Executed");
	}

	
	
	//Test Cases
	
	@Test
	public void testCase1()
	{
		System.out.println("Test Case 1 Executed");
	}
	
	
	
	/*
	
	@Test
	public void testCase0()
	{
		System.out.println("Test Case 0 Executed");
	}

*/
}
