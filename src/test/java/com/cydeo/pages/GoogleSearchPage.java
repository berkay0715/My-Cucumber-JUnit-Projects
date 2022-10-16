package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    //create constructor
    // initialize the driver instance and this class'  instance using PageFactory.initsElements

    public GoogleSearchPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //We can start locating web elements using @FindBy annotation
    @FindBy(xpath = "//input[@class = 'gLFyf gsfi']")
    public WebElement searchBox;

    @FindBy(xpath = "//div[.='Accept all']")
    public WebElement AlertBox;

}
