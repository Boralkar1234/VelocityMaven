package utillity;

import java.io.IOException;
import java.util.Random;

import org.testng.ITestListener;
import org.testng.ITestResult;

import tests.BaseTest;

public class ListenersClass extends BaseTest implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		
		
		String testname =result.getName()+"_"+ Screenshots.CurrentDate();
		
		
		try {
			Screenshots.CaptureScreen(driver, testname);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	

}
