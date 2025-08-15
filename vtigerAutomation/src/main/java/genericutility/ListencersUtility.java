package genericutility;


import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ListencersUtility extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		test=ereport.createTest(result.getName());
		test.log(Status.INFO,"Test execution started");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test script is failed");
		TakesScreenshot ts=(TakesScreenshot) driver;
		test.addScreenCaptureFromBase64String(ts.getScreenshotAs(OutputType.BASE64));
		
		try {
			wutil.getPhotos(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
