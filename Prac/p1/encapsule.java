import java.util.*;

public class encapsule {
    public static void main(String args[]) {
        Pen P1 = new Pen();
        // P1.color = "red";
        // P1.tip = 5;
        // System.out.println(P1.color);
        // System.out.println(P1.tip);

        P1.setColor("Orange");
        P1.setTip(9);

        System.out.println(P1.getColor() + " " + P1.getTip());
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
