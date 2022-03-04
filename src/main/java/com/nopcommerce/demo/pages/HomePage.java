package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    WebDriver driver;
    Utils utils;
    By regButton = By.className("ico-register");


    public HomePage(WebDriver driver) {
        this.driver = driver;
        utils= new Utils(driver);
    }



    public void clickRG() {



        utils.doClick(regButton );

    }




}




