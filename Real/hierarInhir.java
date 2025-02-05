import java.util.*;

public class hierarInhir {
    public static void main(String[] args) {
        Fish d1 = new Fish();
        d1.breadth();
        d1.swim();
    }
}

class Animals {
    void eat() {
        System.out.println("Eat Grass");
    }

    void breadth() {
        System.out.println("Breadth Air");
    }
}

class Fish extends Animals {
    void swim() {
        System.out.println("Swim in water");
    }
}

class Birds extends Animals {
    void Fly() {
        System.out.println("Fly in Air");
    }
}

class Mammals extends Animals {
    void walk() {
        System.out.println("Walk in Land");
    }
}