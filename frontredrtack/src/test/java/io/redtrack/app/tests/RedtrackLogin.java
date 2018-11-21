package io.redtrack.app.tests;

import io.redtrack.app.messages.Mess;
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
    public static OtherElements otherElements;
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
        otherElements = new OtherElements(driver);
        //checkingParam = new CheckingParam(driver);
        windowHandle = driver.getWindowHandle();
        driver.switchTo().window(windowHandle);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://app.redtrack.io/signin");
    }

    @Test (groups = "cheking")
    public void InvalidLogin() throws InterruptedException {
        loginPage.inputLogin(login2);
        loginPage.inputPassword(password2);
        loginPage.clickSubmitButton();
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //invalidcred = checkingParam.getInvalidCred();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if (usernotfound.equals(otherElements.getInvalidCred())){
            Mess.newdDateInfo();
            System.out.println("Test 'InvalidLogin' passed, found: "+"'"+otherElements.getInvalidCred()+"'" );
        }
        else{
            Mess.error();
            System.out.println("Somthing went wrong: Test 'InvalidLogin' FAILED");
            Mess.ansi_reset();
        }
        //Assert.assertEquals(usernotfound, invalidcred);
    }

    @Test (groups = "cheking", dependsOnMethods = "InvalidLogin")
    public void upperCaseLogin() throws InterruptedException {
        loginPage.inputLogin(Variables.upp_Reg);
        loginPage.inputPassword(Variables.password1);
        loginPage.clickSubmitButton();
        Thread.sleep(5000);
        if (usernotfound.equals(otherElements.getInvalidCred())){
            Mess.error();
            System.out.println("Test with uppercase failed. Found: "+otherElements.getInvalidCred());
            Mess.ansi_reset();
        }
        else{
            Mess.newdDateInfo();
            System.out.println("Test with uppercase passed. Found: "+otherElements.getUserName());
        }
        //invalidcred = checkingParam.getInvalidCred();
        //Mess.newdDateInfo();
        //System.out.println(invalidcred);
    }


    @Test (groups = "cheking", dependsOnMethods = "upperCaseLogin")
    public void Login() throws InterruptedException {
        Thread.sleep(5000);
        loginPage.inputLogin(Variables.login1);
        loginPage.inputPassword(password1);
        loginPage.clickSubmitButton();
        username = otherElements.getUserName();

        if (cheklogin.equals(username)){
            Mess.newdDateInfo();
            System.out.println("Test 'Login' passed, found: "+"'"+username+"'" );
        }
        else{
            Mess.error();
            System.out.println("Somthing went wrong: Test 'InvalidLogin' FAILED");
            Mess.ansi_reset();
        }
        Assert.assertEquals(cheklogin, username);
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
    }



    @Test (groups = "exit", dependsOnGroups = "cheking")
    public void closingDrvr(){
        Mess.newdDateInfo();
        System.out.println("Exiting driver, closing browser");
        driver.quit();
    }

























}
