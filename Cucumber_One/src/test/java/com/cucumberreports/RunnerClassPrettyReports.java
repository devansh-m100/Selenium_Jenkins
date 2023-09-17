package com.cucumberreports;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class RunnerClassPrettyReports {
	feature = {};
	@CucumberOptions(tags = "", 
			glue = "src/test/resources/Features/ScenarioOutline.feature",  
			plugin = {"pretty", "html:target/cucumber-reports/Cucumber.html"});
	

}
