package io.redtrack.app.other;

import io.redtrack.app.messages.Mess;
import io.redtrack.app.variable.Variables;

public class RenewingVarsVals {

    public static Variables vars;

    public static void renewVal() {
        if (vars.val < 0.001) {
            Mess.newdDateInfo();
            System.out.println("Re-newing Val");
            vars.val3 = vars.output;
            Mess.newdDateInfo();
            System.out.println("Val is re-newed");
            Mess.newdDateInfo();
            System.out.println("Result of new value is: " + vars.val3);
        }
        else{
            Mess.newdDateInfo();
            System.out.println("Re-newing Val");
            vars.val3 = String.valueOf(vars.val2);
            Mess.newdDateInfo();
            System.out.println("Val is re-newed");
            Mess.newdDateInfo();
            System.out.println("Result of new value is: " + vars.val3);
        }
    }

    public static void renewVar() {
        if(vars.CheckCost.contains("-")&&vars.CheckCost.contains("$")){
            Mess.newdDateInfo();
            System.out.println("Re-newing Var");
            vars.check4 = vars.checkCost;
            Mess.newdDateInfo();
            System.out.println("Var is re-newed. Current Var is: "+vars.check4);

        }else {
            Mess.newdDateInfo();
            System.out.println("Re-newing Var");
            vars.check2 = vars.checkCost;
            Mess.newdDateInfo();
            System.out.println("Var is re-newed. Current Var is: " + vars.check2);
        }
    }

    public static void renewVar2() {
        Mess.newdDateInfo();
        System.out.println("Re-newing Var2");
        vars.check4 = vars.valOfClicks;
        Mess.newdDateInfo();
        System.out.println("Var2 is re-newed. Current Var2 is: "+vars.check4);
    }

    public static void renevVar4(){
        vars.valOfClicks = vars.checkCost;
    }

}