package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Day09_Assertion {

    private static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void test1(){
        driver.get("https://google.com");
        String title = driver.getTitle();

        // Test Case : Google.com'un basligi "Google Arama Sayfasi" olsun.

        Assert.assertEquals("Google Arama Sayfasi", title);

    }

    @Test
    public void test2(){
        driver.get("https://amazon.com");
        // Amazon.com'un basligi Amazon kelimesini iceriyor.
        String title = driver.getTitle();

        boolean iceriyorMu = title.contains("Amazon");  // "true" ya da "false"

        // boolean veri tipinde bir deger giriyoruz.
        Assert.assertTrue(iceriyorMu);   // Bunun True oldugunu dogrula.
    }

    @Test
    public void test3(){
        driver.get("https://facebook.com");
        String title = driver.getTitle();

        // Facebook.com'un title'i Youtube kelimesini icermesin.

        boolean iceriyorMu = title.contains("Youtube");
        Assert.assertFalse(iceriyorMu);   // False oldugunu dogrula.
    }

    @Test
    public void test4(){
        driver.get("https://google.com");
        String title = driver.getTitle();

        System.out.println("MERHABALAR...");

        Assert.assertEquals("Google Arama Sayfasi", title);

        // eger test basarisizsa icerisinde bulunulan testin kalan kismi calistirmiyor.
        System.out.println("TEST DOGRULAMA ISLEMI BITTI...");
    }

    @Test
    public void test5(){
        driver.get("http://facebook.com");
        String title = driver.getTitle();

        // Facebook.com'un title'ı Youtube kelimesini içermesin.
        boolean iceriyorMu = title.contains("Google");

        Assert.assertFalse(iceriyorMu); // False olduğunu doğrula.

        System.out.println("TEST DOĞRULAMA İŞLEMİ BİTTİ..");
    }


    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

}
