package multi_scenario_13_9_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class outliers_cucumber {
	WebDriver driver=new ChromeDriver();
	String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	
	@Given("user should be on loginpage")
	public void user_should_be_on_loginpage() {
		driver.get(URL);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(17));
	}
	
	@When("^users enters (.*) and (.*)$")
	public void users_enters_admin1_and_admin1234(String s1,String s2) {
		 driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys(s1);
		 driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys(s2);
	}


	@When("click on login")
	public void click_on_login() {
		 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	}

	@Then("user land on home page")
	public void user_land_on_home_page() {
		Assert.assertEquals(driver.getCurrentUrl(), URL);
	}
}
