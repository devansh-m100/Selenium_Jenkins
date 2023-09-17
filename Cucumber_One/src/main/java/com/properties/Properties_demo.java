package com.properties;

import java.io.File;

import java.io.FileInputStream;

import java.time.Duration;

import java.util.Properties;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Properties_demo {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\dmahindrakar\\Desktop\\Expleo Java Training\\Selenium\\seleniumProject\\Selenium_Jenkins\\Cucumber_One\\src\\test\\resources\\Features\\Properties_demo.properties");

		FileInputStream fileinut = null;

		try {

			fileinut = new FileInputStream(file);

		} catch (Exception e) {

			e.printStackTrace();

		}

		Properties prop = new Properties();

		try {

			prop.load(fileinut);

		} catch (Exception e) {

			e.printStackTrace();
		}

	WebDriver driver = new ChromeDriver();

	driver.get(prop.getProperty("URL"));

	

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));

	driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));

	driver.findElement(By.xpath("//*[text()=\" Login \"]")).click();
	
	}
}