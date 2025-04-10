import java.util.*;

public class Get {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        // p1.color = "Orange";
        p1.setColor("Orange");
        System.out.println(p1.getColor());
    }
}

class Pen {
    private String color;
    private int tip;

    void setColor(String newColor) {
        this.color = newColor;
    }

    String getColor() {
        return this.color;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }

    int getTip() {
        return this.tip;
    }
}