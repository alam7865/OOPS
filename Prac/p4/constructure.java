import java.util.*;

public class constructure {
    public static void main(String[] args) {
        // Pen p1 = new Pen("Orange");
        Pen p1 = new Pen();
        System.out.println(p1.color);
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

    // Pen(String color) {
    // this.color = color;
    // }

    Pen() {
        System.out.println("Hello Alam");
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }

    int getTip() {
        return this.tip;
    }
}