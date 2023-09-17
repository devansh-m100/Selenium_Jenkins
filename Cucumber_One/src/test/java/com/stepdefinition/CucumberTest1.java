package com.stepdefinition;

 
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

 
public class CucumberTest1 {

	WebDriver driver=new ChromeDriver();
	

	@Given("User should be on Login Page.")
	public void the_user_should_be_on_login_page() {

	    // Write code here that turns the phrase above into concrete actions
    System.out.println("User should be on Login Page.");

	}

	//This is the step definition, so since the step definition differs so it is not getting invoked.
	@When("^User provides (.*) and (.*).$")
	public void user_provide_username_and_password(String string1, String string2) {
      System.out.println("");
	   
	}
	
	@And("click on login button.")
	public void click_on_login_btn() {

	    // Write code here that turns the phrase above into concrete actions
          System.out.println("click on login button.");
	  
	}

	@Then("Check whether user successfully returned on the login page.")

	public void validate_user_is_login() {

	    // Write code here that turns the phrase above into concrete actions

	    System.out.println("Check whether user successfully returned on the login page.");
	}
}