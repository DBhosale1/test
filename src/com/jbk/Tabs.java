package com.jbk;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tabs {

	
		   public static void main(String[] args) {
			   
			      // Set Gecko Driver location.
			      System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			 
			      WebDriver driver = new FirefoxDriver();
			 
			      driver.get("http://www.stqatools.com");                       
			 
			      // Store all currently open tabs in tabs2
			      ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());                       
			 
			      // Click on link to open in new tab
			      driver.findElement(By.id("Url_Link")).click();
			 
			       // Switch newly open Tab
			       driver.switchTo().window(tabs2.get(1));                       
			 
			       // Perform some operation on Newly open tab
			       // Close newly open tab after performing some operations.
			       driver.close();
			 
			      // Switch to old(Parent) tab.
			      driver.switchTo().window(tabs2.get(0));
			      
			      //some changess
			  

	}

}
