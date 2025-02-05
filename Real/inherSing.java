import java.util.*;

public class inherSing {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.fins = 4;
        f1.color = "orange";
        f1.eat();
        f1.breadth();
        System.out.println(f1.color);
        System.out.println("Fins: " + f1.fins);
    }
}

class Animals {
    String color;

    void eat() {
        System.out.println("Eats Grass");
    }

    void breadth() {
        System.out.println("Breadth Air");
    }
}

class Fish extends Animals {
    int fins;

    void swim() {
        System.out.println("Swim in Water");
    }
}