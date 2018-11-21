package io.redtrack.app.other;

import io.redtrack.app.messages.Mess;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import io.redtrack.app.other.ManipWithString;
import io.redtrack.app.variable.Variables;

public class CalculatingValues {

    public static  ManipWithString manipulation;
    public static  Variables vars;

    public static void valueOFcpc() {

        Mess.newdDateInfo();
        System.out.println("Cost per Clicks is calculating by Cost dividing by Clicks");
        vars.val = vars.checkCost / vars.valOfClicks;

        if ( vars.val < 0.001) {
            DecimalFormat formatter = new DecimalFormat("0.0000");
            vars.output = formatter.format(vars.val);
            Mess.newdDateInfo();
            System.out.println("Calculated CPC is: " + vars.output);

        }else{
            vars.val2 = BigDecimal.valueOf(vars.val).setScale(4, RoundingMode.HALF_DOWN).doubleValue();
            Mess.newdDateInfo();
            System.out.println("Calculated CPC is: " +vars.val2);
        }
    }


    public static void valOfProfit() {
        Mess.newdDateInfo();
        System.out.println("Profit is calculating by **** minus *****");
        vars.val = vars.checkCost - vars.check2;
        vars.val2 = BigDecimal.valueOf(vars.val).setScale(4, RoundingMode.HALF_DOWN).doubleValue();
        Mess.newdDateInfo();
        System.out.println("Calculated Profit is: " +vars.val2);
        if (vars.CheckCost.contains("-")) {
            vars.val2 = -vars.val2;
            Mess.newdDateInfo();
            System.out.println("Value corrected with minus: "+vars.val2);
        }
        else{
            Mess.newdDateInfo();
            System.out.println("Value doesn't contains minus: "+vars.val2);
        }
    }

    public static void valOfConver() {
        Mess.newdDateInfo();
        System.out.println("Conversions is calculating via val of Clicks dividing CR ");
        vars.val2 = vars.valOfClicks * vars.checkCost / 100;
        vars.val2 = BigDecimal.valueOf(vars.val2).setScale(1, RoundingMode.HALF_UP).doubleValue();
        Mess.newdDateInfo();
        System.out.println("Calculated Conversions is: " +vars.val2);
    }

    public static void valOfCPT (){
        Mess.newdDateInfo();
        System.out.println("Cost Per Transaction is calculating via Cost dividing Transactions ");
        vars.val2 =  vars.checkCost / vars.valOfClicks;
        vars.val2 = BigDecimal.valueOf(vars.val2).setScale(4, RoundingMode.HALF_UP).doubleValue();
        Mess.newdDateInfo();
        System.out.println("Calculated Cost Per Transaction is: " +vars.val2);
    }

    public static void valOfCPA() {
        Mess.newdDateInfo();
        System.out.println("Profit is calculating by **** minus *****");
        vars.val = vars.check2 / vars.checkCost;
        vars.val2 = BigDecimal.valueOf(vars.val).setScale(4, RoundingMode.HALF_DOWN).doubleValue();
        Mess.newdDateInfo();
        System.out.println("Calculated Profit is: " +vars.val2);
        if (vars.CheckCost.contains("-")) {
            vars.val2 = -vars.val2;
            Mess.newdDateInfo();
            System.out.println("Value corrected with minus: "+vars.val2);
        }
        else{
            Mess.newdDateInfo();
            System.out.println("Value doesn't contains minus: "+vars.val2);
        }
    }

    public static void valOfTR() {
        vars.val = (vars.check4 / vars.valOfClicks) * 100; // Высчитывание процента
        vars.val2 = BigDecimal.valueOf(vars.val).setScale(2, RoundingMode.HALF_DOWN).doubleValue();
        if (vars.CheckCost.contains("-") && vars.CheckCost.contains("%")) {
            vars.val2 = -vars.val2;
            Mess.newdDateInfo();
            System.out.println("Value corrected with minus: " + vars.val2);
        } else {
            Mess.newdDateInfo();
            System.out.println("Value doesn't contains minus: " + vars.val2);
        }
    }

}
