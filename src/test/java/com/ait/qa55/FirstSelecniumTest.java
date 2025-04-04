package com.ait.qa55;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSelecniumTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
      driver = new ChromeDriver();
      //driver.get("https://www.google.com");
      //driver.navigate().to("https://www.google.com");
        //maximize browser to windoiw
        driver.manage().window().maximize();
        driver.navigate().to("https://seferisrael.co.il");//with history

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        driver.navigate().refresh();
    }


    @Test
    public void openGoogleTest(){
        System.out.println("Hello");
    }

    @AfterMethod (enabled = false)
    public void tearDown(){

        //driver.quit();
        driver.close();
    }


}










