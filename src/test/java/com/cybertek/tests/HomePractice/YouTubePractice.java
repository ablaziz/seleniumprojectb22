package com.cybertek.tests.HomePractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YouTubePractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.youtube.com");
        driver.manage().window().maximize();
      WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
      searchBox.sendKeys("Burkina music");
      Thread.sleep(3000);
      searchBox.submit();
      Thread.sleep(3000);
      WebElement clip = driver.findElement(By.cssSelector(""));
      clip.click();

    }
}
