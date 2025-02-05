import java.util.*;

public class a2 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        // p1.color = "yellow";
        // p1.tip = 5;
        // System.out.println(p1.tip);
        // System.out.println(p1.color);

        ///////// Getter and Setter ////////////
        p1.setColor("Orange");
        p1.setTip(100);

        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
    }

}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return color;
    }

    int getTip() {
        return tip;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}
