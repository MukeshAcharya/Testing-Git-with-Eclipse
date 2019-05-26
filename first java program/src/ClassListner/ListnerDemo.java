package ClassListner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
//import Screenshots.DefaultScreenshotDeclaration;

public class ListnerDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("This will perform after evry test method: "+result);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("This will perform when Test method will get Success: " +result );
		//DefaultScreenshotDeclaration.Scrneeshot();
		
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("This will perform when Test will get Fail: "+result);
		 
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("This will perform when Test step will get skipped: "+result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
