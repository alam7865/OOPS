import java.util.*;

public class copyCon {
    public static void main(String[] args) {
        // Pen p1 = new Pen("Orange");
        Pen p1 = new Pen();
        p1.color = "Orange";
        p1.tip = 15;
        System.out.println(p1.color);
        System.out.println(p1.tip);
        System.out.println();
        Pen p2 = new Pen(p1);
        p2.tip = 20;
        System.out.println(p2.color);
        System.out.println(p2.tip);
        System.out.println(p1.tip);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        this.color = newColor;
    }

    String getColor() {
        return this.color;
    }

    Pen() {
        System.out.println("Constructure p1 is called");
    }

    Pen(Pen p1) {
        this.color = p1.color;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }

    int getTip() {
        return this.tip;
    }
}