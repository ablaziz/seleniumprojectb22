package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahooPractice {
    public static void main(String[] args) {

        // setup web browser driver manager
        WebDriverManager.chromedriver().setup();
        //1. Open Chrome browser
        WebDriver driver= new ChromeDriver();

        //maximize driver
        driver.manage().window().maximize();
       // 2. Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");
        //3. Verify title:
        String expectedTitle = "Yahoo";
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        if(actualTitle==expectedTitle){
            System.out.println("Title is as expected. Verification passed");
        }else{
            System.out.println("Title is not as expected. Verification failed");
        }

        driver.close();


    }
}
