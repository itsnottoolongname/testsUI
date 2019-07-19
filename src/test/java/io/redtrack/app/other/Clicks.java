package io.redtrack.app.other;

import io.redtrack.app.pages.Campaigns;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import io.redtrack.app.variable.Variables;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class Clicks {

    public Clicks(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public static Campaigns campaigns;
    public static Variables vars;

    public WebDriver driver;

    public void createOneClick() throws IOException, UnsupportedFlavorException {
        //driver.get(campaigns.clipboard.getData(campaigns.flavor));
        this.driver.get(campaigns.clickURL);
    }


    public void createOneConversion(){
        this.driver.get("http://"+vars.domainURL+"/postback?"+vars.parseURL[1]);
    }


}
