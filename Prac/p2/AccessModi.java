import java.util.*;

public class AccessModi {
    public static void main(String[] args) {
        cc c1 = new cc();
        // c1.method1(); // within class

        ////////////////////// within Package /////////////////////
        // System.out.println(c1.a);
        // System.out.println(c1.b);
        // System.out.println(c1.c);
        // System.out.println(c1.d);

        /////////////////////// within subclass ///////////////////
        Child child = new Child();
        child.parent();
    }
}

class cc {
    private int a = 10;
    int b = 20;
    protected int c = 30;
    public int d = 40;

    void method1() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class Child extends cc {
    public void parent() {
        // System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}