package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekPractice {

    public static void main(String[] args) throws InterruptedException {
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
        driver.get("https://google.com");

        // click to gmail from top right
        driver.findElement(By.linkText("Gmail")).click();

        //Verify Title contains
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if(actualTitle.contains(expectedTitle)){

        }
    }
}
