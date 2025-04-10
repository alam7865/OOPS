import java.util.*;

public class inheritence {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.breadth();
        d1.walk();

    }
}

class Animals {
    void eat() {
        System.out.println("They uses to Eat");
    }

    void breadth() {
        System.out.println("They Uses to Breadth");
    }
}

class Dog extends Animals {
    void walk() {
        System.out.println("They uses to Walk on 4 legs");
    }
}
