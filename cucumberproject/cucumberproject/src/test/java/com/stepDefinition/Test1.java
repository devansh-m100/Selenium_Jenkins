package com.stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test1 {
	WebDriver driver=new ChromeDriver();
	String URl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	
	
	@Given("user should be on {string} page")
	public void user_should_be_on_login_page(String URL) {
	   // driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get(URL);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(17));
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String s1,String s2) {
	    driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys(s1);
	    driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys(s2);
	}

	@When("click on login button")
	public void click_on_login_button() {
		 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		 
	}

	@Then("whether user successfully logged in")
	public void whether_user_successfully_logged_in() {
	    Assert.assertEquals(driver.getCurrentUrl(), URl);
	}
}
