package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenersExample implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	System.out.println("test started");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test success");	
	}
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test skipped");
	}
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("test finished");
	}

}