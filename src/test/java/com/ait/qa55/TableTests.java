package com.ait.qa55;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TableTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/css/css_table.asp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown(){

    }

    @Test
    public void findElementTableWithCssTest(){
        //print
        List<WebElement> tr = driver.findElements(By.cssSelector("tr"));
        System.out.println(tr.size());
        for (WebElement el:tr){
            System.out.println(el.getText());
            System.out.println("*************************");
            WebElement row4 = driver.findElement(By.cssSelector("tr:nth-child(4)"));
            System.out.println(row4.getText());
            WebElement tdchild = driver.findElement(By.cssSelector("tr:nth-child(7) td:nth-child(1)"));
            System.out.println("Result: " + tdchild.getText());
            //getLastElement
            WebElement lastchild = driver.findElement(By.cssSelector("tr:nth-child(8) td:last-child"));
            System.out.println("Result: " + lastchild.getText());


        }

    }

}
