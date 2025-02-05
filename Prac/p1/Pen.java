import java.util.*;

public class Pen {
    public static void main(String[] args) {
        Pen1 p1 = new Pen1();
        p1.color = "Orange";
        p1.setColor("Green");
        // p1.length = 100;
        System.out.println(p1.length);
    }
}

class Pen1 {
    int length = 120;
    String color;

    int getLength() {
        return length;
    }

    String getColor() {
        return color;
    }

    // set

    void setLength(int NewLength) {
        length = NewLength;
    }

    void setColor(String newColor) {
        color = newColor;
    }
}