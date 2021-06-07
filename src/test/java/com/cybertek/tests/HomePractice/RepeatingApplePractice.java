package com.cybertek.tests.HomePractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RepeatingApplePractice {
    public static void main(String[] args) throws InterruptedException {
        //TC #03: FINDELEMENTS_APPLE
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // 2.Go to https://www.apple.com
        driver.get("https://www.apple.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 3.Click to all of the headers one by onea.Mac, iPad, iPhone, Watch, TV, Music, Support
        List<WebElement> headerLinks =driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));
        for(int eachLink =0; eachLink<headerLinks.size()-1; eachLink++){
            headerLinks.get(eachLink).click();
            Thread.sleep(1000);
          headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));
            // 4.Print out the titles of the each page
            System.out.println("Title = " + driver.getTitle());
            // 5.Print out total number of links in each page
        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
            System.out.println("Total links in each page = " + allLinks.size());

            // 6.While in each page:
            // a.Print out how many link is missing textTOTAL
            // b.Print out how many link has textTOTAL
            int linkWithText = 0;
            int linkWithNoText = 0;
            for(WebElement each: allLinks){
                if(each.getText().isEmpty()){
                    linkWithNoText++;
                }else{
                    linkWithText++;
                }
            }
            System.out.println("Number of links with text = " + linkWithText);
            System.out.println("Number of links with no text = " + linkWithNoText);
            headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));

        }



    }
}
