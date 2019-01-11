package io.redtrack.app.other;

import io.redtrack.app.errors.Err;
import io.redtrack.app.messages.Mess;
import io.redtrack.app.tests.RedtrackStats;
import net.bytebuddy.implementation.bytecode.Throw;
import org.apache.log4j.Logger;
import org.junit.Assert;
import io.redtrack.app.variable.Variables;
import org.junit.ComparisonFailure;

import java.io.FileWriter;
import java.io.IOException;

public class CheckingParam {

    public static Variables vars;
    public static final Logger logger = Logger.getLogger(CheckingParam.class.getCanonicalName());
    public static void checkingVal() {
        try {
            Assert.assertEquals(vars.val3, vars.valOfCPC);
            logger.info("Checking value Expected is: " +vars.val3+ ". Actual is: " +vars.valOfCPC);
        }
        catch(ComparisonFailure e){
            logger.error("Error "+e.getMessage());
        }
        catch(AssertionError e){
            logger.error("Assertion error: "+e.getMessage());
        }
    }

    public static void checkingElement(){
        try{
        Assert.assertEquals(vars.usrnm, vars.CheckParam);
        logger.info("Checking element Expected is: "+vars.usrnm+". Actual is: "+vars.CheckParam);
        }
        catch(ComparisonFailure e){
            logger.error("Error "+e.getMessage());
        }
        catch(AssertionError e){
            logger.error("Assertion error: "+e.getMessage());
        }


                /*if (vars.usrnm.equals("123")) {
                Mess.newdDateInfo();
                Mess.testTest();
                Mess.loginLogin();
                Mess.passedPassed();

                System.out.println("'" + vars.usrnm + "'");
            } else(Exception) {
                    logger.error("Login failed" );
                    Err.errorN1();
                    System.out.println(" " + vars.CheckParam + ", but expected: " + vars.usrnm);
                    Assert.assertEquals(vars.usrnm, vars.CheckParam);

            }
            */
        }

    }