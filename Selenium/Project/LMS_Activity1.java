package com.ibm.LMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LMS_Activity1 {

    public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	//Open the browser
	driver.get("https://alchemy.hguy.co/lms/");
	//Close the browser
	 String title = driver.getTitle();
     //Print the title of the page
     System.out.println("Page title is: " + title);
         //Assertion for page title
     Assert.assertEquals("Alchemy LMS – An LMS Application", title);   
	driver.close();
    }

}

