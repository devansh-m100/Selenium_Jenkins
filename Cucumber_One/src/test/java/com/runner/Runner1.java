package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = {"src/test/Resources/Features/outliers_cucumber.feature"},
		glue = {"multi_scenario_13_9_2023"},
		dryRun = false

		)

public class Runner1 {

}