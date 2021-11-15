package com.ibm.LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LMS_Activity2 {
public static void main(String[] args) 
{
	WebDriver driver = new FirefoxDriver();
	 String act_heading,exp_heading="Learn from Industry Experts";
	//Open the browser
	driver.get("https://alchemy.hguy.co/lms/");
	//Close the browser
	 WebElement heading=driver.findElement(By.xpath("//h1[contains(text(),'Learn from Industry Experts')]"));
     //Print the title of the page
      act_heading=heading.getText();
     System.out.println("Page Heading is: " + act_heading);
     Assert.assertEquals(act_heading, exp_heading);   
 	driver.close();
     
}
}