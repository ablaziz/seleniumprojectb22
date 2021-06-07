package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WindowPracticeClass {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");


    }
    @Test
    public void window_test(){
        //Printing out the window handle of the fist page opened
        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

        //4. Assert:	Title	is	“Practice”
        String actualTitleBeforeClick = driver.getTitle();
        String expectedTitleBeforeClick ="Practice";
        System.out.println("expectedTitleBeforeClick = " + expectedTitleBeforeClick);

        //5. Click	to:	“Click	Here” text
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        for(String windowHandle: driver.getWindowHandles()){
            driver.switchTo().window(windowHandle);
            System.out.println("Current title while switching = " + driver.getTitle());
        }


        //6. Switch	to	new	Window.

        String actualTitleAfterClick = driver.getTitle();
        System.out.println("actualTitleAfterClick = " + actualTitleAfterClick);
        //7. Assert:	Title	is	“New	Window”
    }
}