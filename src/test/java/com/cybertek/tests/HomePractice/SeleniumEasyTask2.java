package com.cybertek.tests.HomePractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumEasyTask2 {
    public static void main(String[] args) {
        //1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // 2.Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        // 3.Verify “Check All” button text is “Check All”
        WebElement checkAllButton = driver.findElement(By.xpath("//input[@type='button']"));
        String actualText = checkAllButton.getAttribute("value");
        String expectedText = "Check All";
        if(actualText.equals(expectedText)){
            System.out.println("check button Verification passed");
        }else{
            System.out.println("check button Verification failed");
        }
        // 4.Click to “Check All” button
        checkAllButton.click();
        // 5.Verify all check boxes are checked
        List<WebElement> checkBoxList = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for(WebElement checkbox:checkBoxList) {
            if (checkbox.isSelected()){
                System.out.println("Checkbox is selected: passed");
            }else{
                System.out.println("Checkbox is not selected:failed");
            }
        }
        // 6.Verify button text changed to “Uncheck All”
        String actualButtonTextAfterClick = checkAllButton.getAttribute("value");
        String expectedValueAfterClick = "Uncheck All";

        if(actualButtonTextAfterClick.equals(expectedValueAfterClick)){
            System.out.println("Final verification passed");
        }else{
            System.out.println("Final verification failed");
        }
    }
}
