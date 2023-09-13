package com.runner;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/Resources/Features/ScenarioOutline.feature"},
		glue = {"com."}
		)
public class Runner1 {

}
