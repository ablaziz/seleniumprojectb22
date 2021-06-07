package com.cybertek.tests.HomePractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC1_SimpleDropDown {
    public static void main(String[] args) {
        //TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // 2.Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
        // 3.Verify “Simple dropdown” default selected value is correct Expected:
        // “Please select an option”
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        String expectedDropdown ="Please select an option";


        // 4.Verify“State selection” default selected value is correctExpected: “Select a State”
    }
}
