import java.util.*;

public class Abstraction {
    public static void main(String[] args) {
        Horse p1 = new Horse();
        p1.eats();
        p1.walk();

        Chicken c1 = new Chicken();
        c1.eats();
        c1.walk();
    }
}

abstract class Animals {
    void eats() {
        System.out.println("Animals Eats");
    }

    abstract void walk();
}

class Horse extends Animals {
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animals {
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}
