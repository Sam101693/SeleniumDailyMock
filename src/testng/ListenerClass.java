package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
	
		System.out.println("Test Case Started : "+result.getName());
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
		System.out.println("Test Case Passed = "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test Case Failed = "+result.getName());
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test Case Skipped = "+result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("Test Started = "+context.getName());
			
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("Test Completed = "+context.getName());
		
	}
	
	

}
