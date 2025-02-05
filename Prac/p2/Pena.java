import java.util.*;

public class Pena {
    public static void main(String[] args) {
        Pen1 p1 = new Pen1();
        p1.tip = 34;
        System.out.println(p1.tip);
    }
}

class Pen1 {
    int tip;
    String color;

    // get
    void getTip() {
        System.out.println("Tip Lrngth: " + tip);
    }
}