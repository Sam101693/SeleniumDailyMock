package testclasses;

import org.testng.annotations.Test;

public class DashboardTest extends BaseTest
{
	
	@Test(priority = 2)
	public void searchShares() throws InterruptedException
	{
		
		db.scrollToGetStarted();
		db.clickOnGetStarted();
		db.searchAShare();
	}

	
}
