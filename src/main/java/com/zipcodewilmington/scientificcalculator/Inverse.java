package com.zipcodewilmington.scientificcalculator;

public class Inverse {
    private double value1;

    public Inverse(){
    }

    public Double inverse(double value){
        if(value == 0){
            System.out.println("ERROR: Cannot have an inverse of 0.");
            return null;
        } else {
            return 1/value;
        }
    }
}