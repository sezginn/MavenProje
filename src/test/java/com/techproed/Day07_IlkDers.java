package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day07_IlkDers {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");

        WebElement aramaButonu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaButonu.sendKeys("samsung headphones" + Keys.ENTER);

        WebElement yazi = driver.findElement(By.xpath("//span[@dir='auto']"));
        System.out.println(yazi.getText());

        WebElement ilkUrun = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        System.out.println(ilkUrun.getText());
        //ilkUrun.click();

        List<WebElement> urun = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

        //urun.get(4).getText();   //5.urune gidebilirim bu sekilde

        for (WebElement w:urun){
            System.out.println(w.getText());
        }
    }
}
