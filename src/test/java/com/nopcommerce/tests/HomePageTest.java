package com.nopcommerce.tests;

import com.nopcommerce.demo.base.BasePage;
import com.nopcommerce.demo.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Properties;

public class HomePageTest {

    WebDriver driver;
    BasePage basePage;
    Properties prop;
    HomePage homePage;


    public void openBrowser() {
        basePage = new BasePage();
        prop = basePage.initialiseProperties();
        String browser = prop.getProperty("Browser");
        driver = basePage.initialiseDriver(browser);
        driver.get(prop.getProperty("url"));
        homePage = new HomePage(driver);


    }

     public void clickOnRegister(){
        homePage.clickRG();

     }



}









