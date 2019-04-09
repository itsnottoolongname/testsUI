package io.redtrack.app.pages;

import io.redtrack.app.tests.RedtrackStatsTests;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    public LoginPage (WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;


    }
    public static final Logger logger = Logger.getLogger(RedtrackStatsTests.class.getSimpleName());
    public WebDriver driver;

    @FindBy(name = "login")
   public  WebElement loginField;

    @FindBy(name = "password")
    public WebElement passwordField;

    @FindBy(xpath = ".//*[normalize-space(text()) and normalize-space(.)='Your credentials'][1]/following::button[1]")
    public WebElement submitButton;




    public void inputLogin (String login){
        try {
            loginField.sendKeys(login);
        }
        catch(Throwable e){
            logger.error("Error logining"+ e);
        }
    }

    public void inputPassword (String password){
        passwordField.sendKeys(password);
    }

    public void clickSubmitButton(){
        submitButton.click();
    }



}
