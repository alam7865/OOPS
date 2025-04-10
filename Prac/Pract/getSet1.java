import java.util.*;

public class getSet1 {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        // p1.color = "Orange";
        // p1.tip = 10;

        // System.out.println(p1.color);
        // System.out.println(p1.tip);
        p1.setTip(100);
        System.out.println(p1.getTip());
    }
}

class Pen {
    private String color;
    private int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

    String getColor() {
        return color;
    }

    int getTip() {
        return tip;
    }
}
