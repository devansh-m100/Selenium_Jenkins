package com.example.definition;

import com.example.utils.HelperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HookClass {

	@Before
	public static void setup() {
		HelperClass.setUpDriver();
	}
	@After
	public static void tearDown(Scenario scenario) {
		HelperClass.tearDown();
	}
}