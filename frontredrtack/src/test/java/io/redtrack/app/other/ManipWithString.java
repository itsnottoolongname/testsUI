package io.redtrack.app.other;

import io.redtrack.app.messages.Mess;
import io.redtrack.app.variable.Variables;
import java.text.DecimalFormat;

public class ManipWithString {

    public static Variables vars;

    public static void getSometoDouble() {
        Mess.newdDateInfo();
        System.out.println("Converting 'String' to 'double'");
        vars.valOfClicks = (Double.parseDouble(vars.CheckCost));
        Mess.newdDateInfo();
        System.out.println("'String' to 'double' successful converted");
        Mess.newdDateInfo();
        System.out.println("Current 'double' value is: " +vars.valOfClicks);
    }

    public static void validArrayLength(){
        vars.asd = vars.newchar.length - 1;
    }

    public static void stringToDouble() {
        if (vars.CheckCost.contains("-")&&vars.CheckCost.contains("$")){
            vars.newchar = new char[50];
            vars.newchar = vars.CheckCost.toCharArray();
            vars.copyOfRange = new char[50];
            Mess.newdDateInfo();
            System.out.println("Array contains minus value. Current array has " +vars.newchar.length+ " elements");
            for (vars.i = 1; vars.i != vars.newchar.length; vars.i++) {
                System.arraycopy(vars.newchar, 2, vars.copyOfRange, 0, vars.i -1);
            }
            validArrayLength();
            Mess.newdDateInfo();
            System.out.println("New length is: " +vars.asd+ ". Created array for " +vars.asd+ " elements");
            vars.copyOfRange2 = new String();
            vars.copyOfRange2 = vars.copyOfRange.toString();
            String stringCopyofRange = String.valueOf(vars.copyOfRange);
            vars.checkCost = (Double.parseDouble(stringCopyofRange));
        }
        else {
            if (vars.CheckCost.contains("-") && vars.CheckCost.contains("%")) {
                vars.newchar = new char[50];
                vars.newchar = vars.CheckCost.toCharArray();
                vars.copyOfRange = new char[50];
                Mess.newdDateInfo();
                System.out.println("Current array has " + vars.newchar.length + " elements");
                for (vars.i = 1; vars.i != vars.newchar.length; vars.i++) {
                    System.arraycopy(vars.newchar, 0, vars.copyOfRange, 0, vars.i);
                }
                validArrayLength();
                Mess.newdDateInfo();
                System.out.println("New length is: " + vars.asd + ". Created array for " + vars.asd + " elements");
                vars.copyOfRange2 = new String();
                vars.copyOfRange2 = vars.copyOfRange.toString();
                String stringCopyofRange = String.valueOf(vars.copyOfRange);
                Mess.newdDateInfo();
                System.out.println("Converting 'String' to 'double'");
                vars.checkCost = (Double.parseDouble(stringCopyofRange));
                Mess.newdDateInfo();
                System.out.println("'String' to 'double' successful converted");
                Mess.newdDateInfo();
                System.out.println("Current 'double' value is: " +vars.checkCost);
                if(vars.CheckCost.contains("-")&&vars.CheckCost.contains("%")){
                    vars.checkCost = -vars.checkCost;
                }
            }
            xelse {
                if (vars.CheckCost.contains("-")) {
                    vars.newchar = new char[50];
                    vars.newchar = vars.CheckCost.toCharArray();
                    vars.copyOfRange = new char[50];
                    Mess.newdDateInfo();
                    System.out.println("Array contains minus value. Current array has " + vars.newchar.length + " elements");
                    for (vars.i = 1; vars.i != vars.newchar.length; vars.i++) {
                        System.arraycopy(vars.newchar, 2, vars.copyOfRange, 0, vars.i - 1);
                    }
                    validArrayLength();
                    Mess.newdDateInfo();
                    System.out.println("New length is: " + vars.asd + ". Created array for " + vars.asd + " elements");
                    vars.copyOfRange2 = new String();
                    vars.copyOfRange2 = vars.copyOfRange.toString();
                    String stringCopyofRange = String.valueOf(vars.copyOfRange);
                    vars.checkCost = (Double.parseDouble(stringCopyofRange));
                }
                else {
                    if (vars.CheckCost.contains("%")) {
                        vars.newchar = new char[50];
                        vars.newchar = vars.CheckCost.toCharArray();
                        vars.copyOfRange = new char[50];
                        Mess.newdDateInfo();
                        System.out.println("Current array has " + vars.newchar.length + " elements");
                        for (vars.i = 1; vars.i != vars.newchar.length; vars.i++) {
                            System.arraycopy(vars.newchar, 0, vars.copyOfRange, 0, vars.i);
                        }
                        validArrayLength();
                        Mess.newdDateInfo();
                        System.out.println("New length is: " + vars.asd + ". Created array for " + vars.asd + " elements");
                        vars.copyOfRange2 = new String();
                        vars.copyOfRange2 = vars.copyOfRange.toString();
                        String stringCopyofRange = String.valueOf(vars.copyOfRange);
                        Mess.newdDateInfo();
                        System.out.println("Converting 'String' to 'double'");
                        vars.checkCost = (Double.parseDouble(stringCopyofRange));
                        Mess.newdDateInfo();
                        System.out.println("'String' to 'double' successful converted");
                        Mess.newdDateInfo();
                        System.out.println("Current 'double' value is: " + vars.checkCost);
                    }
                    else {
                        if (!vars.CheckCost.contains("-") && !vars.CheckCost.contains("$")) {
                            vars.newchar = new char[50];
                            vars.newchar = vars.CheckCost.toCharArray();
                            vars.copyOfRange = new char[50];
                            Mess.newdDateInfo();
                            System.out.println("Current array has " + vars.newchar.length + " elements");
                            for (vars.i = 1; vars.i != vars.newchar.length; vars.i++) {
                                System.arraycopy(vars.newchar, 0, vars.copyOfRange, 0, vars.i + 1);
                            }
                            validArrayLength();
                            Mess.newdDateInfo();
                            System.out.println("New length is: " + vars.asd + ". Created array for " + vars.asd + " elements");
                            vars.copyOfRange2 = new String();
                            vars.copyOfRange2 = vars.copyOfRange.toString();
                            String stringCopyofRange = String.valueOf(vars.copyOfRange);
                            Mess.newdDateInfo();
                            System.out.println("Converting 'String' to 'double'");
                            vars.checkCost = (Double.parseDouble(stringCopyofRange));
                            Mess.newdDateInfo();
                            System.out.println("'String' to 'double' successful converted");
                            Mess.newdDateInfo();
                            System.out.println("Current 'double' value is: " + vars.checkCost);
                        }
                        else {
                            if (!vars.CheckCost.contains("-")) {
                                vars.newchar = new char[50];
                                vars.newchar = vars.CheckCost.toCharArray();
                                vars.copyOfRange = new char[50];
                                Mess.newdDateInfo();
                                System.out.println("Current array has " + vars.newchar.length + " elements");
                                for (vars.i = 1; vars.i != vars.newchar.length; vars.i++) {
                                    System.arraycopy(vars.newchar, 1, vars.copyOfRange, 0, vars.i);
                                }
                                validArrayLength();
                                Mess.newdDateInfo();
                                System.out.println("New length is: " + vars.asd + ". Created array for " + vars.asd + " elements");
                                vars.copyOfRange2 = new String();
                                vars.copyOfRange2 = vars.copyOfRange.toString();
                                String stringCopyofRange = String.valueOf(vars.copyOfRange);
                                Mess.newdDateInfo();
                                System.out.println("Converting 'String' to 'double'");
                                vars.checkCost = (Double.parseDouble(stringCopyofRange));
                                Mess.newdDateInfo();
                                System.out.println("'String' to 'double' successful converted");
                                Mess.newdDateInfo();
                                System.out.println("Current 'double' value is: " + vars.checkCost);
                            }
                            else {
                                if (vars.CheckCost.contains("$")) {
                                    vars.newchar = new char[50];
                                    vars.newchar = vars.CheckCost.toCharArray();
                                    vars.copyOfRange = new char[50];
                                    Mess.newdDateInfo();
                                    System.out.println("Current array has " + vars.newchar.length + " elements");
                                    for (vars.i = 1; vars.i != vars.newchar.length; vars.i++) {
                                        System.arraycopy(vars.newchar, 1, vars.copyOfRange, 0, vars.i);
                                    }
                                    validArrayLength();
                                    Mess.newdDateInfo();
                                    System.out.println("New length is: " + vars.asd + ". Created array for " + vars.asd + " elements");
                                    vars.copyOfRange2 = new String();
                                    vars.copyOfRange2 = vars.copyOfRange.toString();
                                    String stringCopyofRange = String.valueOf(vars.copyOfRange);
                                    Mess.newdDateInfo();
                                    System.out.println("Converting 'String' to 'double'");
                                    vars.checkCost = (Double.parseDouble(stringCopyofRange));
                                    Mess.newdDateInfo();
                                    System.out.println("'String' to 'double' successful converted");
                                    Mess.newdDateInfo();
                                    System.out.println("Current 'double' value is: " + vars.checkCost);
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


    public static void doubleToString() {
        if (vars.CheckCost.contains("-") && vars.CheckCost.contains("%")) {
            Mess.newdDateInfo();
            System.out.println("checking value before correcting " + vars.checkCost);
            vars.check3 = -vars.checkCost;
            Mess.newdDateInfo();
            System.out.println("Converting 'double' to 'String' with minus value");
            vars.valOfCPC = String.valueOf(vars.check3);
            Mess.newdDateInfo();
            System.out.println("'Double' to 'String' with minus value successful converted");
        } else {
            if (vars.CheckCost.contains("-")) {
                Mess.newdDateInfo();
                System.out.println("checking value before correcting " + vars.checkCost);
                vars.check3 = -vars.checkCost;
                Mess.newdDateInfo();
                System.out.println("Converting 'double' to 'String' with minus value");
                vars.valOfCPC = String.valueOf(vars.check3);
                Mess.newdDateInfo();
                System.out.println("'Double' to 'String' with minus value successful converted");
            } else {
                if (!vars.CheckCost.contains("-")) {
                    Mess.newdDateInfo();
                    System.out.println("Converting 'double' to 'String'");
                    vars.valOfCPC = String.valueOf(vars.checkCost);
                    Mess.newdDateInfo();
                    System.out.println("'Double' to 'String' successful converted " + vars.valOfCPC);
                } else {
                    Mess.error();
                    System.out.println("doubleToString isn't working. Need hotfix");
                }
            }
        }
    }


    public static void checkingDecimal() {
        if (vars.checkCost < 0.001) {
            Mess.newdDateInfo();
            System.out.println("Correcting decimal... Current value is: " + vars.checkCost);
            DecimalFormat formatter = new DecimalFormat("0.0000");
            vars.valOfCPC = formatter.format(vars.checkCost);
            Mess.newdDateInfo();
            System.out.println("Correcting decimal finished... Corrected value is: " + vars.valOfCPC);
        } else {
            doubleToString();
        }
    }


}
