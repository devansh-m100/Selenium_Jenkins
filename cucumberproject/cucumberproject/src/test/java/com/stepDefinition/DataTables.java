package com.stepDefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class DataTables {
	WebDriver driver;
	pom_parameter pomobj;

	@Given("Browser should open saucedemo website")
	public void browser_should_open_saucedemo_website() {
		pomobj = new pom_parameter(driver);
	}

	@When("user enter the credential values")
	public void user_enter_the_credential_values(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		pomobj.validate_credentials_from_tables(dataTable);
	}


	@Then("valididate successfully login")
	public void valididate_successfully_login() {
		System.out.println("Validate successfull");
	}


}
