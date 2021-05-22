package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearchVerification {
    public static void main(String[] args) throws InterruptedException {

        /**
         * Open	a	chrome	browser
         * 2- Go	to:	https://google.com
         * 3- Write	“apple”	in	search	box
         * 4- Click	google	search	button
         * 5- Verify	title:
         * Expected:	Title	should	start	with	“apple”	word
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    Thread.sleep(3000);
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);

        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();

        if(actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");

        }
    }
}
