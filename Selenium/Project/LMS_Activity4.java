package com.ibm.LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LMS_Activity4 {
public static void main(String[] args) 
{
	WebDriver driver = new FirefoxDriver();
	 String act_title,exp_title="Actionable Training";
	//Open the browser
	driver.get("https://alchemy.hguy.co/lms/");
	//Close the browser
	 WebElement firstinfo=driver.findElement(By.xpath("//h3[contains(text(),'Actionable Training')]"));
     //Print the title of the page
      act_title=firstinfo.getText().trim();
     System.out.println("Page Heading is: " + act_title);
     Assert.assertEquals(act_title, exp_title);   
 	driver.close();
     
}
}