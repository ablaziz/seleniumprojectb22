package com.cybertek.tests.HomePractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ApplePracticeUsingTestNG {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void appleTest() throws InterruptedException {
        driver.get("https://www.apple.com");
        // 3.Click to all of the headers one by one
        //  Apple logo,Mac, iPad, iPhone, Watch, TV, Music, Support, search box
        //sorting 9 web elements including "apple logo and search box"
        List<WebElement> headersLink = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a)"));
        for (int eachLink = 0; eachLink < headersLink.size() - 1; eachLink++) {
            headersLink.get(eachLink).click();
            Thread.sleep(1000);
            headersLink = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a)"));
            // 5.Print out total number of links in each page
            List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
            System.out.println("Total Number of link = " + allLinks.size());

            // 6.While in each page:
            // a.Print out how many link is missing textTOTAL
            // b.Print out how many link has textTOTAL
            int linkWithText = 0;
            int linkWithoutText = 0;

            for (WebElement each : allLinks) {
                if (each.getText().isEmpty()) {
                    linkWithoutText++;
                } else {
                    linkWithText++;

                    System.out.println("Number of links with text=" + linkWithText);
                    System.out.println("Number of links with no text=" + linkWithoutText);
                    headersLink = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a)"));

                }
            }

        }
    }

    @AfterClass
    public void teardownClass() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}