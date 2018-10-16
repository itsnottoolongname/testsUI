package io.redtrack.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {

    public LoginPage (WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;


    }

    public WebDriver driver;

    @FindBy(name = "login")
   public  WebElement loginField;

    @FindBy(name = "password")
    public WebElement passwordField;

    @FindBy(xpath = ".//*[normalize-space(text()) and normalize-space(.)='Your credentials'][1]/following::button[1]")
    public WebElement submitButton;




    public void inputLogin (String login){
        loginField.sendKeys(login);
    }

    public void inputPassword (String password){
        passwordField.sendKeys(password);
    }

    public void clickSubmitButton(){
        submitButton.click();
        submitButton.click();
    }



}