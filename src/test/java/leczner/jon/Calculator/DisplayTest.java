package leczner.jon.Calculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jonathanleczner on 9/12/16.
 */
public class DisplayTest {
    Calculator calc = new Calculator();

    @Test
    public void clearTest() {
        calc.display.setState("Err");
        assertEquals("Err", calc.display.getState());
        calc.display.clear();
        assertEquals("0", calc.basicMathUnit.getState());
        calc.display.clear();
        assertEquals("0", calc.basicMathUnit.getState());
    }

//    @Test
//    public void showStateTest() {
//        assertEquals("0", calc.basicMathUnit.getState()); // just prints, not sure if can be tested
//        calc.display.showState();
//    }

//    @Test
//    public void selectSignificantDigitsTest() {
//        calc.basicMathUnit.add(2);
//        calc.basicMathUnit.squareRoot();
//        calc.display.setState(calc.basicMathUnit.getState());
//        calc.display.formatState();
//        assertEquals("1.41421", calc.display.getState());
//        calc.display.setSignificantDigits(1);
//        calc.display.formatState();
//        assertEquals("1", calc.display.getState());
//        calc.display.setSignificantDigits(2);
//        calc.display.formatState();
//        assertEquals("1.4", calc.display.getState());
//    }

//    @Test
//    public void roundingTest() {
//        calc.basicMathUnit.add(19.5);
//        double state = calc.basicMathUnit.divide(-2.5);
//        String displayState = String.valueOf(state);
//        calc.display.setState(displayState);
////        calc.display.formatState();
//        assertEquals("-7.8", calc.display.getState());
//        calc.display.setState("1.009999999999999948579283457");
////        calc.display.formatState();
//        assertEquals("1.001", calc.display.getState());
//        calc.display.setState("-6689502913449130307337256331784623395582254385965074044477506509003168717455670263453482004232257731880806570074163851721530028759557453823946324668047710881013169959586673277865168932426041094307840");
////        calc.display.formatState();
//        assertEquals("-668950", calc.basicMathUnit.getState());
//    }

    @Test
    public void switchDisplayModeTest1() { // no input
        calc.display.setState("2");
        calc.display.switchDisplayMode();
        assertEquals("2", calc.display.getDisplayState());
        calc.display.switchDisplayMode();
        assertEquals("10", calc.display.getDisplayState());
        calc.display.switchDisplayMode();
        assertEquals("2", calc.display.getDisplayState());
    }

    @Test
    public void switchDisplayModeTest2() { // with input
        calc.display.setState("2");
        calc.display.switchDisplayMode(Display.Mode.BINARY);
        assertEquals("10", calc.display.getDisplayState());
    }
}