package io.redtrack.app.tests;

import io.redtrack.app.other.CheckingParam;
import io.redtrack.app.other.Navigation;
import io.redtrack.app.other.OtherElements;
import io.redtrack.app.pages.LoginPage;
import io.redtrack.app.pages.TrafficSources;
import io.redtrack.app.variable.Variables;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.concurrent.TimeUnit;






public class RedtrackNavigation {
    public Date   date;
    public        WebDriver driver;
    public static LoginPage loginPage;
    public static CheckingParam checkingParam;
    public static Navigation navigation;
    public static OtherElements otherElements;
    public static TrafficSources sources;


    public static String
            password1 = "99948936",

            usrnm = "Logs",

            page0 = "Campaigns",
            page1 = "Offers",
            page2 = "Landings",
            page3 = "Networks",
            page4 = "Sources",
            page5 = "Domains",
            page6 = "Dashboard",
            logspage0 = "Clicks",
            logspage1 = "Conversions",
            logspage2 = "Postbacks",
            toolspage0 = "Conversion tracking",
            toolspage1 = "Bot Blacklist",
            toolspage2 = "Default fallback-URL",
            toolspage3 = "Filter presets",
            toolsApiPage = "Introduction";


    private String
            windowHandle,
            CheckopenedPage;



    @BeforeClass
    public void init(){
        System.setProperty("webdriver.chrome.driver", "./src/Drivers/Chrome/chromedriver");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        //checkingParam = new CheckingParam(driver);
        navigation = new Navigation(driver);
        otherElements = new OtherElements(driver);
        sources = new TrafficSources(driver);
        windowHandle = driver.getWindowHandle();
        driver.switchTo().window(windowHandle);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://app.redtrack.io/signin");
    }



    @Test(groups = "Nav")
    public void Login() throws InterruptedException {
        date = new Date();
        loginPage.inputLogin(Variables.login1);
        loginPage.inputPassword(password1);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(5000);
        loginPage.clickSubmitButton();
        String username = otherElements.getUserName();
        Thread.sleep(15000);
        Assert.assertEquals(usrnm, username) ;
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        if ( usrnm.equals(username)){
            System.out.print("["+date.toString()+"]: ");
            System.out.println("Login success, found: " +username);
        }
        else{
            System.out.print("["+date.toString()+"]: ");
            System.out.println("Login failed: "+username);
        }
        Thread.sleep(5000);
    }

    @Test (groups = "Nav", dependsOnMethods = "Login")
    public void campPage() throws InterruptedException {
        date = new Date();
        navigation.pageCampaigns();
        Thread.sleep(5000);
        CheckopenedPage = otherElements.getCheckOpenedPage();
        Assert.assertEquals(page0,CheckopenedPage);
        if ( page0.equals(CheckopenedPage)){
            System.out.print("["+date.toString()+"]: ");
            System.out.println("Campaigns page open, found: "+CheckopenedPage);
        }
        else{
            System.out.print("["+date.toString()+"]: ");
            System.out.println("Opening page "+page0 +" failed: "+CheckopenedPage);
        }
        Thread.sleep(5000);
    }

    @Test (groups = "Nav", dependsOnMethods = "campPage")
    public void offersPage() throws InterruptedException{
        date = new Date();
        navigation.pageOffers();
        Thread.sleep(5000);
        CheckopenedPage = otherElements.getCheckOpenedPage();
        Assert.assertEquals(page1, CheckopenedPage);
        if (page1.equals(CheckopenedPage)){
            System.out.print("["+date.toString()+"]: ");
            System.out.println("Offers page open, found: "+CheckopenedPage);
        }
        else {
            System.out.print("["+date.toString()+"]: ");
            System.out.println("Opening page "+page1 +" failed: "+CheckopenedPage);
        }
        Thread.sleep(5000);
    }

    @Test (groups = "Nav", dependsOnMethods = "offersPage")
    public void landersPage() throws  InterruptedException{
        date = new Date();
        navigation.pageLanders();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        CheckopenedPage = otherElements.getCheckOpenedPage();
        Assert.assertEquals(page2, CheckopenedPage);
        if (page2.equals(CheckopenedPage)){
            System.out.print("["+date.toString()+"]: ");
            System.out.println("Landers page open, found: "+ CheckopenedPage);
        }
        else{
            System.out.print("["+date.toString()+"]: ");
            System.out.println("Opening page "+page2 +" failed: "+CheckopenedPage);
        }
        Thread.sleep(5000);
    }

    @Test (groups = "Nav", dependsOnMethods = "landersPage")
    public void networksPage() throws InterruptedException{
        date = new Date();
        navigation.pageNetworks();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        CheckopenedPage = otherElements.getCheckOpenedPage();
        Assert.assertEquals(page3, CheckopenedPage);
        if (page3.equals(CheckopenedPage)){
            System.out.print("["+date.toString()+"]: ");
            System.out.println("Networks page open, found: "+CheckopenedPage);
        }
        else{
            System.out.print("["+date.toString()+"]: ");
            System.out.println("Opening page "+page3 +" failed: "+CheckopenedPage);
        }
        Thread.sleep(5000);
    }


    @Test (groups = "Nav", dependsOnMethods = "networksPage")
    public void tSpage() throws InterruptedException {
        date = new Date();
        navigation.SourcePage();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        CheckopenedPage = otherElements.getCheckOpenedPage();
        Assert.assertEquals(page4, CheckopenedPage);
        if (page4.equals(CheckopenedPage)){
            System.out.print("["+date.toString()+"]: ");
            System.out.println("Traffic Sources page open, found: "+CheckopenedPage);
        }
        else{
            System.out.print("["+date.toString()+"]: ");
            System.out.println("Opening page "+page4 +" failed: "+CheckopenedPage);
        }
        Thread.sleep(5000);
    }

    @Test (groups = "Nav", dependsOnMethods = "tSpage")
    public void domainsPage() throws InterruptedException{
        date = new Date();
        navigation.pageDomains();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        CheckopenedPage = otherElements.getCheckOpenedPage();
        Assert.assertEquals(page5, CheckopenedPage);
        if (page5.equals(CheckopenedPage)){
            System.out.print("["+date.toString()+"]: ");
            System.out.println("Domains page open, found: "+CheckopenedPage);
        }
        else{
            System.out.print("["+date.toString()+"]: ");
            System.out.println("Opening page "+page5 +" failed: "+CheckopenedPage);
        }
        Thread.sleep(5000);
    }

    @Test (groups = "Nav", dependsOnMethods = "domainsPage")
    public void dashBoardPage() throws InterruptedException{
        date = new Date();
        navigation.pageDashboard();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        CheckopenedPage = otherElements.getCheckOpenedPage();
        Assert.assertEquals(page6, CheckopenedPage);
        if (page6.equals(CheckopenedPage)){
            System.out.print("["+date.toString()+"]: ");
            System.out.println("Dashboard page open, found: "+CheckopenedPage);
        }
        else{
            System.out.print("["+date.toString()+"]: ");
            System.out.println("Opening page "+page6 +" failed: "+CheckopenedPage);
        }
        Thread.sleep(5000);
    }

    @Test (groups = "NavLogs", dependsOnMethods = "dashBoardPage")
    public void logsClicksPage () throws InterruptedException {
        date = new Date();
        navigation.dropDownLogs();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        navigation.pageClicks();
        CheckopenedPage = otherElements.getCheckOpenegPage2();
        Assert.assertEquals(logspage0, CheckopenedPage);
        if (logspage0.equals(CheckopenedPage)) {
            System.out.print("["+date.toString()+"]: ");
            System.out.println("Logs -> Clicks page open, found: " + CheckopenedPage);
        } else {
            System.out.print("["+date.toString()+"]: ");
            System.out.println("Opening page " +logspage0 + " failed: " + CheckopenedPage);
        }
        Thread.sleep(5000);
    }

    @Test (groups = "NavLogs", dependsOnMethods = "logsClicksPage")
    public void logsConversionPage() throws InterruptedException{
        date = new Date();
        navigation.dropDownLogs();
        navigation.pageConversions();
        CheckopenedPage = otherElements.getCheckOpenegPage2();
        Assert.assertEquals(logspage1,CheckopenedPage);
        if (logspage1.equals(CheckopenedPage)){
            System.out.print("["+date.toString()+"]: ");
            System.out.println("Logs -> Conversions page open, found: "+CheckopenedPage);
        }
        else {
            System.out.print("["+date.toString()+"]: ");
            System.out.println("Opening page "+logspage1+" failed: "+CheckopenedPage);
        }
        Thread.sleep(5000);
    }

    @Test (groups ="NavLogs", dependsOnMethods = "logsConversionPage")
    public void logsPostbackPage() throws InterruptedException{
        date = new Date();
        navigation.dropDownLogs();
        navigation.pagePostbacks();
        CheckopenedPage = otherElements.getCheckOpenegPage2();
        Assert.assertEquals(logspage2,CheckopenedPage);
        if (logspage2.equals(CheckopenedPage)){
            System.out.print("["+date.toString()+"]: ");
            System.out.println("Logs -> Postbacks page open, found: "+CheckopenedPage);
        }
        else {
            System.out.print("["+date.toString()+"]: ");
            System.out.println("Opening page "+logspage2+" failed: "+CheckopenedPage);
        }
        Thread.sleep(5000);
    }

    @Test (groups = "NavTools", dependsOnMethods = "logsPostbackPage")
    public void toolsConversionTracking() throws InterruptedException {
        date = new Date();
        navigation.dropDownTools();
        navigation.pageConvTrack();
        CheckopenedPage = otherElements.getCheckOpenedPage3();
        Assert.assertEquals(toolspage0, CheckopenedPage);
        if (toolspage0.equals(CheckopenedPage)) {
            System.out.print("["+date.toString()+"]: ");
            System.out.println("Tools -> Conversion tracking page open, found: " + CheckopenedPage);
        }
        else {
            System.out.print("["+date.toString()+"]: ");
            System.out.println("Opening page " + toolspage0 + " failed: " + CheckopenedPage);
        }
        Thread.sleep(3000);
    }

    @Test (groups = "NavTools", dependsOnMethods = "toolsConversionTracking")
    public void toolsBotBlack() throws InterruptedException{
        navigation.dropDownTools();
        Thread.sleep(5000);
        navigation.pageBotBlack();
        CheckopenedPage = otherElements.getBotBlacklist();
        Assert.assertEquals(toolspage1, CheckopenedPage);
        Thread.sleep(5000);
        date = new Date();
        if (toolspage1.equals(CheckopenedPage)) {
            System.out.print("["+date.toString()+"]: ");
            System.out.println("Tools -> Bot Blacklist page open, found: " + CheckopenedPage);
       }
        else{
            System.out.print("["+date.toString()+"]: ");
            System.out.println("Opening page "+toolspage1 +"failed: " +CheckopenedPage);
        }
    }

    @Test (groups = "NavTools", dependsOnMethods = "toolsBotBlack")
    public void toolsDefFallbackURL() throws InterruptedException{
        navigation.dropDownTools();
        navigation.pageDefaultFallbackURL();
        CheckopenedPage = otherElements.getOpenedPage0();
        Assert.assertEquals(toolspage2, CheckopenedPage);
        Thread.sleep(3000);
        date = new Date();
        if (toolspage2.equals(CheckopenedPage)){
            System.out.print("["+date+"]: ");
            System.out.println("Tools -> Default fallback-URL page open, found: "+CheckopenedPage);
        }
        else{
            System.out.println("Opening page "+toolspage1 +"failed: " +CheckopenedPage);
        }
    }

    @Test (groups = "NavTools", dependsOnMethods = "toolsDefFallbackURL")
    public void toolsFilterPresets() throws InterruptedException{
        navigation.dropDownTools();
        navigation.pageFilterPresets();
        CheckopenedPage = otherElements.getOpenedPage4();
        Assert.assertEquals(toolspage3, CheckopenedPage);
        Thread.sleep(3000);
        date = new Date();
        if (toolspage3.equals(CheckopenedPage)){
            System.out.print("["+date+"]: ");
            System.out.println("Tools -> Filter presets page open, found: "+CheckopenedPage);
        }
        else{
            System.out.println("Opening page "+toolspage3 +"failed: " +CheckopenedPage);
        }
    }

    @Test (groups = "NavTools", dependsOnMethods = "toolsFilterPresets")
    public void toolsAPIDocumentation() throws InterruptedException{
        navigation.dropDownTools();
        navigation.pageAPI_Documentation();
        CheckopenedPage = otherElements.getOpenedApiPage();
        Assert.assertEquals(toolsApiPage, CheckopenedPage);
        Thread.sleep(3000);
        date = new Date();
        if (toolsApiPage.equals(CheckopenedPage)){
            System.out.print("["+date+"]: ");
            System.out.println("Tools -> API Documentation page open, found: "+CheckopenedPage);
        }
        else{
            System.out.println("Opening page "+toolsApiPage +"failed: " +CheckopenedPage);
        }
    }



   /* @Test (groups = "exit", dependsOnGroups = "Nav")
        driver.quit();

    } */


}
