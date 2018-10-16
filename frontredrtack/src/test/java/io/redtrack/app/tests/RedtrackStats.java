package io.redtrack.app.tests;

import io.redtrack.app.other.*;
import io.redtrack.app.pages.*;
import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.redtrack.app.variable.Variables;
import java.util.concurrent.TimeUnit;
import io.redtrack.app.messages.*;
import io.redtrack.app.errors.Err;
import io.redtrack.app.other.ForCheckingStats;

public class RedtrackStats {

    public WebDriver driver;
    public static LoginPage loginPage;
    public static CheckingParam checkingParam;
    public static Navigation navigation;
    public static OtherElements otherElements;
    public static ForCheckingStats checkingStats;

    private String
            windowHandle,
            CheckParam;


    @BeforeClass
    public void init() {
        Mess.newdDateInfo();
        Mess.initDriver();
        System.setProperty("webdriver.chrome.driver", "./src/Drivers/Chrome/chromedriver");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        checkingParam = new CheckingParam(driver);
        checkingStats = new ForCheckingStats(driver);
        navigation = new Navigation(driver);
        otherElements = new OtherElements(driver);
        windowHandle = driver.getWindowHandle();
        //driver.switchTo().window(windowHandle);
        Mess.newdDateInfo();
        Mess.initDriverSuccess();
        Mess.newdDateInfo();
        Mess.openingPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Variables.urlProd);
        driver.getCurrentUrl();
        if (driver.getCurrentUrl().equals(Variables.urlProd)) {
            Mess.newdDateInfo();
            Mess.openedPage();
        } else {
            Assert.assertEquals(Variables.urlProd, driver.getCurrentUrl());
        }
    }

    @Test (groups = "Login")
    public void login() {
        loginPage.inputLogin(Variables.login2);
        loginPage.inputPassword(Variables.password1);
        loginPage.clickSubmitButton();
        CheckParam = checkingParam.getUserName();
        if (Variables.usrnm.equals(CheckParam)){
            Mess.newdDateInfo();
            Mess.testTest();
            Mess.loginLogin();
            Mess.passedPassed();
            System.out.println("'"+Variables.usrnm+"'" );
        }
        else{
            Err.errorN1();
            System.out.println(" "+CheckParam+", but expected: "+Variables.usrnm);
            Assert.assertEquals(Variables.usrnm, CheckParam);
        }
    }

    @Test(dependsOnMethods = "login")
    public void campaignsPage(){
        navigation
                .pageCampaigns();
    }

    @Test (dependsOnMethods = "campaignsPage")
    public void checkingCPC(){
        checkingStats.getSome1();
        checkingStats.string2Double();
        checkingStats.renewVar();
        checkingStats.getSome4();
        checkingStats.getSometoDouble();
        checkingStats.valueOFcpc();
        checkingStats.renewVal();
        checkingStats.getSome2();
        checkingStats.string2Double();
        checkingStats.double2String();
       // checkingStats.renewVal();
        checkingStats.checkingVal();
       // checkingStats.getSome3();
       // System.out.println("-------------------------------------------");
        //checkingStats.costString2Double();
        //checkingStats.renewVal();
        //checkingStats.valOfProfit();
        //checkingStats.renewVal();
        //checkingStats.getSome5();
        //checkingStats.string2DoubleWithMinus();
        //checkingStats.correctMinus();
        //checkingStats.double2StringMinus();
        //checkingStats.checkingVal();
        //System.out.println("==============================================");
        //checkingStats.check222();
        //checkingStats.renewVar2();
        //checkingStats.getSome6();
        //checkingStats.getSome6toDouble();
        //checkingStats.renewVar2();
       // checkingStats.check222();
        //checkingStats.checkPercetn();

    }








}