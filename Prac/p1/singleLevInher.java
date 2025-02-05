import java.util.*;

public class singleLevInher {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.fins = 2;
        System.out.println(f1.fins);
        f1.eat();
        f1.breadth();
        f1.swim();
    }
}

class Animals {
    void eat() {
        System.out.println("Eats samall Animals");
    }

    void breadth() {
        System.out.println("Breadth Oxygen");
    }
}

class Fish extends Animals {
    int fins;

    void swim() {
        System.out.println("Swim in water");
    }
}
