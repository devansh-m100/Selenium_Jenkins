package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/test/Resources/Features/OpenCart.feature"},
		glue = {"com.PomOpenCartValidation"},
		plugin = {"pretty","html:target/cucumber-report/Cucumber.html"},
		dryRun = false
		)
public class OpenCartRunner {

}
