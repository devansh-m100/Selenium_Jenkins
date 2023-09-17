package com.example.definition;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

 

public class RunnerClass {
	
	public class ValidateLoginRunner {

		@CucumberOptions(

				features = {"src/test/resources/Features/ValidateLogin.feature"},

				glue = {"com.example.definition"},

				plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

				dryRun = false)

		public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

		}
	}
}