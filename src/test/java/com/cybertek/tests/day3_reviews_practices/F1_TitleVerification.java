package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1_TitleVerification {
    public static void main(String[] args) {

        /**
         * TC #1: Facebook title verification1
         * .Open Chrome browser2
         * .Go to https://www.facebook.com3
         * .Verify title: Expected: “Facebook -Log In or Sign Up”
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        String exceptedTitle = "Facebook - Log In or sign Up";
        String actualTitle = driver.getTitle();


    }
}
