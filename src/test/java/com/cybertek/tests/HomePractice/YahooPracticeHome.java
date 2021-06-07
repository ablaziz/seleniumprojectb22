package com.cybertek.tests.HomePractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooPracticeHome {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%22");
       String actualTile= driver.getTitle();
       String expectedTitle = "Yahoo";
       if(actualTile.equals(expectedTitle)){
           System.out.println("Title verification passed");
       }else{
           System.out.println("Title verification failed");
       }
        WebElement userName = driver.findElement(By.xpath("//input[@id='login-username']"));
       userName.sendKeys("batch22@yahoo.com");

       Thread.sleep(3000);
       driver.findElement(By.xpath("//input[@type='submit']")).click();

       WebElement passWord = driver.findElement(By.xpath("//input[@id='login-passwd']"));
       Thread.sleep(3000);
       passWord.sendKeys("Feb21@2021");

       driver.findElement(By.xpath("//div[@class='input-group password-container error blurred']")).click();
       Thread.sleep(3000);

    }
}
