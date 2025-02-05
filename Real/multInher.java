import java.util.*;

public class multInher {
    public static void main(String[] args) {
        Dog f1 = new Dog();
        f1.eat();
        f1.breadh();
        f1.legs();
        f1.behaviour();
    }
}

class Animals {
    void eat() {
        System.out.println("Eat Grass");
    }

    void breadh() {
        System.out.println("Breadth Air");
    }
}

class Mammals extends Animals {
    void legs() {
        System.out.println("Walk on 4 Legs");
    }
}

class Dog extends Mammals {
    void behaviour() {
        System.out.println("Friendly Behaviour");
    }
}