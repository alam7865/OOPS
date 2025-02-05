import java.util.*;

public class a1 {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        // p1.color = "Blue";
        // p1.tip = 50;

        p1.chColor("Golden");
        p1.chTip(121);
        System.out.println(p1.tip);
        System.out.println(p1.color);
    }

}

class Pen {
    String color;
    int tip;

    void chColor(String newColor) {
        color = newColor;
    }

    void chTip(int newTip) {
        tip = newTip;
    }
}
