package com.techproedd.tests;

import com.techproedd.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDownloadTest extends TestBase {   // DAY 15

    @Test
    public void dosyaVarMi(){
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));

        String kullaniciDosyaYolu = System.getProperty("user.dir");

        String pomXmlDosyaYolu = kullaniciDosyaYolu + "/pom.xml";

        boolean varMi = Files.exists(Paths.get(pomXmlDosyaYolu));

        Assert.assertTrue(varMi);
    }

    @Test
    public void dosyaUpLoad(){  // Bilgisayardan websayfasina dosya yukleme
        driver.get("http://the-internet.herokuapp.com/upload");
        WebElement dosyaSecmeButonu = driver.findElement(By.id("file-upload"));

        // yuklemek istedigimiz dosyanin, path(dosya yolunu) ekleyelim.
        dosyaSecmeButonu.sendKeys("C:\\Users\\sezgi\\Desktop\\new\\logo.png");

        WebElement uploadButonu = driver.findElement(By.id("file-submit"));
        uploadButonu.click();
        WebElement fileUploadedYazisi = driver.findElement(By.tagName("h3"));

        Assert.assertTrue(fileUploadedYazisi.isDisplayed());

        // BU TEST CALISMADI.
    }

    @Test
    public void dosyaDownload(){
        driver.get("http://the-internet.herokuapp.com/download");
        WebElement amsterdamLinki = driver.findElement(By.partialLinkText("Amsterdam.jpg"));
        amsterdamLinki.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        boolean varMi = Files.exists(Paths.get("C:\\Users\\sezgi\\Downloads\\Amsterdam.jpg"));
        Assert.assertTrue(varMi);
    }
}
