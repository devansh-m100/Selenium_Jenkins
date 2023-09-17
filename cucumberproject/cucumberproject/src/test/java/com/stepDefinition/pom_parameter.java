package com.stepDefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.DataTable;

public class pom_parameter {
	WebDriver driver;

	@FindBy(xpath ="//*[@name=\"user-name\"]")
	WebElement username;

	@FindBy(xpath ="//*[@name=\"password\"]")
	WebElement password;

	@FindBy(xpath ="//*[@name=\"login-button\"]")
	WebElement login_btn;

	public void setUsername(String uname) {
		this.username.sendKeys(uname);
		System.out.println("usernmae :"+uname);
	}

	public void setPassword(String passw) {
		this.password.sendKeys(passw);
	}

	public void getLogin_btn() {
		this.login_btn.click();;
	}

	public pom_parameter(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void open_browser() {
		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	}
	
	public void close_driver() {
		driver.close();
	}
	
	public void validate_credentials_from_tables(io.cucumber.datatable.DataTable dataTable)throws InterruptedException {
		List<List<String>> credentials = dataTable.cells();
	    int width = dataTable.width();
	    int height = dataTable.height();
	    
	    for(int i=0; i<height;i++) {
	    	open_browser();
	    	String s1 = credentials.get(i).get(0);
	    	String s2 = credentials.get(i).get(1);
	    	setUsername(s1);
	    	setPassword(s2);
	    	getLogin_btn();
	    	Thread.sleep(2000);
	    	close_driver();
	    }
	}

	

}
