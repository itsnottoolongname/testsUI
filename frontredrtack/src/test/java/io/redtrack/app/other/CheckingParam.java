package io.redtrack.app.other;

import io.redtrack.app.errors.Err;
import io.redtrack.app.messages.Mess;
import org.junit.Assert;
import io.redtrack.app.variable.Variables;

public class CheckingParam {

    public static Variables vars;

    public static void checkingVal() {
        if (vars.val3.equals(vars.valOfCPC)) {
            Mess.newdDateInfo();
            System.out.println("Checking value is passed. Expected is: " +vars.val3+ ". Actual is: " +vars.valOfCPC);
        } else {
            Mess.error();
            System.out.println("Checking value is failed. Expected is: " +vars.val3+ ". Actual is: " +vars.valOfCPC);
            Mess.ansi_reset();
        }
    }

    public static void checkingElement(){
        if (vars.usrnm.equals(vars.CheckParam)) {
            Mess.newdDateInfo();
            Mess.testTest();
            Mess.loginLogin();
            Mess.passedPassed();
            System.out.println("'" + vars.usrnm + "'");
        } else {
            Err.errorN1();
            System.out.println(" " + vars.CheckParam + ", but expected: " + vars.usrnm);
            Assert.assertEquals(vars.usrnm, vars.CheckParam);
        }
    }

}