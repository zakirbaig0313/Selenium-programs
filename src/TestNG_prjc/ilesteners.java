package TestNG_prjc;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public abstract class ilesteners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("this start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("this start");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("this start");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("this start");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("this start");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("this start");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("this start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("this start");
	}

}
