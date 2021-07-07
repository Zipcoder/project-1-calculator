package com.zipcodewilmington.scientificcalculator;

public class InputChecker extends Calculator {
    static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            System.out.println("ERROR: Enter a valid number.");
            return false;
        }
    }
}