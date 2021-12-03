package com.ibm.LMS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LMS_Activity9 {

    public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	//Open the browser
	driver.get("https://alchemy.hguy.co/lms/");
	//Click on Contact link
     WebElement allcourses=driver.findElement(By.xpath("//a[contains(text(),'All Courses')]"));
     allcourses.click();
     
   //Unable to click on Course as it is greyed out
    }

}

