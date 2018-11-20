package io.redtrack.app.tests;

        import io.redtrack.app.other.*;
        import io.redtrack.app.pages.*;
        import org.junit.AfterClass;
        import org.junit.Assert;
        import org.junit.runner.RunWith;
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
    public static ManipWithString manipulation;
    private String
            windowHandle,
            CheckParam;


    @BeforeClass
    private void init() {
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
        //manipulation = new ManipWithString(driver);
        driver.switchTo().window(windowHandle);
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

    @Test
    public void login() throws InterruptedException {
        loginPage.inputLogin(Variables.login2);
        loginPage.inputPassword(Variables.password1);
        loginPage.clickSubmitButton();
        Thread.sleep(5000);
        CheckParam = checkingParam.getUserName();
        if (Variables.usrnm.equals(CheckParam)) {
            Mess.newdDateInfo();
            Mess.testTest();
            Mess.loginLogin();
            Mess.passedPassed();
            System.out.println("'" + Variables.usrnm + "'");
        } else {
            Err.errorN1();
            System.out.println(" " + CheckParam + ", but expected: " + Variables.usrnm);
            Assert.assertEquals(Variables.usrnm, CheckParam);
        }
    }

    @Test(dependsOnMethods = "login")
    public void campaignsPage(){
        navigation.pageCampaigns();
    }

    @Test(dependsOnMethods = "campaignsPage")
    public void setCustomPeriod() throws InterruptedException {
        otherElements.setPeriod();
        Mess.newdDateInfo();
        System.out.println("Opening custom range");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //Thread.sleep(5000);
        otherElements.customRange();
    }

    @Test(dependsOnMethods = "setCustomPeriod")
    public void setDate(){
        otherElements.clickApplyButton2();
    }

    @Test(dependsOnMethods = "setDate")
    public void checkingCPC() throws InterruptedException {
        Thread.sleep(5000);
        Mess.newdDateInfo();
        System.out.println("Checking of Cost value...");
        checkingStats.getCheckingCosts();
        checkingStats.stringToDouble();
        checkingStats.getClicks();
        checkingStats.getSometoDouble();
        checkingStats.valueOFcpc();
        checkingStats.renewVal();
        checkingStats.getCheckingCPC();
        checkingStats.stringToDouble();
        checkingStats.correctingDecimal();
        checkingStats.checkingVal();
    }

    @Test(dependsOnMethods = "checkingCPC")
    public void checkingProfit() {
        Mess.newdDateInfo();
        System.out.println("Checking of Profit value...");
        checkingStats.getRevenue();
        checkingStats.stringToDouble();
        checkingStats.renewVar();
        checkingStats.getCheckingCosts();
        checkingStats.stringToDouble();
        checkingStats.getProfit();
        checkingStats.valOfProfit();
        checkingStats.renewVal();
        //checkingStats.getProfit();
        checkingStats.stringToDouble();
        checkingStats.correctingDecimal();
        checkingStats.checkingVal();
    }

   @Test(dependsOnMethods = "checkingProfit")
    public void checkingConv() {
        //checkingStats.getClicks();
        checkingStats.getCRpercent();
        checkingStats.stringToDouble();
        checkingStats.valOfConver();
        checkingStats.correctingDecimal();
        checkingStats.renewVal();
        checkingStats.getConversionRate();
        checkingStats.stringToDouble();
        checkingStats.correctingDecimal();
        checkingStats.checkingVal();
    }


    @Test(dependsOnMethods = "checkingConv")
    public void checkingCPT() {
        checkingStats.getCheckingCosts();
        checkingStats.stringToDouble();
        checkingStats.getTransaction();
        checkingStats.getSometoDouble();
        checkingStats.valOfCPT();
        checkingStats.correctingDecimal();
        checkingStats.renewVal();
        checkingStats.getCPT();
        checkingStats.stringToDouble();
        checkingStats.correctingDecimal();
        checkingStats.checkingVal();
    }

    @Test(dependsOnMethods = "checkingCPT")
    public void checkCPA(){
        checkingStats.getCheckingCosts();
        checkingStats.stringToDouble();
        checkingStats.renewVar();
        checkingStats.getConversionRate();
        checkingStats.stringToDouble();
        checkingStats.valOCPA();
        checkingStats.correctingDecimal();
        checkingStats.renewVal();
        checkingStats.costPeraction();
        checkingStats.stringToDouble();
        checkingStats.correctingDecimal();
        checkingStats.checkingVal();
    }

    @Test(dependsOnMethods = "checkCPA")
    public void checkEPC(){
        checkingStats.getRevenue();
        checkingStats.stringToDouble();
        checkingStats.renewVar();
        checkingStats.getClicks();
        checkingStats.getSometoDouble();
        checkingStats.valueOFcpc();
        checkingStats.renewVal();
        checkingStats.getEPC();
        checkingStats.stringToDouble();
        checkingStats.correctingDecimal();
        checkingStats.checkingVal();
    }

    @Test(dependsOnMethods = "checkEPC")
    public void checkTR(){
        checkingStats.getTransaction();
        checkingStats.getSometoDouble();
        checkingStats.renewVar2();
        checkingStats.getClicks();
        checkingStats.getSometoDouble();
        checkingStats.valOfTR();
        checkingStats.renewVal();
        checkingStats.getTR();
        checkingStats.stringToDouble();
        checkingStats.correctingDecimal();
        checkingStats.checkingVal();
    }

    @Test(dependsOnMethods = "checkTR")
    public void checkCR(){
        checkingStats.getConversionRate();
        checkingStats.getSometoDouble();
        checkingStats.renewVar2();
        checkingStats.getClicks();
        checkingStats.getSometoDouble();
        checkingStats.valOfTR();
        checkingStats.renewVal();
        checkingStats.getCRpercent();
        checkingStats.stringToDouble();
        checkingStats.correctingDecimal();
        checkingStats.checkingVal();
    }

    @Test(dependsOnMethods = "checkCR")
    public void checkROI(){
        checkingStats.getCheckingCosts();
        manipulation.stringToDouble();
        checkingStats.renevVar4();
        checkingStats.getProfit();
        checkingStats.stringToDouble();
        checkingStats.renewVar();
        checkingStats.getRoi();
        checkingStats.valOfTR();
        checkingStats.renewVal();
        checkingStats.stringToDouble();
        checkingStats.correctingDecimal();
        checkingStats.checkingVal();
    }

    //@Test(dependsOnMethods = "checkROI")
    // private final void closingDriver(){
    //    driver.quit();
    //}

}







