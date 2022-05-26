package testng;

import org.testng.annotations.Test;

public class DPTestClass 
{
		
	@Test(dataProvider = "testdata",dataProviderClass = testng.DPClass.class)
	public void testCase(String uname, String password)
	{
		
		System.out.println(uname+" "+password);
		
	}//testCase
	
	
}
