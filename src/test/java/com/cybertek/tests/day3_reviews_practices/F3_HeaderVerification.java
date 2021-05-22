package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F3_HeaderVerification {
    public static void main(String[] args) {

        /*
        TC #3: Facebook header verification
        1.Open Chrome browser
        2.Go to https://www.facebook.com
        3.Verify header text is as expected:
        Expected: “Connect with friends and the world around you on Facebook.”
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        WebElement header = driver.findElement(By.className("_8eso"));
        String expectedHeader = "Connect with friends and the world around you on Facebook.";
        String actualHeader = header.getText();
        //-->create web element <-- getting the text

        if(actualHeader.equals(expectedHeader)){
            System.out.println("Header verification passed");
        }else{
            System.out.println("Header verification failed");
        }
    }

}
