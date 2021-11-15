package com.ibm.LMS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LMS_Activity8 {

    public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	//Open the browser
	driver.get("https://alchemy.hguy.co/lms/");
	//Click on Contact link
     WebElement contact=driver.findElement(By.xpath("//a[contains(text(),'Contact')]"));
     contact.click();
     WebElement fullname=driver.findElement(By.xpath("//input[@id='wpforms-8-field_0']"));
     fullname.sendKeys("Full Name");
     
     WebElement email=driver.findElement(By.xpath("//input[@id='wpforms-8-field_1']"));
     email.sendKeys("Email@gmail.com");
     
     WebElement subject=driver.findElement(By.xpath("//input[@id='wpforms-8-field_3']"));
     subject.sendKeys("subject");
     
     WebElement comment=driver.findElement(By.xpath("//textarea[@id='wpforms-8-field_2']"));
     comment.sendKeys("comment");
     
     WebElement sendmessage=driver.findElement(By.cssSelector("#wpforms-submit-8"));
     sendmessage.click();
     
     String expected="Thanks for contacting us! We will be in touch with you shortly.";
     WebElement verifymessage=driver.findElement(By.xpath("//p[contains(text(),'Thanks for contacting us! We will be in touch with')]"));
     Assert.assertEquals(verifymessage.getText(), expected);
     
     driver.close();
  
     
     
    }

}

