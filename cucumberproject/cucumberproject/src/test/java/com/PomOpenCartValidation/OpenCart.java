package com.PomOpenCartValidation;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenCart {
	WebDriver driver;
	homepage objhomepage;
	IphonePage objIphonePage;
	String price2,price1;
	
	@Before()
	public void before_test() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=common/home&language=en-gb");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor jss = (JavascriptExecutor)driver;
		jss.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);
	}
	
	@Given("user should open open_cart website")
	public void user_should_open_open_cart_website() {
		objhomepage=new homepage(driver);
		price1 = objhomepage.getPriceFromHome();
		objhomepage.clickiPhonee();
	}

	@When("Click on iphone image")
	public void click_on_iphone_image() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		objIphonePage=new IphonePage(driver);
		price2 = objIphonePage.getPriceFromHome();
	}

	@Then("aValidates the price of iphone from current page and dashboard")
	public void a_validates_the_price_of_iphone_from_current_page_and_dashboard() {
		Assert.assertEquals(price1, price2);
	}
	

}
