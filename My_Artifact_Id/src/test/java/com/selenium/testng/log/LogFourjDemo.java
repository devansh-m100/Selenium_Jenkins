package com.selenium.testng.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.Test;

public class LogFourjDemo {
  @Test
  public void f() {
	  
	  //created instance for Logger class - logger
	  //instantiation done
	  //here mind that .core is not to be used in import directly take Logger from log4j 
	  Logger logger = LogManager.getLogger(LogFourjDemo.class);
	  
	  System.out.println("Hello World....");
	  
	  //used multiple predefined methods in logger class - logger levels
	  
	  logger.error("This is an error");
	  
	  logger.warn("This is a warning");
	  
	  logger.fatal("This is a fatal");
	  
  }
}
