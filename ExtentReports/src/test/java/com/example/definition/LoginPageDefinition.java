package com.example.definition;

import org.junit.Assert;

import com.actions.HomePageActions;
import com.actions.LoginPageActions;
import com.example.locators.LoginPageLocators;
import com.example.utils.HelperClass;

 

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

 

import lombok.experimental.Helper;

public class LoginPageDefinition {
	
	LoginPageActions objLogin = new LoginPageActions();
	HomePageActions objHome = new HomePageActions();
	
	@Given("user should be on URL page")
	public void user_should_be_on_url_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		HelperClass.openPage(string);
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		objLogin.login();
	}

	@When("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		objLogin.login();
	}

	@Then("whether user successfully logged in")
	public void whether_user_successfully_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(objHome.getHomePageText().contains("Dashboard"));
	}
}
