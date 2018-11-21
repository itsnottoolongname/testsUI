package io.redtrack.app.tests;

        import io.redtrack.app.other.*;
        import io.redtrack.app.pages.*;
        import org.junit.AfterClass;
        import org.junit.Assert;
        import org.testng.annotations.BeforeClass;
        import org.testng.annotations.Test;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import io.redtrack.app.variable.Variables;
        import java.util.concurrent.TimeUnit;
        import io.redtrack.app.messages.*;
        import io.redtrack.app.errors.Err;

public class RedtrackStats {

    public WebDriver driver;
    public static LoginPage loginPage;
    public static CheckingParam checkingParam;
    public static Navigation navigation;
    public static OtherElements otherElements;
    public static ForCheckingStats getStats;
    public static ManipWithString manipulation;
    public static CalculatingValues calculate;
    public static RenewingVarsVals renew;
    public static Variables vars;

    private String
            windowHandle;


    @BeforeClass
    private void init() {
        Mess.newdDateInfo();
        Mess.initDriver();
        System.setProperty("webdriver.chrome.driver", "./src/Drivers/Chrome/chromedriver");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        getStats = new ForCheckingStats(driver);
        navigation = new Navigation(driver);
        otherElements = new OtherElements(driver);
        windowHandle = driver.getWindowHandle();
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
        loginPage.inputLogin(vars.login2);
        loginPage.inputPassword(vars.password1);
        loginPage.clickSubmitButton();
        Thread.sleep(5000);
        otherElements.getUserName();
        checkingParam.checkingElement();
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
        getStats.getCheckingCosts();
        manipulation.stringToDouble();
        getStats.getClicks();
        manipulation.getSometoDouble();
        calculate.valueOFcpc();
        renew.renewVal();
        getStats.getCheckingCPC();
        manipulation.stringToDouble();
        Thread.sleep(3000);
        manipulation.checkingDecimal();
        checkingParam.checkingVal();
    }

    @Test(dependsOnMethods = "checkingCPC")
    public void checkingProfit() {
        Mess.newdDateInfo();
        System.out.println("Checking of Profit value...");
        getStats.getRevenue();
        manipulation.stringToDouble();
        renew.renewVar();
        getStats.getCheckingCosts();
        manipulation.stringToDouble();
        getStats.getProfit();
        calculate.valOfProfit();
        renew.renewVal();
        manipulation.stringToDouble();
        manipulation.checkingDecimal();
        checkingParam.checkingVal();
    }

   @Test(dependsOnMethods = "checkingProfit")
    public void checkingConv() {
        getStats.getCRpercent();
        manipulation.stringToDouble();
        calculate.valOfConver();
        manipulation.checkingDecimal();
        renew.renewVal();
        getStats.getConversionRate();
        manipulation.stringToDouble();
        manipulation.checkingDecimal();
        checkingParam.checkingVal();
    }


    @Test(dependsOnMethods = "checkingConv")
    public void checkingCPT() {
        getStats.getCheckingCosts();
        manipulation.stringToDouble();
        getStats.getTransaction();
        manipulation.getSometoDouble();
        calculate.valOfCPT();
        manipulation.checkingDecimal();
        renew.renewVal();
        getStats.getCPT();
        manipulation.stringToDouble();
        manipulation.checkingDecimal();
        checkingParam.checkingVal();
    }

    @Test(dependsOnMethods = "checkingCPT")
    public void checkCPA(){
        getStats.getCheckingCosts();
        manipulation.stringToDouble();
        renew.renewVar();
        getStats.getConversionRate();
        manipulation.stringToDouble();
        calculate.valOfCPA();
        manipulation.checkingDecimal();
        renew.renewVal();
        getStats.costPeraction();
        manipulation.stringToDouble();
        manipulation.checkingDecimal();
        checkingParam.checkingVal();
    }

    @Test(dependsOnMethods = "checkCPA")
    public void checkEPC(){
        getStats.getRevenue();
        manipulation.stringToDouble();
        renew.renewVar();
        getStats.getClicks();
        manipulation.getSometoDouble();
        calculate.valueOFcpc();
        renew.renewVal();
        getStats.getEPC();
        manipulation.stringToDouble();
        manipulation.checkingDecimal();
        checkingParam.checkingVal();
    }

    @Test(dependsOnMethods = "checkEPC")
    public void checkTR(){
        getStats.getTransaction();
        manipulation.getSometoDouble();
        renew.renewVar2();
        getStats.getClicks();
        manipulation.getSometoDouble();
        calculate.valOfTR();
        renew.renewVal();
        getStats.getTR();
        manipulation.stringToDouble();
        manipulation.checkingDecimal();
        checkingParam.checkingVal();
    }

    @Test(dependsOnMethods = "checkTR")
    public void checkCR(){
        getStats.getConversionRate();
        manipulation.getSometoDouble();
        renew.renewVar2();
        getStats.getClicks();
        manipulation.getSometoDouble();
        calculate.valOfTR();
        renew.renewVal();
        getStats.getCRpercent();
        manipulation.stringToDouble();
        manipulation.checkingDecimal();
        checkingParam.checkingVal();
    }

    @Test(dependsOnMethods = "checkCR")
    public void checkROI(){
        getStats.getCheckingCosts();
        manipulation.stringToDouble();
        renew.renevVar4();
        getStats.getProfit();
        manipulation.stringToDouble();
        renew.renewVar();
        getStats.getRoi();
        calculate.valOfTR();
        renew.renewVal();
        manipulation.stringToDouble();
        manipulation.checkingDecimal();
        checkingParam.checkingVal();
    }

    //@Test(dependsOnMethods = "checkROI")
    // private final void closingDriver(){
    //    driver.quit();
    //}

}







