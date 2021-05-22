package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_ZeroBankHeaderTextVerification {
    public static void main(String[] args) {
/**
 * TC #1: Zero Bank header verification
 * 1. Open Chrome browser
 * 2. Go to http://zero.webappsecurity.com/login.html
 * 3. Verify header text
 * Expected: “Log in to ZeroBank”
 */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        //Verify header text
        //Expected: “Log in to ZeroBank”
        String expectedHeader ="Log in to ZeroBank";
        //1st step locate the web element
        //get the text of it using getText()
        // Webelement is like a variable. It is reusable
        WebElement actualHeader = driver.findElement(By.tagName("h3"));

       String actualHeaderText = actualHeader.getText();

       if(actualHeader.equals(expectedHeader)){
           System.out.println("Header verification passed");
       }else{
           System.out.println("Header verification failed");

       }

    }
}
