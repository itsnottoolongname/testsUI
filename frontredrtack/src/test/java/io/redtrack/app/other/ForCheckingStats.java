package io.redtrack.app.other;

import io.redtrack.app.messages.Mess;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.math.*;

public class ForCheckingStats {

    public ForCheckingStats(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;
    public  String CheckCost;

    public double checkCost, valOfClicks, checkCPC, val2, val, check2, check3, check4, c, b;

    public  char[] newchar;
    public  char[] copyOfRange;
    public  String copyOfRange2, valOfCPC, val3;
    public int i = 1;
    public int asd;

    public void validArrayLength(){
        asd = newchar.length - 1;
    }

    @FindBy(xpath = ".//*[normalize-space(text()) and normalize-space(.)='$23.00'][1]/following::div[1]")
    public static WebElement CheckingCosts;

    public static String getCheckingCosts() {
        String checkingCost = CheckingCosts.getText();
        //double checkCost = (Double.parseDouble(checkingCost));
        return checkingCost;
    }

    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='#01 Source'])[4]/following::div[2]")
    public static WebElement ClicksClicks;

    public static String getClicks(){
        String valueOfClicks = ClicksClicks.getText();
        return valueOfClicks;
    }

    @FindBy(xpath = ".//*[normalize-space(text()) and normalize-space(.)='-$157.00'][1]/following::div[2]")
    public WebElement CheckingCPC;
    public String getCheckingCPC(){
        String checkingCPC = CheckingCPC.getText();
        return checkingCPC;
    }

    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='#01 Source'])[4]/following::div[11]")
    public WebElement Revenue;
    public String getRevenue(){
        String checkRevenue = Revenue.getText();
        return checkRevenue;
    }

    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='$180.00'])[1]/following::div[1]")
    public WebElement Profit;
    public String getProfit(){
        String checkProfit = Profit.getText();
        return checkProfit;
    }

    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='#01 Source'])[4]/following::div[7]")
    public WebElement ConversionRate;
    public String getConversionRate(){
        String checkConversionRate = ConversionRate.getText();
        return checkConversionRate;
    }

    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='#01 Source'])[4]/following::div[8]")
    public WebElement CRpercent;
    public String getCRpercent(){
        String checkCRpercent = CRpercent.getText();
        return checkCRpercent;
    }


    public void getSome1(){
        CheckCost = getCheckingCosts();
    }

    public void getSome2(){
        CheckCost = getCheckingCPC();
    }

    public void getSome3(){
        CheckCost = getRevenue();
    }

    public void getSome4(){
        CheckCost = getClicks();
    }

    public void getSome5(){
        CheckCost = getProfit();
    }

    public void getSome6(){
        CheckCost = getConversionRate();
    }

    public void getSome7(){
        CheckCost = getCRpercent();
    }

    public void getSometoDouble(){
        Mess.newdDateInfo();
        System.out.println("Converting 'String' to 'double'");
        valOfClicks = (Double.parseDouble(CheckCost));
        Mess.newdDateInfo();
        System.out.println("'String' to 'double' successful converted");
        Mess.newdDateInfo();
        System.out.println("Current 'double' value is: " +valOfClicks);
    }

    public void costString2Double() {
        newchar = new char[50];
        newchar = CheckCost.toCharArray();
        copyOfRange = new char[50];
        Mess.newdDateInfo();
        System.out.println("Array 'newchar' has "+newchar.length+" elements");
        for (i = 1; i != newchar.length; i++){
            System.arraycopy(newchar, 1, copyOfRange, 0, i);
        }
        validArrayLength();
        Mess.newdDateInfo();
        System.out.println("New array length is: "+asd+". Creating array for "+asd+" elements");
        copyOfRange2 = new String();
        copyOfRange2 = copyOfRange.toString();
        String stringCopyofRange = String.valueOf(copyOfRange);
        checkCost = (Double.parseDouble(stringCopyofRange));
        Mess.newdDateInfo();
        System.out.println("Current 'double' value is: " +checkCost);
    }

    public void string2DoubleWithMinus() {
        newchar = new char[50];
        newchar = CheckCost.toCharArray();
        copyOfRange = new char[50];
        System.out.println("newchar has "+newchar.length+" elements");
        for (i = 1;i != newchar.length; i++){
            System.arraycopy(newchar, 2, copyOfRange, 0, i-1);
        }
        validArrayLength();
        System.out.println("Array length is: "+asd+". Creating array for "+asd+" elements");
        copyOfRange2 = new String();
        copyOfRange2 = copyOfRange.toString();
        String stringCopyofRange = String.valueOf(copyOfRange);
        checkCPC = (Double.parseDouble(stringCopyofRange));
        System.out.println(copyOfRange);
        System.out.println(checkCost);
    }

    public void string2Double(){
        newchar = new char[50];
        newchar = CheckCost.toCharArray();
        copyOfRange = new char[50];
        Mess.newdDateInfo();
        System.out.println("Current array has "+newchar.length+" elements");
        for (i = 1; i != newchar.length; i++){
            System.arraycopy(newchar, 1, copyOfRange, 0, i);
        }
        validArrayLength();
        Mess.newdDateInfo();
        System.out.println("New length is: "+asd+". Created array for "+asd+" elements");
        copyOfRange2 = new String();
        copyOfRange2 = copyOfRange.toString();
        String stringCopyofRange = String.valueOf(copyOfRange);
        Mess.newdDateInfo();
        System.out.println("Converting 'String' to 'double'");
        checkCost = (Double.parseDouble(stringCopyofRange));
        Mess.newdDateInfo();
        System.out.println("'String' to 'double' successful converted");
        Mess.newdDateInfo();
        System.out.println("Current 'double' value is: " +checkCost);
    }

    public void double2StringMinus(){
        valOfCPC = String.valueOf(check3);
    }

    public void valueOFcpc(){
        Mess.newdDateInfo();
        System.out.println("Cost per Clicks is calculating by Cost dividing by Clicks");
        val = checkCost / valOfClicks;
        val2 = BigDecimal.valueOf(val).setScale(4,RoundingMode.HALF_DOWN).doubleValue();
        Mess.newdDateInfo();
        System.out.println("Calculated CPC is: "+val2);
    }

    public void double2String(){
        Mess.newdDateInfo();
        System.out.println("Converting 'double' to 'String'");
        valOfCPC = String.valueOf(checkCost);
        Mess.newdDateInfo();
        System.out.println("'Double' to 'String' successful converted");
    }

    public void correctMinus(){
        check3 = checkCPC - checkCPC * 2;
    }

    public void renewVal(){
        Mess.newdDateInfo();
        System.out.println("Re-newing Val");
        val3 = String.valueOf(val2);
        Mess.newdDateInfo();
        System.out.println("Val is re-newed");
        Mess.newdDateInfo();
        System.out.println("Result of new value is: " +val3 );

    }

    public void renewVar(){
        Mess.newdDateInfo();
        System.out.println("Re-newing Var");
        check2 = checkCost;
        Mess.newdDateInfo();
        System.out.println("Var is re-newed");
    }

    public void renewVar2(){
        Mess.newdDateInfo();
        System.out.println("Re-newing Var");
        check4 = valOfClicks;
        Mess.newdDateInfo();
        System.out.println("Var is re-newed");
    }

    public void checkingVal(){
        if (val3.equals(valOfCPC)){
            System.out.println("Your destiny is found, congrats: "+val2);
        }
        else{
            Assert.assertEquals(val3,valOfCPC);
            System.out.println("You are lose. GAME OVER");
        }
    }

    public void valOfProfit(){
        val = checkCost - check2;
        System.out.println("Value is "+val);
        val2 = BigDecimal.valueOf(val).setScale(4,RoundingMode.HALF_DOWN).doubleValue();
    }

    public void check222(){
        System.out.println(CheckCost+ "   "+copyOfRange2 +"   "+valOfCPC+"   "+val3+ "   "+check3+"   "+valOfClicks+"  "/*+check4);*/);
    }

    public void checkPercetn(){
        double a;
        a = 465;
        int d;
        c = a * 6.02 / 100;
        c = BigDecimal.valueOf(c).setScale(0,RoundingMode.UP).doubleValue();
        System.out.println("Percent is: "+c);

        String f;
        f = String.valueOf(c);
        //d = Integer.valueOf(b);
        System.out.println("Percent string to int is: "+f);

    }


    //Comment
}