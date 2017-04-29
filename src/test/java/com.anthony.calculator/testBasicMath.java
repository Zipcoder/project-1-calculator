package com.anthony.calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by anthonyjones on 4/28/17.
 */
public class testBasicMath {

    @Test
    public void testAdd() {
        //given
        double number1 = 4;
        double number2 = 5;
        double expectedSum = number1 + number2;
        BasicMath basicmather = new BasicMath();

        //when
        double actualSum = basicmather.add(number1, number2);

        //then
        Assert.assertEquals(expectedSum, actualSum, 0);

    }

    @Test
    public void testSubtract() {
        //given
        double number1 = 4;
        double number2 = 5;
        double expectedSum = number1 - number2;
        BasicMath basicmather = new BasicMath();

        //when
        double actualDifference = basicmather.subtract(number1, number2);

        //then
        Assert.assertEquals(expectedSum, actualDifference, 0);
    }

    @Test
    public void testMultiply() {
        //given
        double number1 = 4;
        double number2 = 5;
        double expectedSum = number1 * number2;
        BasicMath basicmather = new BasicMath();

        //when
        double actualProduct = basicmather.multiply(number1, number2);

        //then
        Assert.assertEquals(expectedSum, actualProduct, 0);
    }

    @Test
    public void testDivide() {
        //given
        double number1 = 4;
        double number2 = 5;
        double expectedSum = number1 / number2;
        BasicMath basicmather = new BasicMath();

        //when
        double actualQuotient = basicmather.divide(number1, number2);

        //then
        Assert.assertEquals(expectedSum, actualQuotient, 1);
    }

    @Test
    public void testDivideByZero() {
        //given
        double number1 = 4;
        double number2 = 0;
        double expectedSum = number1 / number2;
        BasicMath basicmather = new BasicMath();

        //when
        double actualQuotient = basicmather.divide(number1, number2);

        //then
        Assert.assertTrue(Double.isNaN(actualQuotient));
    }

    @Test
    public void testCalcSqrRoot() {
        //given
        double number1 = 4;
        double expectedSum = 2;
        BasicMath basicmather = new BasicMath();

        //when
        double actualRoot = basicmather.calcSqrRoot(number1);

        //then
        Assert.assertEquals(expectedSum, actualRoot, 1);
    }

    @Test
    public void testCalcSquared() {
        //given
        double number1 = 4;
        double expectedSum = 16;
        BasicMath basicmather = new BasicMath();

        //when
        double actualExponent = basicmather.calcSqrRoot(number1);

        //then
        Assert.assertEquals(expectedSum, actualExponent, 1);
    }

    @Test
    public void TestCalcFactorial() {
        //given
        double number1 = 4;
        double expectedSum = 24;
        BasicMath basicmather = new BasicMath();

        //when
        double actualFactorial = basicmather.calcFactorial(number1);

        //then
        Assert.assertEquals(expectedSum, actualFactorial, 1);
    }


    @Test
    public void TestCalcVariableExponent(){
        //given
        

    }


}
