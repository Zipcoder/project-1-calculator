package mozeik.gerrod;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class Square extends CalculatorOperation {

    public double getSquare(Double inputValue) {
        this.inputValue = inputValue;
        outputValue = (inputValue * inputValue);
        Display display = new Display();
        display.showOutputValue(outputValue);
        return outputValue;
    }
}
