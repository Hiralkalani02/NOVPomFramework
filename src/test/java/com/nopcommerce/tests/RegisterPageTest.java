package com.nopcommerce.tests;

import com.nopcommerce.demo.base.BasePage;
import com.nopcommerce.demo.pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Properties;

public class RegisterPageTest {
    WebDriver driver;
    BasePage basePage;
    Properties prop;
    RegisterPage registerPage;

    @BeforeTest
    public void openBrowser() {
        basePage = new BasePage();
        prop = basePage.initialiseProperties();
        String browser = prop.getProperty("Browser");
        driver = basePage.initialiseDriver(browser);
        driver.get(prop.getProperty("url"));
       registerPage = new RegisterPage(driver);
    }
        @Test
        public void RegisterFormTest(){
        registerPage.FillRegisterPage(prop.getProperty("Firstname"),prop.getProperty("Lastname"),
                prop.getProperty("Email"),prop.getProperty("CompanyName"),prop.getProperty("Password"),
                prop.getProperty("ConfirmPassword"));












        }

    }















