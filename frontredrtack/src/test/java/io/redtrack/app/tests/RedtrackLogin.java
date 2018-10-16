package io.redtrack.app.tests;

import io.redtrack.app.other.*;
import io.redtrack.app.pages.*;
import io.redtrack.app.variable.*;

//import org.junit.AfterClass;
import io.redtrack.app.variable.Variables;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Date;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public class RedtrackLogin {

    public        Date date;
    public        WebDriver driver;
    public static LoginPage loginPage;
    public static CheckingParam checkingParam;
    //public static Variables variables;
    public static String
                    login2 = "sdfsdfsdf@sdfsdf.sdf",

                    password2= "sdfsdfsdf",
                    password1 = "99948936",

                    usernotfound = "User not found",
                    cheklogin = "Logs";

    public String
            windowHandle,
            invalidcred,
            username;

    @BeforeClass
    public void init(){
        System.setProperty("webdriver.chrome.driver", "./src/Drivers/Chrome/chromedriver");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        checkingParam = new CheckingParam(driver);
        windowHandle = driver.getWindowHandle();
        driver.switchTo().window(windowHandle);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://app.redtrack.io/signin");

    }

    @Test (groups = "cheking")
    public void InvalidLogin() throws InterruptedException {
        loginPage
                .inputLogin(login2);
        loginPage
                .inputPassword(password2);
        loginPage
                .clickSubmitButton();
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        invalidcred = checkingParam.getInvalidCred();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        date = new Date();
        if (usernotfound.equals(invalidcred)){
            System.out.println("["+date+"]: "+"Test 'InvalidLogin' passed, found: "+"'"+invalidcred+"'" );
        }
        else{
            System.out.println("["+date+"]: "+"Somthing went wrong: Test 'InvalidLogin' FAILED");
        }
        Assert.assertEquals(usernotfound, invalidcred);
        Thread.sleep(3000);

    }

    @Test (groups = "cheking", dependsOnMethods = "InvalidLogin")
    public void Login() throws InterruptedException {
        loginPage
                .inputLogin(Variables.login1);
        loginPage
                .inputPassword(password1);
        loginPage
                .clickSubmitButton();
        username = checkingParam.getUserName();
        date = new Date();
        if (cheklogin.equals(username)){
            System.out.println("["+date+"]: "+"Test 'Login' passed, found: "+"'"+username+"'" );
        }
        else{
            System.out.println("["+date+"]: "+"Somthing went wrong: Test 'InvalidLogin' FAILED");
        }
        Assert.assertEquals(cheklogin, username);
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        Thread.sleep(3000);

    }

    @Test (groups = "exit", dependsOnGroups = "cheking")
    public void closingDrvr(){
        driver.quit();

    }

























}
