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

public class RedtrackTrafficSourceCreate {

    public        WebDriver driver;
    public static LoginPage loginPage;
    public static CheckingParam checkingParam;
    public static Navigation navigation;
    public static OtherElements otherElements;
    //public static TrafficSources sources;

    private String
            windowHandle,
            CheckParam;



    @BeforeClass
    public void init(){
        Mess.newdDateInfo();
        Mess.initDriver();
        System.setProperty("webdriver.chrome.driver", "./src/Drivers/Chrome/chromedriver");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        checkingParam = new CheckingParam(driver);
        navigation = new Navigation(driver);
        otherElements = new OtherElements(driver);
        //sources = new TrafficSources(driver);
        windowHandle = driver.getWindowHandle();
        driver.switchTo().window(windowHandle);
        Mess.newdDateInfo();
        Mess.initDriverSuccess();
        Mess.newdDateInfo();
        Mess.openingPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Variables.urlProd);
        driver.getCurrentUrl();
        if (driver.getCurrentUrl().equals(Variables.urlProd)){
            Mess.newdDateInfo();
            Mess.openedPage();
        }
        else {
        Assert.assertEquals(Variables.urlProd, driver.getCurrentUrl());
        }
    }

    @Test (groups = "Login")
    public void Login() throws InterruptedException {
        Thread.sleep(1000);
        loginPage
                .inputLogin(Variables.login1);
        loginPage
                .inputPassword(Variables.password1);
        loginPage
                .clickSubmitButton();
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
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        Thread.sleep(3000);
    }


    @Test (groups = "Source", dependsOnMethods = "Login")
    public void TraffSourcePage() throws InterruptedException{
        navigation
                .SourcePage();
        Thread.sleep(3000);
        CheckParam = checkingParam.getCheckOpenedPage();
        if (Variables.TrafficSource.equals(CheckParam)){
            Mess.newdDateInfo();
            Mess.testTest();
            Mess.traffSource();
            Mess.passedPassed();
            System.out.print(" '"+Variables.TrafficSource+"'");
            Mess.dotAdd();
            Mess.passedOpenedPage();
            System.out.println("'"+Variables.TrafficSource+"'");
        }
        else{
            Err.errorN2();
            System.out.println(" "+CheckParam+", but expected: "+Variables.TrafficSource);
            Assert.assertEquals(Variables.TrafficSource,CheckParam);
        }
        Thread.sleep(1000);
        otherElements
                .CreateNew();
        CheckParam = checkingParam.getOpenedPage4();
        if (Mess.c11.equals(CheckParam)){
            Mess.newdDateInfo();
            Mess.createSomeObject();
            System.out.print(CheckParam);
            Mess.passedPassed();
            System.out.print(" '"+Mess.c11+"'");
            System.out.println();
            Mess.newdDateInfo();
            Mess.passedOpenedPage();
            System.out.println(Mess.c30+Mess.add12+"'"+Mess.c11+"'");
        }
        else{
            Err.errorN3();
            System.out.println(" "+CheckParam+", but expected: "+Mess.c11);
            Assert.assertEquals(Mess.c11,CheckParam);
        }
        Thread.sleep(3000);

        otherElements
                .AddNew();
        CheckParam = checkingParam.getOpenedPage4();
        if (Variables.NCTS.equals(CheckParam)) {
            Mess.newdDateInfo();
            Mess.testTest();
            System.out.print(Mess.add13+" "+Mess.a30+" "+Variables.NCTS);
            Mess.passedPassed();
            System.out.println("'"+Variables.NCTS+"'");
            Mess.newdDateInfo();
            Mess.passedOpenedPage();
            System.out.println("'"+Variables.NCTS+"'");
        }
        else{
            Err.errorN4();
            System.out.println(" "+CheckParam+", but expected: "+Variables.NCTS);
            Assert.assertEquals(Variables.NCTS,CheckParam);
        }
        Thread.sleep(3000);
        otherElements
                .sourceTitleRand();
    }




}
