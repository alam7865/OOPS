import java.util.*;

public class getset {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        // p1.color = "Orange";
        // p1.tip = 3;
        // System.out.println(p1.color);
        // System.out.println(p1.tip);

        ////////////////////////// use get and setter //////////////////
        p1.setColor("Blue");
        p1.setTip(10);

        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
    }
}

class Pen {
    private String color;
    private int tip;

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }

    int getTip() {
        return this.tip;
    }

    String getColor() {
        return this.color;
    }
}
