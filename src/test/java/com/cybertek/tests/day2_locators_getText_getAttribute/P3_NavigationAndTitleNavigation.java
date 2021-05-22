package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleNavigation {
    public static void main(String[] args) {


/**
 1- Open a chrome browser
 2- Go to: https://google.com
 3- Click to Gmail from top right.
 4- Verify title contains:
 Expected: Gmail
 5- Go back to Google by using the .back();
 6- Verify title equals:
 Expected: Google
 */
        WebDriverManager.chromedriver().setup();

        //open chrome browser

        WebDriver driver = new ChromeDriver();

        //maximize the browser size
        driver.manage().window().maximize();
        // go to https://google.com
        driver.get("https://www.google.com");

        // click to gmail from top right
        driver.findElement(By.linkText("Gmail")).click();

        //Verify Title contains
        String expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedInTitle)) {
            System.out.println("Title verification passed");
        }else {
            System.out.println("Title verification failed");

            // go back to google.com
            driver.navigate().back();

            // verify title equals: expected tile: google
            String expectedGoogleTitle = "Google";
            String actualGoogleTitle = driver.getTitle();

            if(actualGoogleTitle.equals(expectedGoogleTitle)){
                System.out.println("Title verification passed");
            } else{
                System.out.println("Title verification failed");

            }


        }
    }
}