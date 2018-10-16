package io.redtrack.app.other;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class CheckingParam {

    public CheckingParam(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;

    @FindBy(xpath = ".//*[normalize-space(text()) and normalize-space(.)='Your credentials'][1]/following::div[5]")
    public WebElement InvalidCred;
    public String getInvalidCred(){
        String invalidCred = InvalidCred.getText();
        return invalidCred;
    }

    @FindBy(xpath = ".//*[normalize-space(text()) and normalize-space(.)='E-mail us support@redtrack.io'][1]/following::a[3]")
    public WebElement CheckOpenedPage;
    public String getCheckOpenedPage(){
        String checkOpenedPage = CheckOpenedPage.getText();
        return checkOpenedPage;
    }

    @FindBy(xpath = ".//*[normalize-space(text()) and normalize-space(.)='E-mail us support@redtrack.io'][1]/following::a[3]")
    public WebElement CheckOpenedPage2;
    public String getCheckOpenegPage2(){
        String checkOpenedPage2 = CheckOpenedPage2.getText();
        return checkOpenedPage2;
    }

    @FindBy(xpath = ".//*[normalize-space(text()) and normalize-space(.)='E-mail us support@redtrack.io'][1]/following::h1[1]")
    public WebElement CheckOpenedPage3;
    public String getCheckOpenedPage3(){
        String checkOpenedPage3 = CheckOpenedPage3.getText();
        return checkOpenedPage3;
    }

    @FindBy(linkText = "Bot Blacklist")
    public WebElement botBlacklist;
    public String getBotBlacklist(){
        String checkBotBlacklist = botBlacklist.getText();
        return checkBotBlacklist;
    }

    @FindBy(xpath = ".//*[normalize-space(text()) and normalize-space(.)='E-mail us support@redtrack.io'][1]/following::a[2]")
    public WebElement CheckOpenedPage0;
    public String getOpenedPage0(){
        String checkOpenedPage0 = CheckOpenedPage0.getText();
        return checkOpenedPage0;
    }

    @FindBy (id = "introduction")
    public WebElement CheckApiPage;
    public String getOpenedApiPage(){
        String checkOpenedApiPage = CheckApiPage.getText();
        return checkOpenedApiPage;
    }

    @FindBy(id = "user-nav-dropdown")
    public WebElement userProfile;
    public String getUserName(){
        String userName = userProfile.getText();
        return userName;
    }

    @FindBy(xpath = ".//*[normalize-space(text()) and normalize-space(.)='E-mail us support@redtrack.io'][1]/following::h5[1]")
    public WebElement CheckOpenedPage4;
    public String getOpenedPage4(){
        String checkOpenedPage4 = CheckOpenedPage4.getText();
        return checkOpenedPage4;
    }



}