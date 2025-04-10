import java.util.*;

public class singlelevel {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.fins = 4;
        f1.color = "blue";
        System.out.println(f1.fins);
        System.out.println(f1.color);
        f1.eat();
        f1.breadth();
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("Animals eats");
    }

    void breadth() {
        System.out.println("Breadth oxygen");
    }
}

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swim in water");
    }
}
