package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class testngsimplejavaclass implements ITestListener {
  @Test
  public void f() {
  }

public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestStart("On Test Start success");
}

public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestSuccess("On Test Success sucess");
}

public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestFailure("On Test Failure success");
}

public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestSkipped("On Test Skipped success");
}

public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	ITestListener.super.onStart("On Start success success");
}

public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	ITestListener.super.onFinish("On Finish success");
}
}
