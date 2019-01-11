package io.redtrack.app.other;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.redtrack.app.variable.Variables;

public class ForCheckingStats {

    public ForCheckingStats(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;
    public static Variables vars;

    public double check2, check4;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[16]")
    public static WebElement CheckingCosts;
    public String getCheckingCosts() {
        String checkingCost = CheckingCosts.getText();
        vars.CheckCost = checkingCost;
        //double checkCost = (Double.parseDouble(checkingCost));
        return checkingCost;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[6]")
    public static WebElement ClicksClicks;
    public String getClicks() {
        String valueOfClicks = ClicksClicks.getText();
        vars.CheckCost = valueOfClicks;
        return valueOfClicks;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[19]")
    public WebElement CheckingCPC;
    public String getCheckingCPC() {
        String checkingCPC = CheckingCPC.getText();
        vars.CheckCost = checkingCPC;
        return checkingCPC;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[14]")
    public WebElement checkingTR;
    public String getTR() {
        String checkTR = checkingTR.getText();
        vars.CheckCost = checkTR;
        return checkTR;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[15]")
    public WebElement Revenue;
    public String getRevenue() {
        String checkRevenue = Revenue.getText();
        vars.CheckCost = checkRevenue;
        return checkRevenue;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[17]")
    public WebElement Profit;
    public String getProfit() {
        String checkProfit = Profit.getText();
        vars.CheckCost = checkProfit;
        return checkProfit;

    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[11]")
    public WebElement ConversionRate;
    public String getConversionRate() {
        String checkConversionRate = ConversionRate.getText();
        vars.CheckCost = checkConversionRate;
        return checkConversionRate;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[12]")
    public WebElement CRpercent;
    public String getCRpercent() {
        String checkCRpercent = CRpercent.getText();
        vars.CheckCost = checkCRpercent;
        return checkCRpercent;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[13]")
    public WebElement Transaction;
    public String getTransaction() {
        String checkTransaction = Transaction.getText();
        vars.CheckCost = checkTransaction;
        return checkTransaction;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[20]")
    public WebElement costPerAction;
    public String costPeraction() {
        String checkCostPerAction = costPerAction.getText();
        vars.CheckCost = checkCostPerAction;
        return checkCostPerAction;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[22]")
    public WebElement EPC;
    public String getEPC() {
        String checkEPT = EPC.getText();
        vars.CheckCost = checkEPT;
        return checkEPT;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[21]")
    public WebElement CPT;
    public String getCPT() {
        String checkCPT = CPT.getText();
        vars.CheckCost = checkCPT;
        return checkCPT;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[18]")
    public WebElement roi;
    public String getRoi() {
        String checkRoi = roi.getText();
        vars.CheckCost = checkRoi;
        return checkRoi;
    }

    public void renewVar3() {
        check4 = check2;
    }
}

//Comment