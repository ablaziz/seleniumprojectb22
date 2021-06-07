package com.cybertek.tests.day6_testing_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P03_AppleTask {
    public static void main(String[] args) throws InterruptedException {

        //TC #03: FINDELEMENTS_APPLE
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 1.Open Chrome browser
        // 2.Go to https://www.apple.com
        driver.get("https://www.apple.com");

        // 3.Click to all of the headers one by one
            //  Apple logo,Mac, iPad, iPhone, Watch, TV, Music, Support, search box
        //sorting 9 web elements including "apple logo and search box"
        List<WebElement> headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));
        for (int eachLink = 0; eachLink <headerLinks.size()-1 ; eachLink++) {
           // System.out.println(headerLinks.get(eachLink).getText());
            headerLinks.get(eachLink).click();

            Thread.sleep(3000);
            headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));
            // 4.Print out the titles of the each page
            System.out.println("Current title in the page = " + driver.getTitle());
            // 5.Print out total number of links in each page
            List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));

            System.out.println("Total number of links in current page = " + allLinks.size());

            // 6.While in each page:
            // a.Print out how many link is missing textTOTAL
            // b.Print out how many link has textTOTAL

            int linkWithNoText = 0;
            int linkWithText = 0;

            for (WebElement each : allLinks) {
                if(each.getText().isEmpty()){
                    linkWithNoText++;
                }else {
                    linkWithText++;
                }
            }
            System.out.println("Current page links with no text = " + linkWithNoText);
            System.out.println("Current page links with text = " +linkWithText);
            headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));
        }




    }
}
