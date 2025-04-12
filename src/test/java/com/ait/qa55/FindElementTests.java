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

public class FindElementTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public  void tearDown(){
        driver.quit();

    }

    @Test
    public void findElementByTagName(){
        WebElement h1 = driver.findElement(By.tagName("h1"));

        System.out.println(h1.getText());

        WebElement a = driver.findElement(By.tagName("a"));
        System.out.println(a.getText());

        List<WebElement> a1 = driver.findElements(By.tagName("a"));
        System.out.println(a1.size());


    }

    @Test
    public void findElementById(){
        WebElement city = driver.findElement(By.id("city"));
        System.out.println(city);
    }

@Test
    public void findElementsByClassName(){
        driver.findElement(By.className("header"));
        System.out.println(driver.findElement(By.className("header")).getText());

    }

    @Test
    public void findElementBySimpleLocators(){
        //by id
        driver.findElement(By.id("city"));
        //by className
        driver.findElement(By.className("header"));
        System.out.println(driver.findElement(By.className("header")).getText());
        // by Link
        driver.findElements(By.linkText("Let the car work"));
        //by partiaLink
        driver.findElements(By.partialLinkText("car"));





    }

    @Test

    public void findElementByCssSelector(){

        //tagName==css
        driver.findElement(By.cssSelector("h1"));

        //id -> css(#)
        driver.findElement(By.cssSelector("#city"));

        //driver.findElements(By.className("header"));

        driver.findElement(By.cssSelector(".header"));

    //[attr='value']

        driver.findElement(By.cssSelector("[href='/registration?url=%2Fsearch']"));
    // contains -> *
        driver.findElement(By.cssSelector("[href*='/registration']"));
        //start ->
        driver.findElement(By.cssSelector("[href^='/reg']"));
        //end ->
        driver.findElement(By.cssSelector("[href$='/search']"));

        driver.findElement(By.cssSelector("input#city"));

        driver.findElement(By.cssSelector("div.mobile-header"));

        driver.findElement(By.cssSelector("input#city[type='text']"));

    }
    //      //*[@attr='value']

    @Test
    public void findElementByXpatch(){
        //tag -> xpath //
        driver.findElement(By.xpath("//h1"));
        //id->xpath - //*[@id='value']
        //driver.findElement(By.cssSelector("#city"));
        driver.findElement(By.xpath("//input[@id='city']"));

        driver.findElement(By.xpath("//h2[contains(.,'Yalla')]"));

        driver.findElement(By.xpath("//h2[.='Type your data and hit Yalla!']"));

        driver.findElement(By.xpath("//label[starts-with(@for,'ci')]"));

        driver.findElement(By.xpath("//a[@class='navigation-link']/.."));

        driver.findElement(By.xpath("//h1/parent::*"));

        driver.findElement(By.xpath("//h1/ancestor::*"));

        driver.findElement(By.xpath("//h2/preceding-sibling::*"));








        
    }

}
