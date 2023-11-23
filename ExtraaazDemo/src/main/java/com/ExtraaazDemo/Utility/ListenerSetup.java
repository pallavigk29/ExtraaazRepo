package com.ExtraaazDemo.Utility;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;

import com.ExtraaazDemo.testBase.TestBase;

public class ListenerSetup extends TestBase implements  ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		logger.info("Test case execution started:-"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		Util.takeScreenshotOfWebpage(result.getName());
		logger.info("Test case execution completed:-"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		Util.takeScreenshotOfWebpage(result.getName());
		logger.info("Test case execution Failed:-"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		logger.info("Test case execution skipped:-"+result.getName());
	}

}
