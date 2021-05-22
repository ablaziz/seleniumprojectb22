package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        // 1- setup the browser driver

        WebDriverManager.chromedriver().setup();

        //2- Create instance of selenium web driver

        WebDriver driver = new ChromeDriver();

        //this line will maximize the browser size
        driver.manage().window().maximize();

        driver.manage().window().fullscreen();

        //3- get the page for Tesla.com

        driver.get("https://www.tesla.com");
        System.out.println("Current Title: " + driver.getTitle());

        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //putting 3 seconds of wait/stops the code for 3 seconds
        Thread.sleep(3000);

        //Going back using navigation
        driver.navigate().back();

        //putting 3 seconds of wait/stops the code for 3 seconds
        Thread.sleep(3000);

        // going forward using navigation
        driver.navigate().forward();

        //putting 3 seconds of wait/stops the code for 3 seconds
        Thread.sleep(3000);

        //Refreshing the screen using navigation
        driver.navigate().refresh();

        //putting 3 seconds of wait/stops the code for 3 seconds
        Thread.sleep(3000);

        //going to another url using .to() method
        driver.navigate().to("https://www.google.com");

        System.out.println("Current Title: " + driver.getTitle());

        currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        // this method will close the current opened browser
        //it will only close 1 browser or tab
        driver.close();

        //this will close all the opened browsers or tabs within the same session.
        //it will kill the current session completely.
        driver.quit();





    }
}
