import java.util.*;

public class pencil {
    public static void main(String[] args) {
        Pen1 p1 = new Pen1();
        p1.tip = 34;
        p1.color = "orange";

        p1.setColor("Blue");
        System.out.println(p1.getTip());
        System.out.println(p1.color);

    }
}

class Pen1 {
    int tip;
    String color;

    // get
    int getTip() {
        return tip;
    }

    String getColor() {
        return color;
    }

    // modify

    void setTip(int newTip) {
        tip = newTip;
    }

    void setColor(String newColor) {
        color = newColor;
    }
}