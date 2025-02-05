import java.util.*;

public class multiLevelInher {
    public static void main(String[] args) {
        Dogs Labrador = new Dogs();
        Labrador.eat();
        Labrador.walks();
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

class Mammals extends Animals {
    void walks() {
        System.out.println("Walks on 4 legs");
    }
}

class Dogs extends Mammals {
    String breed;
}
