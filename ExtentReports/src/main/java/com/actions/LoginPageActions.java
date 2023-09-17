package com.actions;

 

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

 

import org.openqa.selenium.support.PageFactory;

import com.example.locators.LoginPageLocators;
import com.example.utils.HelperClass;

//import com.example.locators.LoginpageLocators;

 

public class LoginPageActions {
	LoginPageLocators loginpageloc = null;
	String strUserName, strPassword;

	public LoginPageActions() {
		this.loginpageloc = new LoginPageLocators();
		PageFactory.initElements(HelperClass.getDriver(), loginpageloc);
	}
	public void setUSerName(String strUserName) {
		loginpageloc.userName.sendKeys(strUserName);
	}
	public void setPassWord(String strPassWord) {
		loginpageloc.userName.sendKeys(strPassWord);
	}
	public void clickLogin() {
		loginpageloc.Login.click();
	}
	public void login() {
		File file = new File("C:\\Users\\hdhondge\\eclipse-workspace\\cucumber3\\src\\test\\resources\\data.properties");
		FileInputStream fileinput = null;	
		try {
			fileinput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop= new Properties();
		try {
			prop.load(fileinput);
		} catch (Exception e) {
			e.printStackTrace();			
		}
		strUserName = prop.getProperty(strUserName);
		strPassword = prop.getProperty(strPassword);

		this.setUSerName(strUserName);
		this.setPassWord(strPassword);
		this.clickLogin();


	}
}
