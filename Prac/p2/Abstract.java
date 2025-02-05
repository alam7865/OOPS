import java.util.*;

public class Abstract {
    public static void main(String[] args) {
        Deer d1 = new Deer();
        d1.walk();
        Chicken c1 = new Chicken();
        c1.walk();
    }
}

abstract class Animals {
    void eats() {
        System.out.println("They Eats Plants and Animals");
    }

    abstract void walk();
}

class Deer extends Animals {
    void walk() {
        System.out.println("They Walk on 4 legs");
    }
}

class Chicken extends Animals {
    void walk() {
        System.out.println("They Walk on 2 legs");
    }
}