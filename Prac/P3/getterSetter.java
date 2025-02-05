import java.util.*;

public class getterSetter {
    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.color = "REd";
        // p1.tip = 10;
        // //////////////////////////
        // p1.changeColor("Orange");
        // p1.changeTip(15);
        // System.out.println(p1.color);
        // System.out.println(p1.tip);

        ////////////////////////////////////////////
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setTip(21);

        System.out.println(p1.getTip());
        System.out.println(p1.getColor());
    }
}

// class Pen {
// String color;
// int tip;

// void changeColor(String newString) {
// color = newString;
// }

// void changeTip(int newTip) {
// tip = newTip;
// }
// }

/////////////////////// getter setter /////////////////////////

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
