package com.jenkins;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;


public class Loginpageobjects1 {
	@FindBy(name="username")
	public static WebElement username;
	@FindBy(name="password")
	public static WebElement password;
	@FindBy(className="oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")
	public static WebElement login;

 

}