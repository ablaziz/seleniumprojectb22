package com.cybertek.tests.HomePractice.PracticeCybertek;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemove {
    public static void main(String[] args) {
        //Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // 2. Go to http://practice.cybertekschool.com/add_remove_elements
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        // 3. Click to “Add Element” button 50 times
        WebElement addElement =driver.findElement(By.xpath("//button[@ onclick='addElement()']"));

        for(int i =1; i<=50; i++){
            addElement.click();
        }
        // 4. Verify 50 “Delete” button is displayed after clicking.
        WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));
       List<WebElement> listOfDeleteButton = driver.findElements(By.xpath("//button[.='Delete']"));

        if(listOfDeleteButton.size() == 50){
            System.out.println("Delete button is displayed 50 times");
        }
        // 5. Click to ALL “Delete” buttons to delete them.
        for(WebElement button:listOfDeleteButton){
            button.click();
        }
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
        // USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }
}
