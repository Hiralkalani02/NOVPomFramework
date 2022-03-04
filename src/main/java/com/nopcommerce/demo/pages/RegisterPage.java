package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;
    Utils utils;

    //1.Object repository in the form of By locators
    By gender = By.id("gender-female");
    By fName = By.id("FirstName");
    By lastName = By.id("LastName");
    By Days = By.name("DateOfBirthDay");
    By Months = By.name("DateOfBirthMonth");
    By Years = By.name("DateOfBirthYear");
    By email = By.id("Email");
    By company1 = By.id("Company");
    By password1 = By.id("Password");
    By confirmpwd = By.id("ConfirmPassword");
    By register1 = By.id("register-button");


    //2.Create constructor of page class
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        utils = new Utils(driver);
    }

    //Page actions/methods
    public void FillRegisterPage(String firstname, String lastname,
                                 String emailID, String company, String password, String confirmPassword)
    {
        utils.doClick(gender);
        utils.doSendKeys(fName, firstname);
        utils.doSendKeys(lastName, lastname);
        utils.selectValueFromDropDown(Days,"12" );
        utils.selectValueFromDropDown(Months, "January");
        utils.selectValueFromDropDown(Years, "1985");
        utils.doSendKeys(email, emailID);
        utils.doSendKeys(company1, company);
        utils.doSendKeys(password1, password);
        utils.doSendKeys(confirmpwd, confirmPassword);
        utils.doClick(register1);




}


}






