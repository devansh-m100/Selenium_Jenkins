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

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@When("User provides username and password.")
	public void user_provide_username_and_password() {

	    // Write code here that turns the phrase above into concrete actions

	   driver.findElement(By.name("username")).sendKeys("Admin");

	   driver.findElement(By.name("password")).sendKeys("admin123");
	}
	
	@And("click on login button.")
	public void click_on_login_btn() {

	    // Write code here that turns the phrase above into concrete actions

	   driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	}

	@Then("Check whether user successfully returned on the login page.")

	public void validate_user_is_login() {

	    // Write code here that turns the phrase above into concrete actions

	    Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");

	}
}