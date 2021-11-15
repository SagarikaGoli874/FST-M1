package com.ibm.LMS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LMS_Activity7 {

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
     WebElement allcourses=driver.findElement(By.linkText("All Courses"));
     allcourses.click();
     
     String _linktext = "See more..." ; 
     List<WebElement> _divs = driver.findElements(By.linkText(_linktext)); 
     int count = _divs.size(); 
     System.out.print("count is"+count);
     driver.close();
     
    }

}

