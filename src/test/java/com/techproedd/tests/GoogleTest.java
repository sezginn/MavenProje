package com.techproedd.tests;

import com.techproedd.pages.GooglePage;
import com.techproedd.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleTest extends TestBase {

    @Test
    public void aramaTesti(){
        driver.get("http://google.com");

        // GooglePage class'indan bir tane nesne olusturduk. Parametre olarak su an kullandigimiz driver'i gonderdik.
        GooglePage googlePage = new GooglePage(driver);

        googlePage.aramaKutusu.sendKeys("Selamlar..");

    }

}
