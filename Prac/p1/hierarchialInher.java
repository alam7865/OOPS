import java.util.*;

public class hierarchialInher {
    public static void main(String[] args) {
        Fish sital = new Fish();
        sital.eat();
        sital.swim();
    }
}

class Animals {
    void eat() {
        System.out.println("They eats small things");
    }

    void bread() {
        System.out.println("They Breadth Oxygen");
    }
}

class Birds extends Animals {
    void fly() {
        System.out.println("They fly in air");
    }
}

class Fish extends Animals {
    void swim() {
        System.out.println("They swim in water");
    }
}
