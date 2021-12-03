package com.ibm.LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LMS_Activity6 {
public static void main(String[] args) 
{
	WebDriver driver = new FirefoxDriver();
	//Open the browser
	driver.get("https://alchemy.hguy.co/lms/");
	//Click on my account
	 WebElement myaccount=driver.findElement(By.linkText("My Account"));
	 myaccount.click();
     //Check the title of the page
	 String title = driver.getTitle();
     //Print the title of the page
     System.out.println("Page title is: " + title);
         //Assertion for page title
     Assert.assertEquals("My Account – Alchemy LMS", title);  
     System.out.println("Navigated to My Account page");
	//Click on Login button
     WebElement login=driver.findElement(By.linkText("My Account"));
     login.click();
    //Enter Username and Password
     WebElement username=driver.findElement(By.xpath("//input[@id='user_login']"));
     username.sendKeys("");
     WebElement password=driver.findElement(By.xpath("//input[@id='user_pass']"));
     password.sendKeys("");
   
     
}
}