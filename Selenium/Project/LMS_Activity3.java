package com.ibm.LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LMS_Activity3 {
public static void main(String[] args) 
{
	WebDriver driver = new FirefoxDriver();
	 String act_course,exp_course="Email Marketing Strategies";
	//Open the browser
	driver.get("https://alchemy.hguy.co/lms/");
	//Close the browser
	 WebElement firstinfo=driver.findElement(By.xpath("//h3[contains(text(),'Email Marketing Strategies')]"));
     //Print the title of the page
	 act_course=firstinfo.getText().trim();
     System.out.println("Page Heading is: " + act_course);
     Assert.assertEquals(act_course, exp_course);   
 	driver.close();
     
}
}