/**
 * Created by danzygmund-felt on 4/29/17.
 * So far, only decimal and hexadecimal here.
 */

public class DisplayMode {
    private int mode;

    DisplayMode() {
        mode = 0;
    }

    public void switchDisplayMode() {
        mode++;
        mode = mode % 2;
    }

    public void switchDisplayMode(int x) {
        mode = x;
    }

    public String toDisplay(double x) {
        //this is a stub. gonna be mathy to write, hopefully.
        switch(mode) {
            case 0:
                return Double.toString(x);
            case 1:
                return Double.toHexString(x);
            default:
                return "";
    }
}