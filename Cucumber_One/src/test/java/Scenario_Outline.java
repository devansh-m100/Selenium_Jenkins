import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Scenario_Outline {
	WebDriver driver;
	
	@Given("User is on Loginpage")
	public void user_is_on_loginpage() {
		driver = new ChromeDriver();
		System.out.println("Step 1: User is on Login Page..");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	@When("^User enters (.*) and (.*)$")
	public void user_enters_username_and_password(String Username, String password) {
		System.out.println("Step 2: Enter the Username and password..");
		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	@When("Click the login button")
}
