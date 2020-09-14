package com.techproedd.smoketests;

import com.techproedd.pages.FacebookLoginPage;
import com.techproedd.utilities.ConfigurationReader;
import com.techproedd.utilities.TestBase;
import org.testng.annotations.Test;

public class FacebookLoginTest extends TestBase {

    @Test
    public void girisTesti(){
        driver.get("http://facebook.com");

        FacebookLoginPage loginPage = new FacebookLoginPage(driver);
        loginPage.emailKutusu.sendKeys(ConfigurationReader.getProperty("fb_email"));
        loginPage.sifreKutusu.sendKeys(ConfigurationReader.getProperty("fb_pass"));
    }

    @Test
    public void girisTesti1(){
        driver.get("http://fhctrip-qa.com/Account/LogOn?ReturnUrl=%2FAdmin%2FUserAdmin");


    }



}
