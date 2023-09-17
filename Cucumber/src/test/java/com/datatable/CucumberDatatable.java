package com.datatable;

import java.time.Duration;
import java.util.List;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberDatatable {
	WebDriver driver = new ChromeDriver();
	@Given("browser should open saucedemo website")
	public void browser_should_open_saucedemo_website() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("https://accounts.saucelabs.com/am/XUI/#login/");
	}

	@When("user enters the credentials values")
	public void user_enters_the_credentials_values(io.cucumber.datatable.DataTable dataTable) {
	    List<List<String>> credentials = dataTable.cells();
	    int rows = dataTable.height();
	    int col = dataTable.width();

	    for (int i = 0; i < rows; i++) {
			driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.findElement(By.id("user-name")).sendKeys(credentials.get(i).get(0));
			driver.findElement(By.id("password")).sendKeys(credentials.get(i).get(1));
			driver.findElement(By.id("login-button")).click();
		}

	    		}

	@When("the user click and gets permitted to website")
	public void the_user_click_and_gets_permitted_to_website() {
	    // Write code here that turns the phrase above into concrete actions
	}
	@Then("validate login successfully")
	public void validate_login_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("browser closed");
		
	}
}