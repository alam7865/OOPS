import java.util.*;

public class basic {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        // p1.color = "red";
        p1.SetColor("Men");
        System.out.println(p1.getColor());
    }
}

class Pen {
    String color;
    int tip;

    void SetColor(String newColor) {
        color = newColor;
    }

    void SetTip(int newTip) {
        tip = newTip;
    }

    String getColor() {
        return color;
    }

    int getTip() {
        return tip;
    }
}
