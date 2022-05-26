package testclasses;

import java.io.IOException;

import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest
{
	
	@Test(priority = 1)
	public void verifyLogin() throws IOException
	{
		
		//Test Steps
		lp.enterCredentials();
		lp.clickOnLogin();
		lp.enterPin();
	}
	
	
}
