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
    public void Console(){
        System.out.println("Done");
    }
}
