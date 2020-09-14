package com.techproedd.tests;

import com.techproedd.pages.AmazonPage;
import com.techproedd.utilities.TestBase;
import org.testng.annotations.Test;

public class AmazonTest extends TestBase {

    @Test
    public void aramaTesti(){
        driver.get("http://amazon.com");
        AmazonPage amazonPage = new AmazonPage(driver);
        amazonPage.aramaKutusu.sendKeys("babyphone");
    }
}
