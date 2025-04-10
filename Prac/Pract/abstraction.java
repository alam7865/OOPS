import java.util.*;

public class abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
    }
}

abstract class Animals {
    void eats() {
        System.out.println("They uses to Eats");
    }

    abstract void walk();
}

class Horse extends Animals {
    void walk() {
        System.out.println("Walk on 4 legs");
    }
}

class Chicken extends Animals {
    void walk() {
        System.out.println("Walk on 2 legs");
    }
}