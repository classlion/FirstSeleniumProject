package com.ait.qa55;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeworkTest {
    WebDriver driver;

    @BeforeMethod

    public void SetUp(){
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://demowebshop.tricentis.com/");
    }

    @AfterMethod
    public  void tearDown(){
    }

    @Test
    public void FourAiprilHomework(){
        driver.findElement(By.className("bar-notification"));
        driver.findElement(By.className("footer"));
        driver.findElement(By.className("header"));
        driver.findElement(By.className("header-menu"));
        driver.findElement(By.className("rss"));
        driver.findElement(By.className("twitter"));
        driver.findElement(By.className("google-plus"));
        driver.findElement(By.className("youtube"));
        driver.findElement(By.id("mob-menu-button"));
        driver.findElement(By.id("ui-id-1"));
    };

    @Test
    public void SevenAprilHomework(){

        driver.findElements(By.cssSelector(".header"));
        driver.findElements(By.cssSelector(".footer"));
        driver.findElements(By.cssSelector(".h1"));
        driver.findElement(By.cssSelector("#mob-menu-button"));
        driver.findElement(By.cssSelector("#ui-id-1"));
        driver.findElement(By.cssSelector("[href$='/search']"));
        driver.findElement(By.cssSelector("[href^='/sea']"));
        driver.findElement(By.cssSelector("[href^='/Them']"));
        driver.findElement(By.cssSelector("img[src$='images/logo.png']"));
        driver.findElement(By.cssSelector("img[src$='png']"));
    }

    @Test
    public void TenthAprilHomework(){

    }
}
