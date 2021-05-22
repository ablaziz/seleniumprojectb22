package com.cybertek.tests.day1_selenium_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MorningPracticeUSCIS {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("https://www.cars.com");

        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.findElement(By.name("headerpro-sign-up")).click();
        driver.findElement(By.name("$ctrl.user.email")).sendKeys("nils@gmail.com");





    }
}
