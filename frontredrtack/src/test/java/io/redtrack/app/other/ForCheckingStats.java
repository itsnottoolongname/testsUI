package io.redtrack.app.other;

import io.redtrack.app.messages.Mess;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.math.*;
import java.text.DecimalFormat;

import io.redtrack.app.other.ManipWithString;

public class ForCheckingStats {

    public ForCheckingStats(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        //manipulation = new ManipWithString(driver);
    }

    public WebDriver driver;
    public ManipWithString manipulation;
    public static String CheckCost;

    public double checkCost, valOfClicks, val2, val, check2, check3, check4, c, b;

    public char[] newchar;
    public char[] copyOfRange;
    public String copyOfRange2, valOfCPC, val3, output;
    public int i = 1;
    public int asd;

    public void validArrayLength() {
        asd = newchar.length - 1;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[16]")

    public static WebElement CheckingCosts;

    public  String getCheckingCosts() {
        String checkingCost = CheckingCosts.getText();
        CheckCost = checkingCost;
        //double checkCost = (Double.parseDouble(checkingCost));
        return checkingCost;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[6]")
    public static WebElement ClicksClicks;

    public String getClicks() {
        String valueOfClicks = ClicksClicks.getText();
        CheckCost = valueOfClicks;
        return valueOfClicks;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[19]")
    public WebElement CheckingCPC;

    public String getCheckingCPC() {
        String checkingCPC = CheckingCPC.getText();
        CheckCost = checkingCPC;
        return checkingCPC;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[14]")
    public WebElement checkingTR;
    public String getTR(){
        String checkTR = checkingTR.getText();
        CheckCost = checkTR;
        return checkTR;
    }

    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='#01 Source'])[4]/following::div[11]")
    public WebElement Revenue;

    public String getRevenue() {
        String checkRevenue = Revenue.getText();
        CheckCost = checkRevenue;
        return checkRevenue;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[17]")
    public WebElement Profit;

    public String getProfit() {
        String checkProfit = Profit.getText();
        CheckCost = checkProfit;
        return checkProfit;

    }

    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='#01 Source'])[4]/following::div[7]")
    public WebElement ConversionRate;

    public String getConversionRate() {
        String checkConversionRate = ConversionRate.getText();
        CheckCost = checkConversionRate;
        return checkConversionRate;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[12]")
    public WebElement CRpercent;

    public String getCRpercent() {
        String checkCRpercent = CRpercent.getText();
        CheckCost = checkCRpercent;
        return checkCRpercent;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[13]")
    public WebElement Transaction;

    public String getTransaction(){
        String checkTransaction = Transaction.getText();
        CheckCost = checkTransaction;
        return checkTransaction;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[20]")
    public WebElement costPerAction;
    public String costPeraction(){
        String checkCostPerAction = costPerAction.getText();
        CheckCost = checkCostPerAction;
        return checkCostPerAction;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[22]")
    public  WebElement EPC;
    public String getEPC(){
        String checkEPT = EPC.getText();
        CheckCost = checkEPT;
        return checkEPT;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[21]")
    public WebElement CPT;
    public String getCPT(){
        String checkCPT = CPT.getText();
        CheckCost = checkCPT;
        return checkCPT;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[18]")
    public WebElement roi;
    public String getRoi(){
        String checkRoi = roi.getText();
        CheckCost = checkRoi;
        return checkRoi;
    }

    public void getSometoDouble() {
        Mess.newdDateInfo();
        System.out.println("Converting 'String' to 'double'");
        valOfClicks = (Double.parseDouble(CheckCost));
        Mess.newdDateInfo();
        System.out.println("'String' to 'double' successful converted");
        Mess.newdDateInfo();
        System.out.println("Current 'double' value is: " +valOfClicks);
    }



    public void valueOFcpc() {

        Mess.newdDateInfo();
        System.out.println("Cost per Clicks is calculating by Cost dividing by Clicks");
        val = checkCost / valOfClicks;

        if ( val < 0.001) {
            DecimalFormat formatter = new DecimalFormat("0.0000");
            output = formatter.format(val);
            Mess.newdDateInfo();
            System.out.println("Calculated CPC is: " + output);

        }else{
            val2 = BigDecimal.valueOf(val).setScale(4, RoundingMode.HALF_DOWN).doubleValue();
            Mess.newdDateInfo();
            System.out.println("Calculated CPC is: " +val2);
        }
    }


    public void renewVal() {
        if (val < 0.001) {
            Mess.newdDateInfo();
            System.out.println("Re-newing Val");
            val3 = output;
            Mess.newdDateInfo();
            System.out.println("Val is re-newed");
            Mess.newdDateInfo();
            System.out.println("Result of new value is: " + val3);
        }
        else{
            Mess.newdDateInfo();
            System.out.println("Re-newing Val");
            val3 = String.valueOf(val2);
            Mess.newdDateInfo();
            System.out.println("Val is re-newed");
            Mess.newdDateInfo();
            System.out.println("Result of new value is: " + val3);
        }


    }

    public void correctingDecimal(){
        if (checkCost < 0.001){
            Mess.newdDateInfo();
            System.out.println("Correcting decimal... Current value is: " +checkCost);
            DecimalFormat formatter = new DecimalFormat("0.0000");
            valOfCPC = formatter.format(checkCost);
            Mess.newdDateInfo();
            System.out.println("Correcting decimal finished... Corrected value is: "+ valOfCPC);
        }
        else{
            doubleToString();
        }

    }

    public void renewVar() {
        if(CheckCost.contains("-")&&CheckCost.contains("$")){
            Mess.newdDateInfo();
            System.out.println("Re-newing Var");
            check4 = checkCost;
            Mess.newdDateInfo();
            System.out.println("Var is re-newed. Current Var is: "+check4);

        }else {
            Mess.newdDateInfo();
            System.out.println("Re-newing Var");
            check2 = checkCost;
            Mess.newdDateInfo();
            System.out.println("Var is re-newed. Current Var is: " + check2);
        }
    }

    public void renewVar2() {
        Mess.newdDateInfo();
        System.out.println("Re-newing Var2");
        check4 = valOfClicks;
        Mess.newdDateInfo();
        System.out.println("Var2 is re-newed. Current Var2 is: "+check4);
    }

    public void renewVar3(){
        check4 = check2;
    }

    public void renevVar4(){
        valOfClicks = checkCost;
    }


    public void valOfTR() {
        val = (check4 / valOfClicks) * 100; // Высчитывание процента
        val2 = BigDecimal.valueOf(val).setScale(2, RoundingMode.HALF_DOWN).doubleValue();
        if (CheckCost.contains("-") && CheckCost.contains("%")) {
            val2 = -val2;
            Mess.newdDateInfo();
            System.out.println("Value corrected with minus: " + val2);
        } else {
            Mess.newdDateInfo();
            System.out.println("Value doesn't contains minus: " + val2);
        }
    }
    public void checkingVal() {
        if (val3.equals(valOfCPC)) {
            Mess.newdDateInfo();
            System.out.println("Checking value is passed. Expected is: " +val3+ ". Actual is: " +valOfCPC);
        } else {
            Mess.error();
            System.out.println("Checking value is failed. Expected is: " +val3+ ". Actual is: " +valOfCPC);
            Mess.ansi_reset();
        }
    }

    public void valOfProfit() {
        Mess.newdDateInfo();
        System.out.println("Profit is calculating by **** minus *****");
        val = checkCost - check2;
        val2 = BigDecimal.valueOf(val).setScale(4, RoundingMode.HALF_DOWN).doubleValue();
        Mess.newdDateInfo();
        System.out.println("Calculated Profit is: " +val2);
        if (CheckCost.contains("-")) {
            val2 = -val2;
            Mess.newdDateInfo();
            System.out.println("Value corrected with minus: "+val2);
        }
        else{
            Mess.newdDateInfo();
            System.out.println("Value doesn't contains minus: "+val2);
        }
    }

    public void valOCPA() {
        Mess.newdDateInfo();
        System.out.println("Profit is calculating by **** minus *****");
        val = check2 / checkCost;
        val2 = BigDecimal.valueOf(val).setScale(4, RoundingMode.HALF_DOWN).doubleValue();
        Mess.newdDateInfo();
        System.out.println("Calculated Profit is: " +val2);
        if (CheckCost.contains("-")) {
            val2 = -val2;
            Mess.newdDateInfo();
            System.out.println("Value corrected with minus: "+val2);
        }
        else{
            Mess.newdDateInfo();
            System.out.println("Value doesn't contains minus: "+val2);
        }
    }

    public void valOfConver() {
        Mess.newdDateInfo();
        System.out.println("Conversions is calculating via val of Clicks dividing CR ");
        val2 = valOfClicks * checkCost / 100;
        val2 = BigDecimal.valueOf(val2).setScale(1, RoundingMode.HALF_UP).doubleValue();
        Mess.newdDateInfo();
        System.out.println("Calculated Conversions is: " +val2);
    }

    public void valOfCPT (){
        Mess.newdDateInfo();
        System.out.println("Cost Per Transaction is calculating via Cost dividing Transactions ");
        val2 =  checkCost / valOfClicks;
        val2 = BigDecimal.valueOf(val2).setScale(4, RoundingMode.HALF_UP).doubleValue();
        Mess.newdDateInfo();
        System.out.println("Calculated Cost Per Transaction is: " +val2);
    }

    public void checkPercetn() {
        double a;
        a = 465;
        int d;
        c = a * 6.02 / 100;
        c = BigDecimal.valueOf(c).setScale(0, RoundingMode.UP).doubleValue();
        System.out.println("Percent is: " +c);
        String f;
        f = String.valueOf(c);
        //d = Integer.valueOf(b);
        System.out.println("Percent string to int is: " +f);
    }

    public void stringToDouble() {
        if (CheckCost.contains("-")&&CheckCost.contains("$")){
                newchar = new char[50];
                newchar = CheckCost.toCharArray();
                copyOfRange = new char[50];
                Mess.newdDateInfo();
                System.out.println("Array contains minus value. Current array has " +newchar.length+ " elements");
                for (i = 1; i != newchar.length; i++) {
                    System.arraycopy(newchar, 2, copyOfRange, 0, i -1);
                }
                validArrayLength();
                Mess.newdDateInfo();
                System.out.println("New length is: " +asd+ ". Created array for " +asd+ " elements");
                copyOfRange2 = new String();
                copyOfRange2 = copyOfRange.toString();
                String stringCopyofRange = String.valueOf(copyOfRange);
                checkCost = (Double.parseDouble(stringCopyofRange));

        }
        else {

            if (CheckCost.contains("-") && CheckCost.contains("%")) {
                newchar = new char[50];
                newchar = CheckCost.toCharArray();
                copyOfRange = new char[50];
                Mess.newdDateInfo();
                System.out.println("Current array has " + newchar.length + " elements");
                for (i = 1; i != newchar.length; i++) {
                    System.arraycopy(newchar, 0, copyOfRange, 0, i);
                }
                validArrayLength();
                Mess.newdDateInfo();
                System.out.println("New length is: " + asd + ". Created array for " + asd + " elements");
                copyOfRange2 = new String();
                copyOfRange2 = copyOfRange.toString();
                String stringCopyofRange = String.valueOf(copyOfRange);
                Mess.newdDateInfo();
                System.out.println("Converting 'String' to 'double'");
                checkCost = (Double.parseDouble(stringCopyofRange));
                Mess.newdDateInfo();
                System.out.println("'String' to 'double' successful converted");
                Mess.newdDateInfo();
                System.out.println("Current 'double' value is: " + checkCost);
                    if(CheckCost.contains("-")&&CheckCost.contains("%")){
                        checkCost = -checkCost;
                    }
            }
            else {
                if (CheckCost.contains("-")) {
                        newchar = new char[50];
                        newchar = CheckCost.toCharArray();
                        copyOfRange = new char[50];
                        Mess.newdDateInfo();
                        System.out.println("Array contains minus value. Current array has " + newchar.length + " elements");
                        for (i = 1; i != newchar.length; i++) {
                            System.arraycopy(newchar, 2, copyOfRange, 0, i - 1);
                        }
                        validArrayLength();
                        Mess.newdDateInfo();
                        System.out.println("New length is: " + asd + ". Created array for " + asd + " elements");
                        copyOfRange2 = new String();
                        copyOfRange2 = copyOfRange.toString();
                        String stringCopyofRange = String.valueOf(copyOfRange);
                        checkCost = (Double.parseDouble(stringCopyofRange));
                } else {
                    if (CheckCost.contains("%")) {
                            newchar = new char[50];
                            newchar = CheckCost.toCharArray();
                            copyOfRange = new char[50];
                            Mess.newdDateInfo();
                            System.out.println("Current array has " + newchar.length + " elements");
                            for (i = 1; i != newchar.length; i++) {
                                System.arraycopy(newchar, 0, copyOfRange, 0, i);
                            }
                            validArrayLength();
                            Mess.newdDateInfo();
                            System.out.println("New length is: " + asd + ". Created array for " + asd + " elements");
                            copyOfRange2 = new String();
                            copyOfRange2 = copyOfRange.toString();
                            String stringCopyofRange = String.valueOf(copyOfRange);
                            Mess.newdDateInfo();
                            System.out.println("Converting 'String' to 'double'");
                            checkCost = (Double.parseDouble(stringCopyofRange));
                            Mess.newdDateInfo();
                            System.out.println("'String' to 'double' successful converted");
                            Mess.newdDateInfo();
                            System.out.println("Current 'double' value is: " + checkCost);
                    } else {
                        if (!CheckCost.contains("-") && !CheckCost.contains("$")) {
                                newchar = new char[50];
                                newchar = CheckCost.toCharArray();
                                copyOfRange = new char[50];
                                Mess.newdDateInfo();
                                System.out.println("Current array has " + newchar.length + " elements");
                                for (i = 1; i != newchar.length; i++) {
                                    System.arraycopy(newchar, 0, copyOfRange, 0, i + 1);
                                }
                                validArrayLength();
                                Mess.newdDateInfo();
                                System.out.println("New length is: " + asd + ". Created array for " + asd + " elements");
                                copyOfRange2 = new String();
                                copyOfRange2 = copyOfRange.toString();
                                String stringCopyofRange = String.valueOf(copyOfRange);
                                Mess.newdDateInfo();
                                System.out.println("Converting 'String' to 'double'");
                                checkCost = (Double.parseDouble(stringCopyofRange));
                                Mess.newdDateInfo();
                                System.out.println("'String' to 'double' successful converted");
                                Mess.newdDateInfo();
                                System.out.println("Current 'double' value is: " + checkCost);
                        } else {
                            if (!CheckCost.contains("-")) {
                                    newchar = new char[50];
                                    newchar = CheckCost.toCharArray();
                                    copyOfRange = new char[50];
                                    Mess.newdDateInfo();
                                    System.out.println("Current array has " + newchar.length + " elements");
                                    for (i = 1; i != newchar.length; i++) {
                                        System.arraycopy(newchar, 1, copyOfRange, 0, i);
                                    }
                                    validArrayLength();
                                    Mess.newdDateInfo();
                                    System.out.println("New length is: " + asd + ". Created array for " + asd + " elements");
                                    copyOfRange2 = new String();
                                    copyOfRange2 = copyOfRange.toString();
                                    String stringCopyofRange = String.valueOf(copyOfRange);
                                    Mess.newdDateInfo();
                                    System.out.println("Converting 'String' to 'double'");
                                    checkCost = (Double.parseDouble(stringCopyofRange));
                                    Mess.newdDateInfo();
                                    System.out.println("'String' to 'double' successful converted");
                                    Mess.newdDateInfo();
                                    System.out.println("Current 'double' value is: " + checkCost);
                            }
                            else {
                                if (CheckCost.contains("$")) {
                                        newchar = new char[50];
                                        newchar = CheckCost.toCharArray();
                                        copyOfRange = new char[50];
                                        Mess.newdDateInfo();
                                        System.out.println("Current array has " + newchar.length + " elements");
                                        for (i = 1; i != newchar.length; i++) {
                                            System.arraycopy(newchar, 1, copyOfRange, 0, i);
                                        }
                                        validArrayLength();
                                        Mess.newdDateInfo();
                                        System.out.println("New length is: " + asd + ". Created array for " + asd + " elements");
                                        copyOfRange2 = new String();
                                        copyOfRange2 = copyOfRange.toString();
                                        String stringCopyofRange = String.valueOf(copyOfRange);
                                        Mess.newdDateInfo();
                                        System.out.println("Converting 'String' to 'double'");
                                        checkCost = (Double.parseDouble(stringCopyofRange));
                                        Mess.newdDateInfo();
                                        System.out.println("'String' to 'double' successful converted");
                                        Mess.newdDateInfo();
                                        System.out.println("Current 'double' value is: " + checkCost);
                                }
                                else {
                                        Mess.newdDateInfo();
                                        System.out.println("stringToDouble isn't working. Need hotfix");
                                }
                            }
                        }
                    }
                }
            }
        }
    }


    public void doubleToString() {
        if (CheckCost.contains("-") && CheckCost.contains("%")) {
            Mess.newdDateInfo();
            System.out.println("checking value before correcting " + checkCost);
            check3 = -checkCost;
            Mess.newdDateInfo();
            System.out.println("Converting 'double' to 'String' with minus value");
            valOfCPC = String.valueOf(check3);
            Mess.newdDateInfo();
            System.out.println("'Double' to 'String' with minus value successful converted");
        }
        else {

            if (CheckCost.contains("-")) {
                Mess.newdDateInfo();
                System.out.println("checking value before correcting " + checkCost);
                check3 = -checkCost;
                Mess.newdDateInfo();
                System.out.println("Converting 'double' to 'String' with minus value");
                valOfCPC = String.valueOf(check3);
                Mess.newdDateInfo();
                System.out.println("'Double' to 'String' with minus value successful converted");
            }
            else {
                if (!CheckCost.contains("-")) {
                    Mess.newdDateInfo();
                    System.out.println("Converting 'double' to 'String'");
                    valOfCPC = String.valueOf(checkCost);
                    Mess.newdDateInfo();
                    System.out.println("'Double' to 'String' successful converted " + valOfCPC);
                }
                else {
                    Mess.newdDateInfo();
                    System.out.println("doubleToString isn't working. Need hotfix");
                }
            }
        }
    }
}

//Comment