package com.cybertek.tests.day6_testing_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class P0_Checkbox_Practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //1. Go to http://practice.cybertekschool.com/checkboxes
        driver.get("http://practice.cybertekschool.com/checkboxes ");
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        //2. Confirm checkbox #1 is NOT selected by default
        if (!checkbox1.isSelected()) {
            System.out.println("Checkbox1 is not selected. Verification passed");
        } else {
            System.out.println("Checkbox1 is selected. Verification failed");
        }
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        //3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());
        if (checkbox2.isSelected()) {
            System.out.println("Checkbox2 is selected. Verification passed");
        } else {
            System.out.println("Checkbox2 is not selected. Verification failed");
        }
        //4. Click checkbox #1 to select it.
        Thread.sleep(3000);
        checkbox1.click();
        checkbox2.click();
        checkbox1.click();
        //5. Click checkbox #2 to deselect it.
        //6. Confirm checkbox #1 is SELECTED.
        //7. Confirm checkbox #2 is NOT selected
        System.out.println("-------------After clicking-----------------------");
        if (checkbox1.isSelected()) {
            System.out.println("Checkbox1 is selected. Verification passed");
        } else {
            System.out.println("Checkbox2 is  selected.");
        }
        driver.close();

    }
}