package io.redtrack.app.other;

import io.redtrack.app.messages.Mess;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
import io.redtrack.app.other.ForCheckingStats;


public class ManipWithString {

    public ManipWithString(WebDriver driver) {
        //PageFactory.initElements(driver, this);
        this.driver = driver;
        //checkingStats = new ForCheckingStats(driver);
    }

    public WebDriver driver;
    public static ForCheckingStats checkingStats;
    //public String CheckCost;

    public static double checkCost, valOfClicks, val2, val, check2, check3, check4, c, b;

    public static char[] newchar;
    public static char[] copyOfRange;
    public static String copyOfRange2, valOfCPC, val3;
    public static int i = 1;
    public static int asd;


    public static void getSometoDouble() {
        Mess.newdDateInfo();
        System.out.println("Converting 'String' to 'double'");
        valOfClicks = (Double.parseDouble(checkingStats.CheckCost));
        Mess.newdDateInfo();
        System.out.println("'String' to 'double' successful converted");
        Mess.newdDateInfo();
        System.out.println("Current 'double' value is: " +valOfClicks);
    }



    public static void stringToDouble() {
        if (checkingStats.CheckCost.contains("-")&&checkingStats.CheckCost.contains("$")){
            newchar = new char[50];
            newchar = checkingStats.CheckCost.toCharArray();
            copyOfRange = new char[50];
            Mess.newdDateInfo();
            System.out.println("Array contains minus value. Current array has " +newchar.length+ " elements");
            for (i = 1; i != newchar.length; i++) {
                System.arraycopy(newchar, 2, copyOfRange, 0, i -1);
            }
            //validArrayLength();
            Mess.newdDateInfo();
            System.out.println("New length is: " +asd+ ". Created array for " +asd+ " elements");
            copyOfRange2 = new String();
            copyOfRange2 = copyOfRange.toString();
            String stringCopyofRange = String.valueOf(copyOfRange);
            checkCost = (Double.parseDouble(stringCopyofRange));

        } else
        {

            if (checkingStats.CheckCost.contains("-") && checkingStats.CheckCost.contains("%")) {
                newchar = new char[50];
                newchar = checkingStats.CheckCost.toCharArray();
                copyOfRange = new char[50];
                Mess.newdDateInfo();
                System.out.println("Current array has " + newchar.length + " elements");
                for (i = 1; i != newchar.length; i++) {
                    System.arraycopy(newchar, 0, copyOfRange, 0, i);
                }
                //validArrayLength();
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
                if(checkingStats.CheckCost.contains("-")&&checkingStats.CheckCost.contains("%")){
                    checkCost = -checkCost;
                }
            } else {
                if (checkingStats.CheckCost.contains("-")) {
                    newchar = new char[50];
                    newchar = checkingStats.CheckCost.toCharArray();
                    copyOfRange = new char[50];
                    Mess.newdDateInfo();
                    System.out.println("Array contains minus value. Current array has " + newchar.length + " elements");
                    for (i = 1; i != newchar.length; i++) {
                        System.arraycopy(newchar, 2, copyOfRange, 0, i - 1);
                    }
                    //validArrayLength();
                    Mess.newdDateInfo();
                    System.out.println("New length is: " + asd + ". Created array for " + asd + " elements");
                    copyOfRange2 = new String();
                    copyOfRange2 = copyOfRange.toString();
                    String stringCopyofRange = String.valueOf(copyOfRange);
                    checkCost = (Double.parseDouble(stringCopyofRange));
                } else {
                    if (checkingStats.CheckCost.contains("%")) {
                        newchar = new char[50];
                        newchar = checkingStats.CheckCost.toCharArray();
                        copyOfRange = new char[50];
                        Mess.newdDateInfo();
                        System.out.println("Current array has " + newchar.length + " elements");
                        for (i = 1; i != newchar.length; i++) {
                            System.arraycopy(newchar, 0, copyOfRange, 0, i);
                        }
                        //validArrayLength();
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
                        if (!checkingStats.CheckCost.contains("-") && !checkingStats.CheckCost.contains("$")) {
                            newchar = new char[50];
                            newchar = checkingStats.CheckCost.toCharArray();
                            copyOfRange = new char[50];
                            Mess.newdDateInfo();
                            System.out.println("Current array has " + newchar.length + " elements");
                            for (i = 1; i != newchar.length; i++) {
                                System.arraycopy(newchar, 0, copyOfRange, 0, i + 1);
                            }
                            //validArrayLength();
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
                            if (!checkingStats.CheckCost.contains("-")) {
                                newchar = new char[50];
                                newchar = checkingStats.CheckCost.toCharArray();
                                copyOfRange = new char[50];
                                Mess.newdDateInfo();
                                System.out.println("Current array has " + newchar.length + " elements");
                                for (i = 1; i != newchar.length; i++) {
                                    System.arraycopy(newchar, 1, copyOfRange, 0, i);
                                }
                                //validArrayLength();
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
                                if (checkingStats.CheckCost.contains("$")) {
                                    newchar = new char[50];
                                    newchar = checkingStats.CheckCost.toCharArray();
                                    copyOfRange = new char[50];
                                    Mess.newdDateInfo();
                                    System.out.println("Current array has " + newchar.length + " elements");
                                    for (i = 1; i != newchar.length; i++) {
                                        System.arraycopy(newchar, 1, copyOfRange, 0, i);
                                    }
                                    //validArrayLength();
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


    public static void doubleToString() {
        if (checkingStats.CheckCost.contains("-") && checkingStats.CheckCost.contains("%")) {
            Mess.newdDateInfo();
            System.out.println("checking value before correcting " + checkCost);
            check3 = -checkCost;
            Mess.newdDateInfo();
            System.out.println("Converting 'double' to 'String' with minus value");
            valOfCPC = String.valueOf(check3);
            Mess.newdDateInfo();
            System.out.println("'Double' to 'String' with minus value successful converted");
        } else {

            if (checkingStats.CheckCost.contains("-")) {
                Mess.newdDateInfo();
                System.out.println("checking value before correcting " + checkCost);
                check3 = -checkCost;
                Mess.newdDateInfo();
                System.out.println("Converting 'double' to 'String' with minus value");
                valOfCPC = String.valueOf(check3);
                Mess.newdDateInfo();
                System.out.println("'Double' to 'String' with minus value successful converted");
            } else {
                if (!checkingStats.CheckCost.contains("-")) {
                    Mess.newdDateInfo();
                    System.out.println("Converting 'double' to 'String'");
                    valOfCPC = String.valueOf(checkCost);
                    Mess.newdDateInfo();
                    System.out.println("'Double' to 'String' successful converted " + valOfCPC);
                } else {
                    Mess.error();
                    System.out.println("doubleToString isn't working. Need hotfix");
                }
            }
        }
    }







}