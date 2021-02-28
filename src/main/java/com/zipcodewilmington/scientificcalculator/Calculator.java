package com.zipcodewilmington.scientificcalculator;
public class Calculator {
    public Calculator() {
    }
    public void drawScreen(String d){
        Console.println("");
        Console.println("|------------------------------------------------|");
        Console.println("|Quit     Clear     Set     M+     MC     MRC    |");
        Console.println("|------------------------------------------------|");
        Console.println(" Current Number: %s                               ",d);
        Console.println("|------------------------------------------------|");
        Console.println("| Add      Subtract      Multiply      Divide    |");
        Console.println("| Square   Square Root   Exponential   Inverse   |");
        Console.println("| Log      Log-1         Ln            Ln-1      |");
        Console.println("| Sine     Cosine        Tangent       Factorial |");
        Console.println("| Sine-1   Cosine-1      Tangent-1     Invert    |");
        Console.println("| cToF     fToC          LBtoKG        KGtoLB    |");
        Console.println("|          radToDeg      degToRad                |");
        Console.println("|------------------------------------------------|");
    }
    public double performOperation(String op, double num1, double num2){
        double returnAns;

        if(op.equalsIgnoreCase("add")){
            returnAns = this.addition(num1,num2);
        }
        else if(op.equalsIgnoreCase("subtract")){
            returnAns = this.subtraction(num1,num2);
        }
        else if(op.equalsIgnoreCase("multiply")){
            returnAns = this.multiply(num1, num2);
        }
        else if(op.equalsIgnoreCase("divide")){
            returnAns = this.divide(num1, num2);
        }
        else {
            returnAns = this.exponential(num1, num2);
        }

        return returnAns;
    }

    public double performOperation(String op, double num){
        double returnAns;

        if(op.equalsIgnoreCase("square")){
            returnAns = this.square(num);
        }
        else if(op.equalsIgnoreCase("square root")){
            returnAns = this.squareRoot(num);
        }
        else if(op.equalsIgnoreCase("inverse")){
            returnAns = this.inverse(num);
        }
        else if(op.equalsIgnoreCase("invert")){
            returnAns = this.invert(num);
        }
        else if(op.equalsIgnoreCase("sine")){
            returnAns = this.sine(num);
        }
        else if(op.equalsIgnoreCase("cosine")){
            returnAns = this.cosine(num);
        }
        else if(op.equalsIgnoreCase("tangent")){
            returnAns = this.tangent(num);
        }
        else if(op.equalsIgnoreCase("sine-1")){
            returnAns = this.inverseSine(num);
        }
        else if(op.equalsIgnoreCase("cosine-1")){
            returnAns = this.inverseCosine(num);
        }
        else if(op.equalsIgnoreCase("tangent-1")){
            returnAns = this.inverseTangent(num);
        }
        else if(op.equalsIgnoreCase("factorial")){
            returnAns = this.factorial(num);
        }
        else if(op.equalsIgnoreCase("log")){
            returnAns = this.log(num);
        }
        else if(op.equalsIgnoreCase("log-1")){
            returnAns = this.inverseLog(num);
        }
        else if(op.equalsIgnoreCase("ln")){
            returnAns = this.naturalLog(num);
        }
        else if(op.equalsIgnoreCase("ln-1")){
            returnAns = this.inverseNaturalLog(num);
        } else if(op.equalsIgnoreCase("fToC")){
            returnAns = this.convertFtoC(num);
        }
        //catching convert C to F
        else {
            returnAns = this.convertCtoF(num);
        }
        return returnAns;
    }

    //Conversion conditionals
    public double displayMode(double x, String y) {
        double returnAns;
        if (y.equalsIgnoreCase("switch display binary")) {
            returnAns = this.convertBinary(x);
        } else if (y.equalsIgnoreCase("switch display hexadecimal")) {
            returnAns = this.convertHex(x);
        } else if (y.equalsIgnoreCase("switch display octal")) {
            returnAns = this.convertOctal(x);
        } else if (y.equalsIgnoreCase("switch display decimal")) {
            returnAns = x;
        } else {
            //catches Switch Display
            if (x) {
                returnAns = this.convertBinary(x);
            } else if (y == this.convertBinary(x)) {
                returnAns = this.convertOctal(x);
            } else if (y == this.convertOctal(x)) {
                returnAns = this.convertHex(x);
            } else {
                //catches if it's Hex
                returnAns = x;
            }
            return returnAns;
        }
    }
    /*public double switchDisplayMode(String convert, double num) {

        double returnans;
        if (convert.equalsIgnoreCase("Switch Display binary")){
            returnans = this.convertBinary(num);
        } else if (convert.equalsIgnoreCase("switch display hex")) {
            returnans = this.convertHex(num);
        } else if (convert.equalsIgnoreCase("switch display octal")) {
            returnans = this.convertOctal(num);
        } else if (convert.equalsIgnoreCase("switch display decimal")) {
            returnans = this.convertDecimal(num);
        } else {
            returnans = num;
        }
        return returnans;
    }

    public double rotateDisplaySwitch (String convert, double num) {
        double returnans;
        if (convert.equalsIgnoreCase("switch display")) {
            if (num == this.convertDecimal(num)) {
                returnans = this.convertBinary(num);
            } else if (num == this.convertBinary(num)) {
                returnans = this.convertOctal(num);
            } else if (num == this.convertOctal(num)) {
                returnans = this.convertHex(num);
            } else if (num = this.convertHex(num)) {
                returnans = this.convertDecimal(num);
            } else {
                return returnans = num;
            }
            return returnans;
        }
    }*/

    //store, recall, and clear memory
    public double memoryUsage(String inputStr, double x) {
        double memory = 0;
        if (inputStr.equalsIgnoreCase("M+")) {
            memory = this.calcMemory(x);
        } else if (inputStr.equalsIgnoreCase("MC")){
            memory = 0;
        } else if (inputStr.equalsIgnoreCase("MRC")) {
            return memory;
        } else {
            memory = 0;
        }
        return memory;
    }


    //two variable operations
    public double addition(double x, double y){
        double ans = x + y;
        return ans;
    }

    public double subtraction(double x,double y){
        double ans = x - y;
        return ans;
    }

    public double multiply(double x,double y){
        double ans = x * y;
        return ans;
    }

    public double divide(double x,double y){
        double ans = x / y;
        return ans;
    }

    public double exponential(double x,double y){
        double ans = Math.pow(x,y);
        return ans;
    }

    //one variable operations
    public double square(double x){
        double ans = Math.pow(x,2);
        return ans;
    }

    public double squareRoot(double x){
        double ans = Math.sqrt(x);
        return ans;
    }

    public double inverse(double x){
        double ans = (1 / x);
        return ans;
    }

    public double invert(double x){
        double ans = (x * -1);
        return ans;
    }

    public double sine(double x){
        double ans = Math.sin(x);
        return ans;
    }

    public double cosine(double x){
        double ans = Math.cos(x);
        return ans;
    }

    public double tangent(double x){
        double ans = Math.tan(x);
        return ans;
    }

    public double inverseSine(double x){
        double ans = Math.asin(x);
        return ans;
    }

    public double inverseCosine(double x){
        double ans = Math.acos(x);
        return ans;
    }

    public double inverseTangent(double x){
        double ans = Math.atan(x);
        return ans;
    }

    public double toRadians(double x){
        double ans = Math.toRadians(x);
        return ans;
    }

    public double toDegrees(double x){
        double ans = Math.toDegrees(x);
        return ans;
    }

    public double factorial(double x){
        double ans = 1;
        for(int i=1;i<=x;i++){
            ans *= i;
        }
        return ans;
    }

    public double log(double x){
        double ans = Math.log10(x);
        return ans;
    }

    public double inverseLog(double x){
        double ans = Math.pow(10,x);
        return ans;
    }

    public double naturalLog(double x){
        double ans = Math.log(x);
        return ans;
    }

    public double inverseNaturalLog(double x){
        double ans = Math.exp(x);
        return ans;
    }

    private String err(){
        return "Err";
    }

    public double convertFtoC(double x) {
        double fToC = (x - 32) / 1.8;
        return fToC;
    }

    public double convertCtoF(double x) {
        double cToF = (x * 1.8) + 32;
        return cToF;
    }

    //Conversions

    public String convertBinary(double x) {
            String ans = double.toBinaryString(x);
            return ans;
    }

    public String convertHex(double x) {
            String ans = double.toHexString(x);
            return ans;
    }

    public String convertOctal(double x) {
            String ans = double.toOctalString(x);
            return ans;
    }

    /*public double convertDecimal(String x, Integer radix) {
        double ans = Integer.parseInt(x, radix);
        return ans;
    }*/

    public double calcMemory(double x) {
        double memory = x;
        return memory;
    }
}