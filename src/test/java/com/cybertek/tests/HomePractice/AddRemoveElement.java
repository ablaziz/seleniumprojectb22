package com.cybertek.tests.HomePractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddRemoveElement {
    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // 2. Go to http://practice.cybertekschool.com/add_remove_elements
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        // 3. Click to “Add Element” button
        driver.findElement(By.xpath("//button[@ onclick='addElement()']")).click();
        // 4. Verify “Delete” button is displayed after clicking.
        Thread.sleep(3000);
        WebElement deleteButton = driver.findElement(By.xpath("//button[@ class='added-manually']"));
        if(deleteButton.isDisplayed()){
            System.out.println("The delete button is displayed: Verification passed");
        }else {
            System.out.println("The delete button is not displayed: Verification failed");
        }
        // 5. Click to “Delete” button.
        deleteButton.click();
        // 6. Verify “Delete” button is NOT displayed after clicking.
        try {
            deleteButton.click();
            if(!deleteButton.isDisplayed()){
                System.out.println("The delete button is not displayed: Verification passed");
            }else {
                System.out.println("The delete button is not displayed: Verification failed");
            }

        }catch (StaleElementReferenceException exception){
            System.out.println("StaleElementReferenceException has been thrown.");
            System.out.println("It means element has been completely deleted from the html.");
            System.out.println("Delete button is not displayed. Verification passed");
        }





    }
}
