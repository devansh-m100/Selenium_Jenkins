package com.jenkins;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class loginpageFactory {
  @Test
  public void Login1() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	  PageFactory.initElements(driver, Loginpageobjects1.class);

	  Thread.sleep(7000);
	  Loginpageobjects1.username.sendKeys("Admin");
	  Loginpageobjects1.password.sendKeys("admin123");
	  Loginpageobjects1.login.click();
  }
}