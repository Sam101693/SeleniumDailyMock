package testng;

import org.testng.annotations.Test;

public class SingleClassExecution
{

	@Test(priority = 1, invocationCount = 3)
	public void testCase1()
	{
		System.out.println("Test Case 1 Executed");
	}
	
	
	@Test
	public void testCase0()
	{
		System.out.println("Test Case 0 Executed");
	}
	
	
	
}//class
