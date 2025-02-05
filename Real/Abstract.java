import java.util.*;

public class Abstract {
    public static void main(String[] args) {
        Horse 
    }
}

abstract class Animals {
    void eat() {
        System.out.println("Animals Eats");
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
        System.out.println("walk On 2 Legs");
    }
}