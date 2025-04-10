import java.util.*;

public class hierarchialInher {
    public static void main(String[] args) {
        Humans h1 = new Humans();
        h1.walk();
        Fish f1 = new Fish();
        f1.Swim();
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

class Humans extends Animals {
    void walk() {
        System.out.println("They uses to Walk");
    }
}

class Fish extends Animals {
    void Swim() {
        System.out.println("They Uses to Swim");
    }
}