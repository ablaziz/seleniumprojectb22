package com.cybertek.tests;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YouTubePractice {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.youtube.com");
        driver.manage().window().maximize();
      driver.findElement(By.xpath("//input[@id='search']"));

    }
}
