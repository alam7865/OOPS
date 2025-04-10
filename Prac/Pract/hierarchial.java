import java.util.*;

public class hierarchial {
    public static void main(String[] args) {
        // Fish f1 = new Fish();
        // f1.eat();
        // f1.breadth();
        // f1.swim();

        Bird b1 = new Bird();
        b1.swim();
    }
}

class Animals {
    void eat() {
        System.out.println("They uses to Eats");
    }

    void breadth() {
        System.out.println("They uses to Breadth");
    }
}

class Fish extends Animals {
    void swim() {
        System.out.println("They swim in water");
    }
}

class Bird extends Animals {
    void fly() {
        System.out.println("They Fly in sky");
    }
}

class Mammals extends Animals {
    void walk() {
        System.out.println("They walk on legs");
    }
}