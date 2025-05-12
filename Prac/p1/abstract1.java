import java.util.*;

public class abstract1 {
    public static void main(String args[]) {
        Horse h1 = new Horse();
        h1.walk();
        Chicken c1 = new Chicken();
        c1.walk();
    }
}

abstract class Animals {
    void eat() {
        System.out.println("They uses to eats");
    }

    abstract void walk();
}

class Horse extends Animals {
    void walk() {
        System.out.println("They uses to walk on 4 legs");
    }
}

class Chicken extends Animals {
    void walk() {
        System.out.println("They uses to walk on 2 legs");
    }
}
