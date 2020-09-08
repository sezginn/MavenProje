package com.techproedd.tests;

import com.techproedd.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ornek_HotelOlusturma extends TestBase {

    @BeforeMethod
    public void giris(){

        driver.get("http://www.fhctrip-qa.com/admin/HotelAdmin/Create");
        
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!" + Keys.ENTER);

    }

    @Test
    public void hotelCreate(){

        driver.findElement(By.id("Code")).sendKeys("5599");
        driver.findElement(By.id("Name")).sendKeys("Ali");
        driver.findElement(By.id("Address")).sendKeys("Kirshendorfer weg 3");
        driver.findElement(By.id("Phone")).sendKeys("696565656");
        driver.findElement(By.id("Email")).sendKeys("jdasjdh@hotmail.com");

        Select select = new Select(driver.findElement(By.id("IDGroup")));
        select.selectByIndex(1);

        driver.findElement(By.id("btnSubmit")).submit();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement basariliYazisi =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("bootbox-body")));
        Assert.assertTrue(basariliYazisi.isDisplayed());
    }
}
