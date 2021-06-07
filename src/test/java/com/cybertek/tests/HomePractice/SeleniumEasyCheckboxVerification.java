package com.cybertek.tests.HomePractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumEasyCheckboxVerification {
    public static void main(String[] args) {
        //1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // 2.Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        // 3.Verify “Success –Check box is checked” message is NOTdisplayed.
        WebElement successBox = driver.findElement(By.xpath("//input[@ type='checkbox'][1]"));
        if(!successBox.isSelected()){
            System.out.println("Success box not checked: verification passed");
        }else{
            System.out.println("Success box is checked: verification failed");
        }
        // 4.Click to checkbox under “Single Checkbox Demo” section
        successBox.click();
        WebElement afterClick = driver.findElement(By.xpath("//div[.='Success - Check box is checked']"));
        // 5.Verify “Success –Check box is checked” message isdisplayed.
        if(afterClick.isDisplayed()){
            System.out.println("Success –Check box is checked: verification passed");
        }else{
            System.out.println("Success –Check box is not checked: verification failed");
        }
    }
}
