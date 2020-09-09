package com.techproedd.tests;

import com.techproedd.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class Ornek_Webtable extends TestBase {

    // 1. "http://fhctrip-qa.com/admin/HotelRoomAdmin" bu adrese gidiniz.
    // 2. Tbody'nin içerisinde kaç satır var, satır sayısını ekrana yazdırınız.
    //    tbody/tr -> findElements
    // 3. Üçüncü satırdaki verileri ekrana yazdırınız.
    //    tbody/tr[3]

    public void giris(){
        driver.get("http://fhctrip-qa.com/admin/HotelRoomAdmin");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!" + Keys.ENTER);
    }

    @Test
    public void test(){
        giris();
        List<WebElement> satirSayisi = driver.findElements(By.xpath("//tbody/tr"));
        System.out.println(satirSayisi.size());

    }

    @Test
    public void test1(){
        giris();
        List<WebElement> ucuncuSatirVerileri = driver.findElements(By.xpath("//tbody/tr[3]"));
        for (WebElement veri:ucuncuSatirVerileri){
            System.out.println(veri.getText());
        }
    }
}
