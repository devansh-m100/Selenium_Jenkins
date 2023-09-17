package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = {"src/test/Resources/Features/CucumberTest1.feature"},
		glue = {"com.stepdefination"},
		plugin = {"pretty","json:target/cucumber-reports/cucumber.json"},

		monochrome=true,
		dryRun = false

		)

public class Runner1 {

}