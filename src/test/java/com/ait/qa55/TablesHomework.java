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

public class TablesHomework {
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
    public void findElementTableWithCssHomeworkTest(){
        //print
        List<WebElement> tr = driver.findElements(By.cssSelector("tr"));
        System.out.println(tr.size());
        for (WebElement el:tr){
            System.out.println(el.getText());
            System.out.println("==============");
        }
        WebElement tdchild = driver.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(3)"));
        System.out.println("First country in this list is: " + tdchild.getText());

        WebElement tdchild2 = driver.findElement(By.cssSelector("tr:nth-child(3) td:nth-child(3)"));
        System.out.println("Second Counrtry in this list is: " + tdchild2.getText());

        WebElement trnthchild3 = driver.findElement(By.cssSelector("tr:nth-child(3)"));
        System.out.println(trnthchild3.getText());

        System.out.println("====All Countries ====");

        List<WebElement> countryCells = driver.findElements(By.xpath("//table[@id='customers']//tr/td[3]"));
        for (WebElement cell : countryCells) {
            System.out.println(cell.getText());
        }

        System.out.println("=== All members ===");

        List<WebElement> names = driver.findElements(By.xpath("//table[@id='customers']//tr/td[2]"));
        for (WebElement cell : names){
            System.out.println(cell.getText());
        }

        System.out.println("=== All companies ===");

        List<WebElement> companies = driver.findElements(By.xpath("//table[@id='customers']//tr/td[1]"));
        for (WebElement cell : names){
            System.out.println(cell.getText());
        }

        System.out.println("=== All Members from Germany ===");

        List<WebElement> allFromGermany = driver.findElements(By.xpath("//table[@id='customers']//tr[td='Germany']"));
        for (WebElement cell : allFromGermany){
            System.out.println(cell.getText());
        }

        System.out.println("=== All with I ===");

        List<WebElement> allWithI = driver.findElements(By.xpath("//table[@id='customers']//tr[td[contains(text(), 'i')]]"));
        for (WebElement cell : allWithI){
            System.out.println(cell.getText());
        }

        System.out.println("=== All with I ===");
        List<WebElement> allWithYo = driver.findElements(By.xpath("//table[@id='customers']//tr[td[contains(text(), 'Yo')]]"));
        for (WebElement cell : allWithYo){
            System.out.println(cell.getText());
        }

    }

}
