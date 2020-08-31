package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Day10_ilkOdev {

    static WebDriver driver;

    @Before
    public void beforeMethod(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.bestbuy.com/");
    }

    @After
    public void afterMethod(){
        driver.quit();
    }

    @Test
    public void titleTest(){
        String sayfaBasligi = driver.getTitle();
        boolean bestKelimesiniIceriyorMu = sayfaBasligi.contains("Best");

        Assert.assertTrue(bestKelimesiniIceriyorMu);
    }

    @Test
    public void logoTest(){

        WebElement logoTest = driver.findElement(By.className("logo"));
        boolean gorunuyorMu = logoTest.isDisplayed();
        Assert.assertTrue(gorunuyorMu);
    }

    @Test
    public void test3(){

        WebElement mexicoLinkTest = driver.findElement(By.partialLinkText("Mexico"));
        boolean gorunuyorMu = mexicoLinkTest.isDisplayed();
        Assert.assertTrue(gorunuyorMu);
    }

    @AfterClass
    public static void tearDown(){
        //driver.quit();
    }

}

