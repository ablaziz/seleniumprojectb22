package com.cybertek.tests.HomePractice.PracticeCybertek;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class com_ForgotPassword {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // 2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        // 3. Locate all the WebElements on the page using XPATH locator only (total of 6)
        // a. “Home” link
        WebElement homeLink = driver.findElement(By.xpath("//a[@ class = 'nav-link']"));
        // b. “Forgot password” header
        WebElement forgotPasswordHeader = driver.findElement(By.xpath("//h2[. = 'Forgot Password']"));
        // c. “E-mail” text
        WebElement emailText = driver.findElement(By.xpath("//label[.='E-mail']"));
        // d. E-mail input box
        WebElement emailInput = driver.findElement(By.xpath("//input[@ type='text']"));
        // e. “Retrieve password” button
        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@ id='form_submit']"));
        // f. “Powered by Cybertek School” text
        WebElement powerByCybertek = driver.findElement(By.xpath("//div[@ style='text-align: center;']"));

        // 4. Verify all WebElements are displayed.
        if(homeLink.isDisplayed() && forgotPasswordHeader.isDisplayed() && emailText.isDisplayed() && emailInput.isDisplayed()
                && retrievePasswordButton.isDisplayed() && powerByCybertek.isDisplayed()){
            System.out.println("All web elements are displayed: verification passed");
        }else{
            System.out.println("All web elements are not displayed: verification failed");
        }
    }
}
