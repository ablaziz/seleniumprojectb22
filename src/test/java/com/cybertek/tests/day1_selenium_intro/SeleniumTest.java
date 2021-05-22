package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        //set up the webDriver manager manually
        WebDriverManager.chromedriver().setup();
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");

    // this is the line that is opening the chrome driver
    WebDriver driver = new ChromeDriver();

    driver.get("http://google.com");


    }
}

