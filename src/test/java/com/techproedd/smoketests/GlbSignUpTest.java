package com.techproedd.smoketests;

import com.techproedd.pages.GlbSignUpPage;
import com.techproedd.utilities.ConfigurationReader;
import com.techproedd.utilities.Driver;
import org.testng.annotations.Test;

public class GlbSignUpTest {

    @Test
    public void test(){
        /*
         * 1. Adım : https://www.glbtrader.com/register-2.html adresine gidelim
         * 2. Adım : GlbSignUpPage class'ından nesne üretip, webelementleri kullanalım.
         * 3. Adım : İçerisine ekleyeceğimiz bilgileri (name, email, phone vs) yine
         *           ConfigurationReader kullanarak, properties file'dan alalım.
         * 4. Adım : Sign-Up butonuna tıklayalım.
         * 5. Adım : Success yazısını görüp görmediğimi Assert ile doğrulayalım.
         *
         */
        Driver.getDriver().get(ConfigurationReader.getProperty("glb_login"));

        GlbSignUpPage element = new GlbSignUpPage();
        element.emailKutusu.sendKeys(ConfigurationReader.getProperty("glb_email"));
        element.nameKutusu.sendKeys(ConfigurationReader.getProperty("glb_name"));
        element.telKutusu.sendKeys(ConfigurationReader.getProperty("glb_phone"));
        element.passwordKutusu.sendKeys(ConfigurationReader.getProperty("glb_sifre"));
        element.rePasswordKutusu.sendKeys(ConfigurationReader.getProperty("glb_sifre"));
        element.signUpButonu.click();

        // signUp butonuna tikladiktan sonra, Success! ! yazisini hemen alabilir miyim?
        System.out.println(element.basariliYazisi.getText());

    }
}
