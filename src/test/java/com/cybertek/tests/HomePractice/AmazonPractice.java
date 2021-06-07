package com.cybertek.tests.HomePractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AmazonPractice {
    public static void main(String[] args) {
        //1. Build the WebDriverManager and call Chrome Driver
        //
        //2. Go to Amazon.com
        //
        //3. Locate the amazon search bar
        //
        //4. Send "Wooden Spoon" and click search
        //
        //5. Check the title with if conditon
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.amazon.com");
      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("wooden spoon" + Keys.ENTER);
        String actualTitle = driver.getTitle();
        String expectedTitle = "wooden spoon";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title Verification passed");
        }else{
            System.out.println("Title Verification failed");

        }


    }
}
