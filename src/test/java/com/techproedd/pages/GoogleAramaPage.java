package com.techproedd.pages;

import com.techproedd.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleAramaPage {
    public GoogleAramaPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy ( name = "q")
    public WebElement aramaKutusu;

    @FindBy ( tagName = "a" )
    public List<WebElement> tumLinkler;
}
