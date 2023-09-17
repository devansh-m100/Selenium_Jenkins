import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Hooks {
	WebDriver driver;

@Before("@T1")

public void before() {
	System.out.println("Before Test");
}

@Given("Browser opens")
public void browser_opens() {
	driver = new ChromeDriver();
}

@When("open google page")
public void open_google_page() {
	driver.get("https://www.google.com/");
}

@Then("validates title of the page with expected value")
public void validates_title_of_the_page_with_expected_value() {
	Assert.assertEquals("Google", driver.getTitle());
}

@After("@T1")

public void after() {
	System.out.println("After Test");
}

}