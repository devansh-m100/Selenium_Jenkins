package multi_scenario_13_9_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class unit_testing {
	WebDriver driver=new ChromeDriver();
	String LoggedInURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	String FalseLoginURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@Given("login page should be visible")
	public void login_page_should_be_visible() {
		driver.get(FalseLoginURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(17));
	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String s1,String s2) {
		driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys(s1);
		driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys(s2);
	}


	@When("hit on login button")
	public void hit_on_login_button() {
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	}

	@Then("validate whether user successfully logged in")
	public void validate_whether_user_successfully_logged_in() {
		Assert.assertEquals(driver.getCurrentUrl(), LoggedInURL);
	}

	@Then("validate whether user has not logged in")
	public void validate_whether_user_has_not_logged_in() {
		Assert.assertEquals(driver.getCurrentUrl(), FalseLoginURL);
	}



}
