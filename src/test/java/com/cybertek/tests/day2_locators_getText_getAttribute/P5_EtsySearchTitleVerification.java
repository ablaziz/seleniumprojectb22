package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_EtsySearchTitleVerification {

    public static void main(String[] args) {
        /**
         * TC #1: Etsy Title Verification
         * 1. Open Chrome browser
         * 2. Go to https://www.etsy.com
         * 3. Search for “wooden spoon”
         * 4. Verify title:
         * Expected: “Wooden spoon | Etsy”
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");
        //SEARCH FOR WOODEN SPOON
        //first locate the search bar
        //2nd enter search value
        //3rd press enter

        driver.findElement(By.id("global-enhancements-search-query"))
                .sendKeys("wooden spoon" + Keys.ENTER);

        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Etsy Title verification passed!");
        }else{
            System.out.println("Etsy Title verification failed!");

        }

    }
}