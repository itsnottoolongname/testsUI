package io.redtrack.app.other;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.Date;
//import java.lang.Math;
import java.lang.String;
import java.util.Random;
import io.redtrack.app.messages.Mess;



public class OtherElements {


    //public Randomizzer randomizer;
    //public Math math;
    public Date date;
    //public String rand;
    public OtherElements(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;

    /* Apply buttonuttons in Logs page Clicks && Conversions */

    @FindBy(className = "btn btn-sm btn-primary")
    public WebElement ApplyClickConv;

    /* Apply button in Logs page Postbacks */

    @FindBy(className = "btn btn-sm btn-primary btn-block")
    public WebElement ApplyPostb;

    /* Period all pages */

    @FindBy(className = "text-left-forse overflow-hidden btn btn-sm btn-default btn-block")
    public WebElement ReportPeriod;

    /* Columns for all pages != Dashboard */

    @FindBy(className = "btn btn-xs btn-default")
    public WebElement Columns;

    @FindBy (linkText = "New")
    public WebElement createNew;
    public void CreateNew(){
        createNew.click();
    }

    @FindBy (linkText = "Add")
    public WebElement addNew;
    public void AddNew(){
        addNew.click();
    }

    @FindBy (name = "title")
    public WebElement TitleTitle;
    //public String randsourceTitle(){
       // rand = randomizer.randText();
     //   return randsourceTitle();
   // }

    public void sourceTitleRand(){
        //System.out.println("Clearing Source name");
        TitleTitle.clear();
        //System.out.println("Sourcename Clear");
        //System.out.println("Send random keys to Source name");
        TitleTitle.sendKeys(Integer.toString(new Random().nextInt(254335363)+987765352));
    }



    /* Navigation menu */






}
