package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    WebDriver driver;
    @BeforeClass
    public void setupClass(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

    }
    @Test
    public void tc1_simple_dropdown_test(){

        //3.Verify “Simple dropdown” default selected value is correctExpected: “Please select an option”
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

       WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();

       String actualTextOfCurrentOption = currentlySelectedOption.getText();
       String expectedText = "Please select an option";

        Assert.assertTrue(actualTextOfCurrentOption.equals(expectedText));

       //Doing everything in one line
        //Assert.assertEquals(simpleDropdown.getFirstSelectedOption().getText(), "Please select an option");

        // 4.Verify“State selection” default selected value is correctExpected: “Select a State”
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String actualStateDropdownText = stateDropdown.getFirstSelectedOption().getText();
        String expectedStateDropdownText = "Select a State";

        //Assert.assertEquals(actualStateDropdownText,expectedStateDropdownText);
        Assert.assertTrue(actualStateDropdownText.equals(expectedStateDropdownText));

    }
    @Test
    public void tc2_state_dropdown_test() throws InterruptedException {
        //Locating state dropdown
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        //3.Select Illinois
        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Illinois");
        // 4.Select Virginia
        Thread.sleep(1000);
        stateDropdown.selectByValue("VA");
        // 5.Select California
        stateDropdown.selectByIndex(5);
        // 6.Verify final selected option is California
        // .Use all Select options.(visible text, value, index)

        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText,expectedOptionText,"Message to show if test fails");
    }
    @Test
    public void TC3_selecting_dates_dropdown(){
        //Select “December 1st, 1922” and verify it is selected
        // .Select year using: visible textSelect month using : value attributeSelect day using: index number
       WebElement selectYear =driver.findElement(By.id("year"));
       Select yearSelector = new Select(selectYear);
       yearSelector.selectByVisibleText("1922");
       String expectedYear = "1922";
       String actualYear = yearSelector.getFirstSelectedOption().getText();
       Assert.assertEquals(actualYear,expectedYear);

        WebElement selectMonth = driver.findElement(By.id("month"));
        Select monthSelector = new Select(selectMonth);
        monthSelector.selectByVisibleText("December");
        String actualMonth = monthSelector.getFirstSelectedOption().getText();
        String expectedMonth = "December";
        Assert.assertEquals(actualMonth,expectedMonth);

        WebElement selectDay = driver.findElement(By.id("day"));
        Select daySelector = new Select(selectDay);
        daySelector.selectByVisibleText("1");
        String actualDay = daySelector.getFirstSelectedOption().getText();
        String expectedDay = "1";
        Assert.assertEquals(actualDay,expectedDay);



    }
    @AfterClass
    public void teardownClass() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}
